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
        Throwable thrownException = e.getCause().getCause();

        if (thrownException instanceof AuthenticationException) {
            UIHelpers.showErrorDialog("Authentication Error", thrownException.getMessage(),
                    "An authentication error occurred while attempting to service your request.");
        } else if (thrownException instanceof NetworkException) {
            UIHelpers.showErrorDialog("Error communicating with server", thrownException.getMessage(),
                    "An error occurred while trying to contact the server. Check your network connection "+
                            "and try again");
        } else {
            UIHelpers.showExceptionDialog("Unexpected Error", "An unexpected error has occurred",
                    thrownException);
        }
    }
}
