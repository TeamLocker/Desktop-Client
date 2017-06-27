package me.camerongray.teamlocker.client.net;

/**
 * Created by camerong on 27/06/17.
 */
public class ApiResponse {
    byte[] body;
    int responseCode;

    public ApiResponse(byte[] body, int responseCode) {
        this.body = body;
        this.responseCode = responseCode;
    }

    public byte[] getBody() {
        return body;
    }

    public int getResponseCode() {
        return responseCode;
    }
}
