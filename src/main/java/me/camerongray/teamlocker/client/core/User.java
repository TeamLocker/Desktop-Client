package me.camerongray.teamlocker.client.core;

import com.google.protobuf.ByteString;
import me.camerongray.teamlocker.client.crypto.UserCrypto;
import me.camerongray.teamlocker.client.protobufs.Objects;

/**
 * Created by camerong on 23/05/17.
 */
public class User {
    private int id;
    private String username;
    private String fullName;
    private byte[] authKey;
    private byte[] encryptedPrivateKey;
    private byte[] encryptedPrivateKeyNonce;
    private int encryptedPrivateKeyOpsLimit;
    private long encryptedPrivateKeyMemLimit;
    private byte[] publicKey;
    private byte[] salt;
    private boolean isAdmin;

    public static User createNew(String username, String fullName, String password, boolean isAdmin) {
        UserCrypto cryptoAttributes = UserCrypto.generateNewCryptoAttribtues(password);

        User user = new User();
        user.username = username;
        user.fullName = fullName;
        user.authKey = cryptoAttributes.getAuthKey();
        user.encryptedPrivateKey = cryptoAttributes.getEncryptedPrivateKey();
        user.encryptedPrivateKeyNonce = cryptoAttributes.getEncryptedPrivateKeyNonce();
        user.encryptedPrivateKeyOpsLimit = cryptoAttributes.getEncryptedPrivateKeyOpsLimit();
        user.encryptedPrivateKeyMemLimit = cryptoAttributes.getEncryptedPrivateKeyMemLimit();
        user.publicKey = cryptoAttributes.getPublicKey();
        user.salt = cryptoAttributes.getSalt();
        user.isAdmin = isAdmin;

        return user;
    }

    private Objects.User getProtobuf() {
        Objects.User.Builder builder = Objects.User.newBuilder();
        builder.setUsername(username);
        builder.setFullName(fullName);
        builder.setAuthKey(ByteString.copyFrom(authKey));
        builder.setEncryptedPrivateKey(ByteString.copyFrom(encryptedPrivateKey));
        builder.setEncryptedPrivateKeyNonce(ByteString.copyFrom(encryptedPrivateKeyNonce));
        builder.setEncryptedPrivateKeyOpsLimit(encryptedPrivateKeyOpsLimit);
        builder.setEncryptedPrivateKeyMemLimit(encryptedPrivateKeyMemLimit);
        builder.setPublicKey(ByteString.copyFrom(publicKey));
        builder.setSalt(ByteString.copyFrom(salt));
        builder.setIsAdmin(isAdmin);

        return builder.build();
    }

    public void addToServer() {
        Objects.User protobuf = getProtobuf();
        System.out.println(protobuf.toString());
    }
}
