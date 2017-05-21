package me.camerongray.teamlocker.client.utils;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

/**
 * Created by camerong on 20/05/17.
 */
public class UIHelpers {
    public static void closeStage (ActionEvent event) {
        ((Stage) ((Node) event.getSource()).getScene().getWindow()).close();
    }

    public static Stage createStage(URL fxmlLocation, Object controller, String title, int width, int height,
                                  boolean isModal) {
        FXMLLoader loader = new FXMLLoader(fxmlLocation);
        loader.setController(controller);
        Parent root = null;

        try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Stage stage = new Stage();

        if (isModal) {
            stage.initModality(Modality.APPLICATION_MODAL);
        }

        stage.setTitle(title);
        stage.setScene(new Scene(root, width, height));

        return stage;
    }
}
