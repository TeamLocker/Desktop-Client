package me.camerongray.teamlocker.client.ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import me.camerongray.teamlocker.client.utils.UIHelpers;

/**
 * Created by camerong on 20/05/17.
 */
public abstract class UserForm implements Initializable {
    @FXML
    void btnClose_Click(ActionEvent event) {
        UIHelpers.closeStage(event);
    }
}
