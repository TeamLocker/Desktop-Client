package me.camerongray.teamlocker.client.core;

import me.camerongray.teamlocker.client.crypto.CryptoHelpers;
import me.camerongray.teamlocker.client.net.NetworkException;
import me.camerongray.teamlocker.client.net.ServerProvidedException;
import org.abstractj.kalium.keys.KeyPair;

import java.io.IOException;

public class Account {
    private int id;
    private Folder folder;
    private String name;
    private String username;
    private String password;
    private String comments;

    public Account(Folder folder, String name, String username, String password, String comments) {
        this.folder = folder;
        this.name = name;
        this.username = username;
        this.password = password;
        this.comments = comments;
    }

    public Account addToServer() throws ServerProvidedException, NetworkException, IOException {
        // TODO: Fetch all users who should have access to this account
        // TODO: Encrypt account for each of these users
        // TODO: Push Account and all EncryptedAccount objects up to server
        // TODO: Return Account object populated with ID

        User[] users = folder.getReadUsers();
        for(User user : users) {
            System.out.println(user.getFullName());
        }

//        KeyPair keypair = CryptoHelpers.generateKeyPair();
//        byte[] encrypted = CryptoHelpers.encryptWithPublicKey("Foobar".getBytes(),
//                keypair.getPublicKey().toBytes());
//        System.out.println(new String(CryptoHelpers.decryptWithKeypair(encrypted, keypair.getPublicKey().toBytes(),
//                keypair.getPrivateKey().toBytes())));

        return null;
    }
}
