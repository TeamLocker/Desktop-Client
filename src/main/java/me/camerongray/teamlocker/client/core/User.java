package me.camerongray.teamlocker.client.core;

import org.abstractj.kalium.keys.KeyPair;
import me.camerongray.teamlocker.client.crypto.Crypto;

import java.util.Base64;

/**
 * Created by camerong on 23/05/17.
 */
public class User {
    private int id;
    private String username;
    private String fullName;
    private String authKey;
    private byte[] encryptedPrivateKey;
    private byte[] encryptedPrivateKeyNonce;
    private int encryptedPrivateKeyOpsLimit;
    private long encryptedPrivateKeyMemLimit;
    private byte[] publicKey;
    private byte[] salt;

    public static User createNew(String username, String fullName, String password) {
        KeyPair keyPair = Crypto.generateKeyPair();

        byte[] salt = Crypto.generateSalt();
        byte[] passwordKey = Crypto.deriveKeyFromPassword(password, salt);

        byte[] encryptedPrivateKeyNonce = Crypto.generateNonce(Crypto.ENCRYPTION_TYPE_SECRET);
        byte[] encryptedPrivateKey = Crypto.encryptWithSecret(keyPair.getPrivateKey().toBytes(), passwordKey,
                encryptedPrivateKeyNonce);

        String authKey = Crypto.hashPassword(password);

        System.out.println(new String(Base64.getEncoder().encode(encryptedPrivateKey)));
        System.out.println(new String(Base64.getEncoder().encode(keyPair.getPrivateKey().toBytes())));

        User user = new User();
        user.username = username;
        user.fullName = fullName;
        user.authKey = authKey;
        user.encryptedPrivateKey = encryptedPrivateKey;
        user.encryptedPrivateKeyNonce = encryptedPrivateKeyNonce;
        user.encryptedPrivateKeyOpsLimit = Crypto.getOpsLimit();
        user.encryptedPrivateKeyMemLimit = Crypto.getMemLimit();
        user.publicKey = keyPair.getPublicKey().toBytes();
        user.salt = salt;

        return user;
    }
}
