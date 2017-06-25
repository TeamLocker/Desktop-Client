package me.camerongray.teamlocker.client.net;

/**
 * Created by camerong on 01/06/17.
 */
public class ApiClient {
    private static ApiClient instance = null;
    private String host;
    private int port;
    private String username;
    private String password;

    protected ApiClient() {
        // Prevent instantiation
    }

    public static ApiClient initialise(String host, int port, String username, String password) throws AuthenticationException {
        instance = new ApiClient();
        instance.host = host;
        instance.port = port;
        instance.username = username;
        instance.password = password;

        // Check authentication here?
        if(1==1) {
            throw new AuthenticationException("Incorrect username/password");
        }

        return instance;
    }

    public static ApiClient getInstance() {
        if (instance == null) {
            throw new IllegalStateException("API Client has not been initialised");
        }
        return instance;
    }


}
