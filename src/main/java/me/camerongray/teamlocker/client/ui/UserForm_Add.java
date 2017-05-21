package me.camerongray.teamlocker.client.ui;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import javax.xml.soap.Text;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by camerong on 20/05/17.
 */
public class UserForm_Add extends UserForm {
    @FXML TextField txtUsername;
    @FXML TextField txtFullName;
    @FXML PasswordField txtPassword;
    @FXML PasswordField txtPasswordConfirm;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
}
