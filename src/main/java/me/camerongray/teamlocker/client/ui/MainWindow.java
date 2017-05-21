package me.camerongray.teamlocker.client.ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import me.camerongray.teamlocker.client.utils.UIHelpers;

/**
 * Created by camerong on 20/05/17.
 */
public class MainWindow {
    @FXML
    void btnQuit_Click(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void btnAddUser_Click(ActionEvent event) {
        UserForm_Add controller = new UserForm_Add();
        UIHelpers.createStage(getClass().getResource("UserForm.fxml"), controller, "Add User", 640,
                480, true).show();
    }
}
