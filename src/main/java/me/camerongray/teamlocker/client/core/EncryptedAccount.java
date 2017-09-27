package me.camerongray.teamlocker.client.core;

public class EncryptedAccount {
    private int accountId;
    private int userId;
    private byte[] encryptedMetadata;
    private byte[] encryptedPassword;

    public EncryptedAccount(int accountId, int userId, byte[] encryptedMetadata, byte[] encryptedPassword) {
        this.accountId = accountId;
        this.userId = userId;
        this.encryptedMetadata = encryptedMetadata;
        this.encryptedPassword = encryptedPassword;
    }

    public EncryptedAccount encryptNew(Account account, User user) {
        // TODO: Encrypt account data with user's keys and return new instance of EncryptedAccount
        return null;
    }
}
