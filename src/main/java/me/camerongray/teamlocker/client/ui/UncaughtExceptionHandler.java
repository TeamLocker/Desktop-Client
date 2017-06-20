package me.camerongray.teamlocker.client.ui;

import javafx.scene.control.Alert;
import me.camerongray.teamlocker.client.utils.UIHelpers;

/**
 * Created by camerong on 20/06/17.
 */
public class UncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        Throwable thrownException = e.getCause().getCause();

        if (false) {

        } else {
            UIHelpers.showExceptionDialog("Unexpected Error", "An unexpected error has occurred",
                    thrownException);
        }
    }
}
