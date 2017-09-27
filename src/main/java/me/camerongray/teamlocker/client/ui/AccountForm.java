package me.camerongray.teamlocker.client.ui;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import me.camerongray.teamlocker.client.utils.UIHelpers;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by camerong on 20/05/17.
 */
public abstract class AccountForm implements Initializable {
    @FXML TextField txtAccountName;
    @FXML TextField txtUsername;
    @FXML TextField txtPasswordUnmasked;
    @FXML PasswordField txtPasswordMasked;
    @FXML TextArea txtComments;
    @FXML Button btnClose;
    @FXML Button btnPrimary;
    @FXML CheckBox chkShowPassword;
    @FXML Button btnGetPassword;
    @FXML GridPane gridPaneControl;
    @FXML StackPane stackPaneRoot;

    public void initialize(URL location, ResourceBundle resources) {
        setPasswordVisibility();

        // Both the masked and unmasked password fields will update each other to always contain the same value, this
        // means that we can show/hide the password by simply showing either the masked or unmasked control.  Since they
        // are kept in sync by the below code we can then get the password by simply reading the value of either field
        txtPasswordMasked.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                txtPasswordUnmasked.setText(newValue);
            }
        });
        txtPasswordUnmasked.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                txtPasswordMasked.setText(newValue);
            }
        });
    }

    @FXML
    void btnClose_Click(ActionEvent event) {
        UIHelpers.closeStage(event);
    }

    @FXML
    void chkShowPassword_Changed(ActionEvent event) {
        setPasswordVisibility();
    }

    void setPasswordVisibility() {
        boolean showPassword = chkShowPassword.isSelected();
        txtPasswordUnmasked.setVisible(showPassword);
        txtPasswordMasked.setVisible(!showPassword);
    }
}
