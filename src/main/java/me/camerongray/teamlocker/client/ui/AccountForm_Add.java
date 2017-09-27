package me.camerongray.teamlocker.client.ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import me.camerongray.teamlocker.client.core.Account;
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
public class AccountForm_Add extends AccountForm {
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        super.initialize(location, resources);
        btnPrimary.setText("Add Account");
        btnGetPassword.setVisible(false);
    }

    @FXML
    void btnPrimary_Click(ActionEvent event) throws IOException, NetworkException, ServerProvidedException {
        Account account = new Account(txtAccountName.getText(), txtUsername.getText(), txtPasswordMasked.getText(),
                txtComments.getText());
        account.addToServer(); // TODO: This needs moved into a worker of some sort
    }
}
