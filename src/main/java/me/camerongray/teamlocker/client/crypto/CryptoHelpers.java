package me.camerongray.teamlocker.client.crypto;

import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import me.camerongray.teamlocker.client.protobufs.Libsodium;
import org.abstractj.kalium.crypto.Hash;
import org.abstractj.kalium.crypto.Password;
import org.abstractj.kalium.crypto.Random;
import org.abstractj.kalium.crypto.SecretBox;
import org.abstractj.kalium.encoders.Encoder;
import org.abstractj.kalium.keys.*;

import java.util.Base64;

import static org.abstractj.kalium.NaCl.Sodium.*;

/**
 * Created by camerong on 23/05/17.
 */
public class CryptoHelpers {
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

    public static byte[] hashPassword(String password) {
        int opsLimit = CRYPTO_PWHASH_SCRYPTSALSA208SHA256_OPSLIMIT_INTERACTIVE;
        int memLimit = CRYPTO_PWHASH_SCRYPTSALSA208SHA256_MEMLIMIT_INTERACTIVE;

        byte[] hash = new Password().hash(password.getBytes(), Encoder.RAW, opsLimit, memLimit).getBytes();

        return packHash(hash, opsLimit, memLimit);
    }

    public static byte[] hashPassword(String password, String username) {
        // Hash username to generate salt, hashing ensures we have sufficient bytes as usernames tend to be short
        byte[] salt = java.util.Arrays.copyOf(new Hash().sha512(username.getBytes()), 32);

        int opsLimit = CRYPTO_PWHASH_SCRYPTSALSA208SHA256_OPSLIMIT_INTERACTIVE;
        int memLimit = CRYPTO_PWHASH_SCRYPTSALSA208SHA256_MEMLIMIT_INTERACTIVE;

        byte[] hash = new Password().deriveKey(CRYPTO_PWHASH_SCRYPTSALSA208SHA256_OUTBYTES, password.getBytes(), salt,
                opsLimit, memLimit);

        return packHash(hash, opsLimit, memLimit);
    }

    public static boolean verifyHash(byte[] hash, String password) throws InvalidProtocolBufferException {
        return new Password().verify(unpackLibsodiumItem(hash).getData().toByteArray(), password.getBytes());
    }

    public static int getOpsLimit() {
        return CRYPTO_PWHASH_SCRYPTSALSA208SHA256_OPSLIMIT_INTERACTIVE;
    }

    public static long getMemLimit() {
        return CRYPTO_PWHASH_SCRYPTSALSA208SHA256_MEMLIMIT_INTERACTIVE;
    }

    public static byte[] generateNonce(int encryptionType) {
        int length = -1; // TODO - Should we have a default length or raise an exception.etc?

        if (encryptionType == CryptoHelpers.ENCRYPTION_TYPE_SECRET) {
            length = CRYPTO_SECRETBOX_XSALSA20POLY1305_NONCEBYTES;
        } else if (encryptionType == CryptoHelpers.ENCRYPTION_TYPE_BOX) {
            length = CRYPTO_BOX_CURVE25519XSALSA20POLY1305_NONCEBYTES;
        }

        return new Random().randomBytes(length);
    }

    public static byte[] generateSalt() {
        return new Random().randomBytes();
    }

    private static byte[] packHash(byte[] hash, int opsLimit, int memLimit) {
        Libsodium.LibsodiumItem.Builder packedHash = Libsodium.LibsodiumItem.newBuilder();
        packedHash.setData(ByteString.copyFrom(hash));
        packedHash.setOpsLimit(opsLimit);
        packedHash.setMemLimit(memLimit);

        return packedHash.build().toByteArray();
    }

    private static Libsodium.LibsodiumItem unpackLibsodiumItem(byte[] packedItem) throws InvalidProtocolBufferException {
        Libsodium.LibsodiumItem unpacked = Libsodium.LibsodiumItem.parseFrom(packedItem);
        return unpacked;
    }
}
