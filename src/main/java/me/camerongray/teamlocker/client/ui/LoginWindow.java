package me.camerongray.teamlocker.client.ui;

import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.concurrent.WorkerStateEvent;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import me.camerongray.teamlocker.client.net.ApiClient;
import me.camerongray.teamlocker.client.net.AuthenticationException;
import me.camerongray.teamlocker.client.utils.UIHelpers;

/**
 * Created by camerong on 01/06/17.
 */
public class LoginWindow {
    @FXML TextField txtServer;
    @FXML TextField txtPort;
    @FXML TextField txtUsername;
    @FXML PasswordField txtPassword;
    @FXML StackPane stackPaneRoot;
    @FXML AnchorPane anchorPaneControl;

    @FXML
    void btnExit_Click(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void btnLogin_Click(ActionEvent event) throws Exception {
        String server = txtServer.getText();

        int port;
        try {
            port = Integer.parseInt(txtPort.getText());
        } catch (NumberFormatException ex) {
            UIHelpers.showErrorDialog("Invalid Port", "Port must be a number");
            return;

        }
        String username = txtUsername.getText();
        String password = txtPassword.getText();

        ProgressSpinner spinner = new ProgressSpinner(stackPaneRoot, anchorPaneControl);
        Task<Void> task = new Task<Void>() {
            @Override
            protected Void call() throws Exception {
                updateMessage("Logging in...");
                try {
                    ApiClient.initialise(server, port, username, password);
                } catch (AuthenticationException ex) {
                    UIHelpers.showErrorDialog("Login error", ex.getMessage());
                    return null;
                }

                return null;
            }
        };
        task.setOnFailed(UIHelpers.getTaskFailedEventHandler(spinner, task));
        task.setOnSucceeded(UIHelpers.getTaskCompleteEventHandler(spinner));
        task.setOnCancelled(UIHelpers.getTaskCompleteEventHandler(spinner));
        spinner.show(task.messageProperty());
        new Thread(task).start();
    }
}
