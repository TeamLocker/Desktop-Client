package me.camerongray.teamlocker.client.ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import me.camerongray.teamlocker.client.utils.UIHelpers;

/**
 * Created by camerong on 20/05/17.
 */
public abstract class UserForm implements Initializable {
    @FXML TextField txtUsername;
    @FXML TextField txtFullName;
    @FXML PasswordField txtPassword;
    @FXML PasswordField txtPasswordConfirm;
    @FXML Button btnClose;
    @FXML Button btnPrimary;
    @FXML CheckBox chkIsAdmin;

    @FXML
    void btnClose_Click(ActionEvent event) {
        UIHelpers.closeStage(event);
    }

    void showPasswordMismatchAlert() {
        UIHelpers.showErrorDialog("Password mismatch", "The passwords you have entered do not match." +
                " Check the passwords then try again");
    }

    void showPasswordUnsetAlert() {
        UIHelpers.showErrorDialog("Password required", "Password must not be empty");
    }
}
