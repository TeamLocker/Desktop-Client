package me.camerongray.teamlocker.client.ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import me.camerongray.teamlocker.client.core.User;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by camerong on 20/05/17.
 */
public class UserForm_Add extends UserForm {
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        btnPrimary.setText("Add User");
    }

    @FXML
    void btnPrimary_Click(ActionEvent event) {
        if (!txtPassword.getText().equals(txtPasswordConfirm.getText())) {
            showPasswordMismatchAlert();
            return;
        }
        User user = User.createNew(txtUsername.getText(), txtFullName.getText(), txtPassword.getText());
        user.addToServer();
    }
}
