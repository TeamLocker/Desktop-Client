package me.camerongray.teamlocker.client.crypto;

import org.abstractj.kalium.crypto.Password;
import org.abstractj.kalium.crypto.Random;
import org.abstractj.kalium.crypto.SealedBox;
import org.abstractj.kalium.crypto.SecretBox;
import org.abstractj.kalium.encoders.Encoder;
import org.abstractj.kalium.keys.*;
import static org.abstractj.kalium.NaCl.Sodium.*;

/**
 * Created by camerong on 23/05/17.
 */
public class Crypto {
    public static final int ENCRYPTION_TYPE_SECRET = 0;
    public static final int ENCRYPTION_TYPE_BOX = 1;

    public static KeyPair generateKeyPair() {
        KeyPair pair = new KeyPair();
        return pair;
    }

    public static byte[] encryptWithSecret(byte[] message, byte[] key, byte[] nonce) {
        SecretBox box = new SecretBox(key);
        return box.encrypt(nonce, message);
    }

    public static byte[] deriveKeyFromPassword(String password, byte[] salt) {
        byte[] key = new Password().deriveKey(CRYPTO_SECRETBOX_XSALSA20POLY1305_KEYBYTES, password.getBytes(), salt,
                CRYPTO_PWHASH_SCRYPTSALSA208SHA256_OPSLIMIT_INTERACTIVE,
                CRYPTO_PWHASH_SCRYPTSALSA208SHA256_MEMLIMIT_INTERACTIVE);
        return key;
    }

    public static String hashPassword(String password) {
        return new Password().hash(password.getBytes(), Encoder.HEX,
                CRYPTO_PWHASH_SCRYPTSALSA208SHA256_OPSLIMIT_INTERACTIVE,
                CRYPTO_PWHASH_SCRYPTSALSA208SHA256_MEMLIMIT_INTERACTIVE);
    }

    public static int getOpsLimit() {
        return CRYPTO_PWHASH_SCRYPTSALSA208SHA256_OPSLIMIT_INTERACTIVE;
    }

    public static long getMemLimit() {
        return CRYPTO_PWHASH_SCRYPTSALSA208SHA256_MEMLIMIT_INTERACTIVE;
    }

    public static byte[] generateNonce(int encryptionType) {
        int length = -1; // TODO - Should we have a default length or raise an exception.etc?

        if (encryptionType == Crypto.ENCRYPTION_TYPE_SECRET) {
            length = CRYPTO_SECRETBOX_XSALSA20POLY1305_NONCEBYTES;
        } else if (encryptionType == Crypto.ENCRYPTION_TYPE_BOX) {
            length = CRYPTO_BOX_CURVE25519XSALSA20POLY1305_NONCEBYTES;
        }

        return new Random().randomBytes(length);
    }

    public static byte[] generateSalt() {
        return new Random().randomBytes();
    }
}
