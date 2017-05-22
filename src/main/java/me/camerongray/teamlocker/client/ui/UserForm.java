package me.camerongray.teamlocker.client.ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
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

    @FXML
    void btnClose_Click(ActionEvent event) {
        UIHelpers.closeStage(event);
    }
}
