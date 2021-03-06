package me.camerongray.teamlocker.client.ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import me.camerongray.teamlocker.client.core.User;
import me.camerongray.teamlocker.client.net.NetworkException;
import me.camerongray.teamlocker.client.net.ServerProvidedException;
import me.camerongray.teamlocker.client.utils.UIHelpers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by camerong on 20/05/17.
 */
public class UserForm_Add extends UserForm {
    @FXML GridPane gridPaneControl;
    @FXML StackPane stackPaneRoot;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        btnPrimary.setText("Add User");
    }

    // TODO: Display suitable message and close dialog when user creation succeeds
    @FXML
    void btnPrimary_Click(ActionEvent event) throws IOException, NetworkException, ServerProvidedException {
        if (!txtPassword.getText().equals(txtPasswordConfirm.getText())) {
            showPasswordMismatchAlert();
            return;
        }

        if (txtPassword.getText().length() == 0) {
            showPasswordUnsetAlert();
            return;
        }

        SpinnerTask<User> task = new SpinnerTask<User>(stackPaneRoot, gridPaneControl) {
            @Override
            protected User call() throws Exception {
                updateMessage("Generating user...");

                // TODO: Should we be accessing the UI from within this task?
                User user = User.createNew(txtUsername.getText(), txtFullName.getText(), txtPassword.getText(),
                        chkIsAdmin.isSelected());

                updateMessage("Adding to server...");

                user.addToServer();

                return null;
            }
        };

        task.setOnComplete(new Runnable() {
            @Override
            public void run() {
                UIHelpers.closeStage(event);
                UIHelpers.showInformationDialog("User Added", "User has been added successfully");
            }
        });

        new Thread(task).start();
    }
}
