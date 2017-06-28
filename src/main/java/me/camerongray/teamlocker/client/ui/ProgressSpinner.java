package me.camerongray.teamlocker.client.ui;

import javafx.application.Platform;
import javafx.beans.value.ObservableValue;
import javafx.concurrent.WorkerStateEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * Created by camerong on 28/06/17.
 */
public class ProgressSpinner {
    Pane rootPane;
    Pane controlPane;
    VBox progressBox;

    public ProgressSpinner(Pane rootPane, Pane controlPane) {
        this.rootPane = rootPane;
        this.controlPane = controlPane;
    }

    public void show(ObservableValue<String> statusObservable) {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                System.out.println("Showing spinner");
                ProgressIndicator spinner = new ProgressIndicator();
                Label label = new Label();
                label.textProperty().bind(statusObservable);
                progressBox = new VBox(spinner, label);
                progressBox.setSpacing(10);
                progressBox.setAlignment(Pos.CENTER);
                controlPane.setDisable(true);
                rootPane.getChildren().add(progressBox);
            }
        });
    }

    public void hide() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hiding Spinner");
                rootPane.getChildren().remove(progressBox);
                controlPane.setDisable(false);
            }
        });
    }

    public EventHandler<WorkerStateEvent> getHideWorkerEventHandler() {
        return event -> hide();
    }
}
