package me.camerongray.teamlocker.client.utils;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
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

    public static void showExceptionDialog(String title, String header, Throwable exception) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(exception.toString());
        alert.getDialogPane().setPrefWidth(900);

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        exception.printStackTrace(pw);
        String exceptionText = sw.toString();

        Label label = new Label("Stacktrace:");

        TextArea textArea = new TextArea(exceptionText);
        textArea.setEditable(false);
        textArea.setWrapText(true);

        textArea.setMaxWidth(Double.MAX_VALUE);
        textArea.setMaxHeight(Double.MAX_VALUE);
        GridPane.setVgrow(textArea, Priority.ALWAYS);
        GridPane.setHgrow(textArea, Priority.ALWAYS);

        GridPane expContent = new GridPane();
        expContent.setMaxWidth(Double.MAX_VALUE);
        expContent.add(label, 0, 0);
        expContent.add(textArea, 0, 1);

        alert.getDialogPane().setExpandableContent(expContent);

        alert.showAndWait();
    }

    private static void showSimpleDialog(String title, String content, String header, Alert.AlertType alertType) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.showAndWait();
    }

    public static void showInformationDialog(String title, String content, String header) {
        showSimpleDialog(title, content, header, Alert.AlertType.ERROR);
    }

    public static void showWarningDialog(String title, String content, String header) {
        showSimpleDialog(title, content, header, Alert.AlertType.ERROR);
    }

    public static void showErrorDialog(String title, String content, String header) {
        showSimpleDialog(title, content, header, Alert.AlertType.ERROR);
    }

    public static void showInformationDialog(String title, String content) {
        showInformationDialog(title, content, null);
    }

    public static void showWarningDialog(String title, String content) {
        showWarningDialog(title, content, null);
    }

    public static void showErrorDialog(String title, String content) {
        showErrorDialog(title, content, null);
    }
}
