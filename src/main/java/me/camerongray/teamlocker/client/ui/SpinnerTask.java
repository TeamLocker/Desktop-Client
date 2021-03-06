package me.camerongray.teamlocker.client.ui;

import javafx.application.Platform;
import javafx.beans.value.ObservableValue;
import javafx.concurrent.Task;
import javafx.concurrent.WorkerStateEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import me.camerongray.teamlocker.client.net.ServerProvidedException;
import me.camerongray.teamlocker.client.utils.UIHelpers;

import java.util.concurrent.Callable;

/**
 * Created by camerong on 29/06/17.
 */
public class SpinnerTask<T> extends Task<T> {
    Pane rootPane;
    Pane controlPane;
    VBox progressBox;
    Runnable onComplete;

    EventHandler<WorkerStateEvent> taskCompleteEventHandler = new EventHandler<WorkerStateEvent>() {
        @Override
        public void handle(WorkerStateEvent event) {
            SpinnerTask.this.hide();
            if (onComplete != null) {
                onComplete.run();
            }
        }
    };


    EventHandler<WorkerStateEvent> taskFailedEventHandler = new EventHandler<WorkerStateEvent>() {
        @Override
        public void handle(WorkerStateEvent event) {
            SpinnerTask.this.hide();
            Throwable exception = SpinnerTask.this.getException();
            if (exception.getClass().equals(ServerProvidedException.class)) {
                UIHelpers.showErrorDialog("An error occurred...", exception.getMessage());
            } else {
                UncaughtExceptionHandler.showDialog(exception);
            }
        }
    };

    /**
     * Construct a new SpinnerTask
     * @param rootPane Pane that the spinner should be added to, usually a StackPane
     * @param controlPane Pane which should be disabled when the task is running
     */
    public SpinnerTask(Pane rootPane, Pane controlPane) {
        this.rootPane = rootPane;
        this.controlPane = controlPane;
        this.showSpinner(this.messageProperty());
        this.setOnCancelled(this.taskCompleteEventHandler);
        this.setOnSucceeded(this.taskCompleteEventHandler);
        this.setOnFailed(this.taskFailedEventHandler);
    }

    @Override
    protected T call() throws Exception {
        return null;
    }

    private void showSpinner(ObservableValue<String> statusObservable) {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
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
                rootPane.getChildren().remove(progressBox);
                controlPane.setDisable(false);
            }
        });
    }

    public void setOnComplete(Runnable onComplete) {
        this.onComplete = onComplete;
    }

    public Thread runOnThread() {
        Thread thread = new Thread(this);
        thread.start();
        return thread;
    }

    public EventHandler<WorkerStateEvent> getHideWorkerEventHandler() {
        return event -> hide();
    }
}
