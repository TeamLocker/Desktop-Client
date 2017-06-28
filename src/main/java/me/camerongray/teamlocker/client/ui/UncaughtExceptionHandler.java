package me.camerongray.teamlocker.client.ui;

import javafx.scene.control.Alert;
import me.camerongray.teamlocker.client.net.AuthenticationException;
import me.camerongray.teamlocker.client.net.NetworkException;
import me.camerongray.teamlocker.client.utils.UIHelpers;

/**
 * Created by camerong on 20/06/17.
 */
public class UncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        UncaughtExceptionHandler.showDialog(e);
    }

    public static void showDialog(Throwable e) {
        if (e instanceof AuthenticationException) {
            UIHelpers.showErrorDialog("Authentication Error", e.getMessage(),
                    "An authentication error occurred while attempting to service your request.");
        } else if (e instanceof NetworkException) {
            UIHelpers.showErrorDialog("Error communicating with server", e.getMessage(),
                    "An error occurred while trying to contact the server. Check your network connection "+
                            "and try again");
        } else {
            UIHelpers.showExceptionDialog("Unexpected Error", "An unexpected error has occurred",
                    e);
        }
    }
}
