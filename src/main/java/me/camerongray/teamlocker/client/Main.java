package me.camerongray.teamlocker.client;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import me.camerongray.teamlocker.client.ui.UncaughtExceptionHandler;

/**
 * Created by camerong on 20/05/17.
 */
public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Thread.setDefaultUncaughtExceptionHandler(new UncaughtExceptionHandler());
        setUserAgentStylesheet(STYLESHEET_MODENA);
        Parent root = FXMLLoader.load(getClass().getResource("ui/LoginWindow.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("TeamLocker - Login");
        primaryStage.show();
    }
}
