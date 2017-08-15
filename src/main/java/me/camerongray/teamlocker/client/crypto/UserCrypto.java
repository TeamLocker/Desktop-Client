package me.camerongray.teamlocker.client.crypto;

import org.abstractj.kalium.keys.KeyPair;

/**
 * Created by camerong on 24/05/17.
 */
public class UserCrypto {
    private byte[] authKey;
    private byte[] encryptedPrivateKey;
    private byte[] encryptedPrivateKeyNonce;
    private int encryptedPrivateKeyOpsLimit;
    private long encryptedPrivateKeyMemLimit;
    private byte[] publicKey;
    private byte[] kdfSalt;

    public UserCrypto(byte[] authKey, byte[] encryptedPrivateKey, byte[] encryptedPrivateKeyNonce,
                      int encryptedPrivateKeyOpsLimit, long encryptedPrivateKeyMemLimit, byte[] publicKey,
                      byte[] kdfSalt) {
        this.authKey = authKey;
        this.encryptedPrivateKey = encryptedPrivateKey;
        this.encryptedPrivateKeyNonce = encryptedPrivateKeyNonce;
        this.encryptedPrivateKeyOpsLimit = encryptedPrivateKeyOpsLimit;
        this.encryptedPrivateKeyMemLimit = encryptedPrivateKeyMemLimit;
        this.publicKey = publicKey;
        this.kdfSalt = kdfSalt;
    }

    public static UserCrypto generateNewCryptoAttributes(String password) {
        KeyPair keyPair = CryptoHelpers.generateKeyPair();

        byte[] salt = CryptoHelpers.generateSalt();
        byte[] passwordKey = CryptoHelpers.deriveKeyFromPassword(password, salt);

        byte[] encryptedPrivateKeyNonce = CryptoHelpers.generateNonce(CryptoHelpers.ENCRYPTION_TYPE_SECRET);
        byte[] encryptedPrivateKey = CryptoHelpers.encryptWithSecret(keyPair.getPrivateKey().toBytes(), passwordKey,
                encryptedPrivateKeyNonce);

        byte[] authKey = CryptoHelpers.hashPassword(password);

        return new UserCrypto(authKey, encryptedPrivateKey, encryptedPrivateKeyNonce, CryptoHelpers.getOpsLimit(),
                CryptoHelpers.getMemLimit(), keyPair.getPublicKey().toBytes(), salt);
    }

    public byte[] getAuthKey() {
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

    public byte[] getKdfSalt() {
        return kdfSalt;
    }
}
