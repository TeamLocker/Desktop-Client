package me.camerongray.teamlocker.client.core;

import com.google.protobuf.ByteString;
import me.camerongray.teamlocker.client.crypto.UserCrypto;
import me.camerongray.teamlocker.client.net.ApiClient;
import me.camerongray.teamlocker.client.net.ApiResponse;
import me.camerongray.teamlocker.client.net.NetworkException;
import me.camerongray.teamlocker.client.net.ServerProvidedException;
import me.camerongray.teamlocker.client.protobufs.AddUser;
import me.camerongray.teamlocker.client.protobufs.GetUser;
import me.camerongray.teamlocker.client.protobufs.Libsodium;
import me.camerongray.teamlocker.client.protobufs.Objects;

import java.io.IOException;
import java.util.Base64;

/**
 * Created by camerong on 23/05/17.
 */
public class User {
    private int id;
    private String username;
    private String fullName;
    private byte[] authKey;
    private byte[] encryptedPrivateKey;
    private byte[] publicKey;
    private byte[] kdfSalt;
    private boolean isAdmin;
    private byte[] encryptedPrivateKeyNonce;
    private long encryptedPrivateKeyOpsLimit;
    private long encryptedPrivateKeyMemLimit;

    // TODO: Update below to reflect new user structure and libsodium item packing!
    public static User createNew(String username, String fullName, String password, boolean isAdmin) {
        UserCrypto cryptoAttributes = UserCrypto.generateNewCryptoAttributes(password, username);

        User user = new User();
        user.username = username;
        user.fullName = fullName;
        user.authKey = new byte[0];
        user.authKey = cryptoAttributes.getAuthKey();
        user.encryptedPrivateKey = cryptoAttributes.getEncryptedPrivateKey();
        user.encryptedPrivateKeyNonce = cryptoAttributes.getEncryptedPrivateKeyNonce();
        user.encryptedPrivateKeyOpsLimit = cryptoAttributes.getEncryptedPrivateKeyOpsLimit();
        user.encryptedPrivateKeyMemLimit = cryptoAttributes.getEncryptedPrivateKeyMemLimit();
        user.publicKey = cryptoAttributes.getPublicKey();
        user.kdfSalt = cryptoAttributes.getKdfSalt();
        user.isAdmin = isAdmin;

        return user;
    }

    private Objects.User getProtobuf() {
        Objects.User.Builder builder = Objects.User.newBuilder();
        builder.setUsername(username);
        builder.setFullName(fullName);
        builder.setAuthKey(ByteString.copyFrom(authKey));

        Libsodium.LibsodiumItem.Builder privateKeyBuilder = Libsodium.LibsodiumItem.newBuilder();
        privateKeyBuilder.setData(ByteString.copyFrom(encryptedPrivateKey));
        privateKeyBuilder.setNonce(ByteString.copyFrom(encryptedPrivateKeyNonce));
        privateKeyBuilder.setMemLimit(encryptedPrivateKeyMemLimit);
        privateKeyBuilder.setOpsLimit(encryptedPrivateKeyOpsLimit);

        builder.setEncryptedPrivateKey(privateKeyBuilder);
        builder.setPublicKey(ByteString.copyFrom(publicKey));
        builder.setKdfSalt(ByteString.copyFrom(kdfSalt));
        builder.setIsAdmin(isAdmin);

        return builder.build();
    }

    public static User getSelfFromServer() throws ServerProvidedException, NetworkException, IOException {
        return getFromServer("self");
    }

    public static User getFromServer(int id) throws ServerProvidedException, NetworkException, IOException {
        return getFromServer(Integer.toString(id));
    }

    private static User getFromServer(String id) throws IOException, NetworkException, ServerProvidedException {
        ApiResponse response = ApiClient.getInstance().makeValidatedGetRequest("/users/" + id + "/");

        Objects.User protobuf = GetUser.GetUserResponse.parseFrom(response.getBody()).getUser();
        User user = fromProtobuf(protobuf);

        return user;
    }

    private static User fromProtobuf(Objects.User protobuf) {
        User user = new User();
        user.id = protobuf.getId();
        user.username = protobuf.getUsername();
        user.fullName = protobuf.getFullName();
        user.authKey = protobuf.getAuthKey().toByteArray();
        user.encryptedPrivateKey = protobuf.getEncryptedPrivateKey().getData().toByteArray();
        user.encryptedPrivateKeyNonce = protobuf.getEncryptedPrivateKey().getNonce().toByteArray();
        user.encryptedPrivateKeyMemLimit = protobuf.getEncryptedPrivateKey().getMemLimit();
        user.encryptedPrivateKeyOpsLimit = protobuf.getEncryptedPrivateKey().getOpsLimit();
        user.publicKey = protobuf.getPublicKey().toByteArray();
        user.kdfSalt = protobuf.getKdfSalt().toByteArray();
        user.isAdmin = protobuf.getIsAdmin();

        return user;
    }

    public void addToServer() throws IOException, NetworkException, ServerProvidedException {
        AddUser.AddUserRequest.Builder protobuf = AddUser.AddUserRequest.newBuilder();
        protobuf.setUser(getProtobuf());
        ApiResponse apiResponse = ApiClient.getInstance().makePutRequest("/users/",
                protobuf.build().toByteString().toByteArray());

        if (apiResponse.getResponseCode() != 200) {
            AddUser.AddUserResponse response = AddUser.AddUserResponse.parseFrom(apiResponse.getBody());
            throw new ServerProvidedException(response.getResult().getMessage());
        }
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getFullName() {
        return fullName;
    }

    public byte[] getAuthKey() {
        return authKey;
    }

    public byte[] getEncryptedPrivateKey() {
        return encryptedPrivateKey;
    }

    public byte[] getPublicKey() {
        return publicKey;
    }

    public byte[] getKdfSalt() {
        return kdfSalt;
    }

    public boolean isAdmin() {
        return isAdmin;
    }
}
