package me.camerongray.teamlocker.client.core;

import com.google.protobuf.ByteString;
import me.camerongray.teamlocker.client.crypto.UserCrypto;
import me.camerongray.teamlocker.client.net.ApiClient;
import me.camerongray.teamlocker.client.net.ApiResponse;
import me.camerongray.teamlocker.client.net.NetworkException;
import me.camerongray.teamlocker.client.net.ServerProvidedException;
import me.camerongray.teamlocker.client.protobufs.GetUser;
import me.camerongray.teamlocker.client.protobufs.Objects;

import java.io.IOException;

/**
 * Created by camerong on 23/05/17.
 */
public class User {
    private int id;
    private String username;
    private String fullName;
    private byte[] authKeyHash;
    private byte[] encryptedPrivateKey;
    private byte[] publicKey;
    private byte[] kdfSalt;
    private boolean isAdmin;

    // TODO: Update below to reflect new user structure and libsodium item packing!
    public static User createNew(String username, String fullName, String password, boolean isAdmin) {
//        UserCrypto cryptoAttributes = UserCrypto.generateNewCryptoAttributes(password);
//
//        User user = new User();
//        user.username = username;
//        user.fullName = fullName;
//        user.authKey = cryptoAttributes.getAuthKey();
//        user.encryptedPrivateKey = cryptoAttributes.getEncryptedPrivateKey();
//        user.encryptedPrivateKeyNonce = cryptoAttributes.getEncryptedPrivateKeyNonce();
//        user.encryptedPrivateKeyOpsLimit = cryptoAttributes.getEncryptedPrivateKeyOpsLimit();
//        user.encryptedPrivateKeyMemLimit = cryptoAttributes.getEncryptedPrivateKeyMemLimit();
//        user.publicKey = cryptoAttributes.getPublicKey();
//        user.salt = cryptoAttributes.getSalt();
//        user.isAdmin = isAdmin;
//
//        return user;
        return null;
    }

    private Objects.User getProtobuf() {
        Objects.User.Builder builder = Objects.User.newBuilder();
        builder.setUsername(username);
        builder.setFullName(fullName);
        builder.setAuthKeyHash(ByteString.copyFrom(authKeyHash));
        builder.setEncryptedPrivateKey(ByteString.copyFrom(encryptedPrivateKey));
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
        ApiResponse response = ApiClient.getInstance().makeValidatedGetRequest("/users/" + id);

        Objects.User protobuf = GetUser.GetUserResponse.parseFrom(response.getBody()).getUser();
        User user = fromProtobuf(protobuf);

        return user;
    }

    private static User fromProtobuf(Objects.User protobuf) {
        User user = new User();
        user.id = protobuf.getId();
        user.username = protobuf.getUsername();
        user.fullName = protobuf.getFullName();
        user.authKeyHash = protobuf.getAuthKeyHash().toByteArray();
        user.encryptedPrivateKey = protobuf.getEncryptedPrivateKey().toByteArray();
        user.publicKey = protobuf.getPublicKey().toByteArray();
        user.kdfSalt = protobuf.getKdfSalt().toByteArray();
        user.isAdmin = protobuf.getIsAdmin();

        return user;
    }

    public void addToServer() {
        Objects.User protobuf = getProtobuf();
        System.out.println(protobuf.toString());
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

    public byte[] getAuthKeyHash() {
        return authKeyHash;
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
