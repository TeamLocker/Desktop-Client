package me.camerongray.teamlocker.client.crypto;

import org.abstractj.kalium.keys.KeyPair;

/**
 * Created by camerong on 24/05/17.
 */
public class UserCrypto {
    private String authKey;
    private byte[] encryptedPrivateKey;
    private byte[] encryptedPrivateKeyNonce;
    private int encryptedPrivateKeyOpsLimit;
    private long encryptedPrivateKeyMemLimit;
    private byte[] publicKey;
    private byte[] salt;

    public UserCrypto(String authKey, byte[] encryptedPrivateKey, byte[] encryptedPrivateKeyNonce,
                      int encryptedPrivateKeyOpsLimit, long encryptedPrivateKeyMemLimit, byte[] publicKey,
                      byte[] salt) {
        this.authKey = authKey;
        this.encryptedPrivateKey = encryptedPrivateKey;
        this.encryptedPrivateKeyNonce = encryptedPrivateKeyNonce;
        this.encryptedPrivateKeyOpsLimit = encryptedPrivateKeyOpsLimit;
        this.encryptedPrivateKeyMemLimit = encryptedPrivateKeyMemLimit;
        this.publicKey = publicKey;
        this.salt = salt;
    }

    public static UserCrypto generateNewCryptoAttribtues(String password) {
        KeyPair keyPair = CryptoHelpers.generateKeyPair();

        byte[] salt = CryptoHelpers.generateSalt();
        byte[] passwordKey = CryptoHelpers.deriveKeyFromPassword(password, salt);

        byte[] encryptedPrivateKeyNonce = CryptoHelpers.generateNonce(CryptoHelpers.ENCRYPTION_TYPE_SECRET);
        byte[] encryptedPrivateKey = CryptoHelpers.encryptWithSecret(keyPair.getPrivateKey().toBytes(), passwordKey,
                encryptedPrivateKeyNonce);

        String authKey = CryptoHelpers.hashPassword(password);

        return new UserCrypto(authKey, encryptedPrivateKey, encryptedPrivateKeyNonce, CryptoHelpers.getOpsLimit(),
                CryptoHelpers.getMemLimit(), keyPair.getPublicKey().toBytes(), salt);
    }

    public String getAuthKey() {
        return authKey;
    }

    public byte[] getEncryptedPrivateKey() {
        return encryptedPrivateKey;
    }

    public byte[] getEncryptedPrivateKeyNonce() {
        return encryptedPrivateKeyNonce;
    }

    public int getEncryptedPrivateKeyOpsLimit() {
        return encryptedPrivateKeyOpsLimit;
    }

    public long getEncryptedPrivateKeyMemLimit() {
        return encryptedPrivateKeyMemLimit;
    }

    public byte[] getPublicKey() {
        return publicKey;
    }

    public byte[] getSalt() {
        return salt;
    }
}
