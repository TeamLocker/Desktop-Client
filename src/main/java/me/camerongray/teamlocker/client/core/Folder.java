package me.camerongray.teamlocker.client.core;

import me.camerongray.teamlocker.client.net.ApiClient;
import me.camerongray.teamlocker.client.net.ApiResponse;
import me.camerongray.teamlocker.client.net.NetworkException;
import me.camerongray.teamlocker.client.net.ServerProvidedException;
import me.camerongray.teamlocker.client.protobufs.AddFolder;
import me.camerongray.teamlocker.client.protobufs.Objects;

import java.io.IOException;

/**
 * Created by camerong on 19/09/17.
 */
public class Folder {
    private String name;
    private int id;

    public Folder(String name) {
        this.name = name;
    }

    public Folder() {
    }

    public Objects.Folder getProtobuf() {
        Objects.Folder.Builder builder = Objects.Folder.newBuilder();
        builder.setName(name);
        builder.setId(id);
        return builder.build();
    }

    public static Folder fromProtobuf(Objects.Folder protobuf) {
        Folder folder = new Folder();
        folder.id = protobuf.getId();
        folder.name = protobuf.getName();
        return folder;
    }

    public Folder addToServer() throws IOException, NetworkException, ServerProvidedException {
        AddFolder.AddFolderRequest.Builder builder = AddFolder.AddFolderRequest.newBuilder();
        builder.setFolder(getProtobuf());

        ApiResponse apiResponse = ApiClient.getInstance().makePutRequest("/folders/", builder.build().toByteString().toByteArray());
        AddFolder.AddFolderResponse response = AddFolder.AddFolderResponse.parseFrom(apiResponse.getBody());
        if (apiResponse.getResponseCode() != 200) {
            throw new ServerProvidedException(response.getResult().getMessage());
        }

        return Folder.fromProtobuf(response.getFolder());
    }

    public String toString() {
        return name;
    }
}
