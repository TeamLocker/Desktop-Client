package me.camerongray.teamlocker.client.ui;

import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.concurrent.WorkerStateEvent;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import me.camerongray.teamlocker.client.core.User;
import me.camerongray.teamlocker.client.net.ApiClient;
import me.camerongray.teamlocker.client.net.AuthenticationException;
import me.camerongray.teamlocker.client.utils.UIHelpers;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.prefs.Preferences;

/**
 * Created by camerong on 01/06/17.
 */
public class LoginWindow implements Initializable {
    @FXML TextField txtServer;
    @FXML TextField txtPort;
    @FXML TextField txtUsername;
    @FXML PasswordField txtPassword;
    @FXML StackPane stackPaneRoot;
    @FXML AnchorPane anchorPaneControl;
    @FXML CheckBox chkRememberServer;
    @FXML CheckBox chkRememberUsername;

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

        SpinnerTask<User> task = new SpinnerTask<User>(stackPaneRoot, anchorPaneControl) {
            @Override
            protected User call() throws Exception {
                updateMessage("Logging in...");
                try {
                    ApiClient.initialise(server, port, username, password);
                } catch (AuthenticationException ex) {
                    UIHelpers.showErrorDialog("Login error", ex.getMessage());
                    return null;
                }

                updateMessage("Getting user...");
                User user = User.getSelfFromServer();

                Preferences preferences = Preferences.userNodeForPackage(this.getClass());

                preferences.remove("server");
                preferences.remove("port");
                preferences.remove("username");

                if (chkRememberServer.isSelected()) {
                    preferences.put("server", txtServer.getText());
                    preferences.put("port", txtPort.getText());
                }

                if (chkRememberUsername.isSelected()) {
                    preferences.put("username", txtUsername.getText());
                }

                return user;
            }
        };

        task.setOnComplete(new Runnable() {
            @Override
            public void run() {
                User user = task.getValue();
                if (user != null) {
                    MainWindow controller = new MainWindow(user);
                    UIHelpers.createStage(getClass().getResource("MainWindow.fxml"), controller, "TeamLocker", 1024,
                            600, false).show();
                    UIHelpers.closeStage(event);
                }
            }
        });

        new Thread(task).start();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Preferences preferences = Preferences.userNodeForPackage(this.getClass());

        String username = preferences.get("username", "");
        String server = preferences.get("server", "");
        String port = preferences.get("port", "");

        if (!server.equals("") && !port.equals("")) {
            txtServer.setText(server);
            txtPort.setText(port);
            chkRememberServer.setSelected(true);
            Platform.runLater(()->txtUsername.requestFocus());
            if (!username.equals("")) {
                Platform.runLater(()->txtPassword.requestFocus());
            }
        }

        if (!username.equals("")) {
            txtUsername.setText(username);
            chkRememberUsername.setSelected(true);
        }
    }
}
