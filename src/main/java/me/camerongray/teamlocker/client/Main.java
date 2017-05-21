package me.camerongray.teamlocker.client;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by camerong on 20/05/17.
 */
public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        setUserAgentStylesheet(STYLESHEET_MODENA);
        Parent root = FXMLLoader.load(getClass().getResource("ui/MainWindow.fxml"));
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.setTitle("TeamLocker");
        primaryStage.show();
    }
}
