package me.camerongray.teamlocker.client.ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import me.camerongray.teamlocker.client.core.User;
import me.camerongray.teamlocker.client.utils.UIHelpers;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by camerong on 20/05/17.
 */
public class MainWindow implements Initializable {
    private User user;

    @FXML Label lblLoggedInUsername;
    @FXML Label lblLoggedInIsAdministrator;
    @FXML Menu  menuSystemAdministration;

    public MainWindow(User user) {
        this.user = user;
    }

    @FXML
    void btnQuit_Click(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void btnAddUser_Click(ActionEvent event) {
        UserForm_Add controller = new UserForm_Add();
        UIHelpers.createStage(getClass().getResource("UserForm.fxml"), controller, "Add User", 640,
                300, true).show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        lblLoggedInUsername.setText(user.getUsername());
        lblLoggedInIsAdministrator.setVisible(user.isAdmin());
        if (!user.isAdmin()) {
            menuSystemAdministration.setVisible(false);
        }
    }
}
