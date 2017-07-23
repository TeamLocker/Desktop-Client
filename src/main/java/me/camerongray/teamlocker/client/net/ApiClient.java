package me.camerongray.teamlocker.client.net;

import com.google.protobuf.Api;
import com.google.protobuf.Message;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import me.camerongray.teamlocker.client.crypto.CryptoHelpers;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Base64;

/**
 * Created by camerong on 01/06/17.
 */
public class ApiClient {
    private static ApiClient instance = null;
    private String host;
    private int port;
    private String username;
    private byte[] authKey;

    protected ApiClient() {
        // Prevent instantiation
    }

    public static ApiClient initialise(String host, int port, String username, String password) throws AuthenticationException, NetworkException, IOException {
        instance = new ApiClient();
        instance.host = host;
        instance.port = port;
        instance.username = username;
        instance.authKey = CryptoHelpers.hashPassword(password, username);

        // Check authentication here?
        ApiResponse response = instance.makeGetRequest("ping");
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

    public ApiResponse makeGetRequest(String path) throws NetworkException, IOException {
        HttpResponse<InputStream> binaryResponse;
        try {
            binaryResponse = Unirest.get(getUrl(path)).basicAuth(username,
                    Base64.getEncoder().encodeToString(authKey)).asBinary();
        } catch (UnirestException ex) {
            throw new NetworkException(ex.getCause().getMessage(), ex);
        }

        ApiResponse response = new ApiResponse(IOUtils.toByteArray(binaryResponse.getBody()),
                binaryResponse.getStatus());
        return response;
    }

    public ApiResponse makeValidatedGetRequest(String path) throws IOException, NetworkException, ServerProvidedException {
        ApiResponse response = this.makeGetRequest(path);
        if (response.getResponseCode() == 200) {
            return response;
        }
        throw new ServerProvidedException("SERVER PROVIDED MESSAGE HERE"); // TODO: Get this message from server
    }

    private String getUrl(String path) throws MalformedURLException {
        path = (path.charAt(0) == '/') ? path : "/"+path;
        String url = new URL("http", host, port, path).toString();
        return url;
    }
}
