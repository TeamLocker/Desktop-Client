package me.camerongray.teamlocker.client.core;

import me.camerongray.teamlocker.client.crypto.CryptoHelpers;
import org.abstractj.kalium.keys.KeyPair;

public class Account {
    private int id;
    private String name;
    private String username;
    private String password;
    private String comments;

    public Account(String name, String username, String password, String comments) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.comments = comments;
    }

    public Account addToServer() {
        // TODO: Fetch all users who should have access to this account
        // TODO: Encrypt account for each of these users
        // TODO: Push Account and all EncryptedAccount objects up to server
        // TODO: Return Account object populated with ID

        KeyPair keypair = CryptoHelpers.generateKeyPair();
        byte[] encrypted = CryptoHelpers.encryptWithPublicKey("Foobar".getBytes(),
                keypair.getPublicKey().toBytes());
        System.out.println(new String(CryptoHelpers.decryptWithKeypair(encrypted, keypair.getPublicKey().toBytes(),
                keypair.getPrivateKey().toBytes())));

        return null;
    }
}
