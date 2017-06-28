package me.camerongray.teamlocker.client.net;

import com.google.protobuf.Api;
import com.google.protobuf.Message;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

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

    public static ApiClient initialise(String host, int port, String username, String password) throws AuthenticationException, NetworkException, IOException {
        instance = new ApiClient();
        instance.host = host;
        instance.port = port;
        instance.username = username;
        instance.password = password;

        // Check authentication here?
        ApiResponse response = instance.makeGetRequest("401");
        if (response.getResponseCode() == 401) {
            throw new AuthenticationException("Incorrect username/password!");
        }

        return instance;
    }

    public static ApiClient getInstance() {
        if (instance == null) {
            throw new IllegalStateException("API Client has not been initialised");
        }
        return instance;
    }

    private ApiResponse makeGetRequest(String path) throws NetworkException, IOException {
        HttpResponse<InputStream> binaryResponse;
        try {
            binaryResponse = Unirest.get(getUrl(path)).asBinary();
        } catch (UnirestException ex) {
            throw new NetworkException(ex.getCause().getMessage(), ex);
        }

        ApiResponse response = new ApiResponse(IOUtils.toByteArray(binaryResponse.getBody()),
                binaryResponse.getStatus());
        return response;
    }

    private String getUrl(String path) throws MalformedURLException {
        path = (path.charAt(0) == '/') ? path : "/"+path;
        String url = new URL("http", host, port, path).toString();
        return url;
    }
}
