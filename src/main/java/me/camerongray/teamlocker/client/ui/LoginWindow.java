package me.camerongray.teamlocker.client.ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import me.camerongray.teamlocker.client.net.ApiClient;

/**
 * Created by camerong on 01/06/17.
 */
public class LoginWindow {
    @FXML TextField txtServer;
    @FXML TextField txtPort;
    @FXML TextField txtUsername;
    @FXML PasswordField txtPassword;

    @FXML
    void btnExit_Click(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void btnLogin_Click(ActionEvent event) throws Exception {
        String server = txtServer.getText();
        int port = Integer.parseInt(txtPort.getText());
        String username = txtUsername.getText();
        String password = txtPassword.getText();

        throw new Exception("TEST");
    }
}
