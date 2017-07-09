package me.teamlocker.client.crypto;

import me.camerongray.teamlocker.client.crypto.CryptoHelpers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert.*;

import static org.abstractj.kalium.NaCl.Sodium.CRYPTO_BOX_CURVE25519XSALSA20POLY1305_NONCEBYTES;
import static org.abstractj.kalium.NaCl.Sodium.CRYPTO_SECRETBOX_XSALSA20POLY1305_NONCEBYTES;

/**
 * Created by camerong on 11/06/17.
 */
public class CryptoHelpersTest {
    @Test
    public void testGenerateSalt() throws Exception {
        byte[] salt = CryptoHelpers.generateSalt();
        Assert.assertNotEquals("Salt had a length of zero", 0, salt.length);
    }

    @Test
    public void testPasswordHashingCorrect() throws Exception {
        String password = "PASSWORD!";
        byte[] hash = CryptoHelpers.hashPassword(password);
        Assert.assertTrue("Verification of a valid hash failed", CryptoHelpers.verifyHash(hash, password));
    }

    @Test
    public void testPasswordHashingIncorrect() throws Exception {
        String password = "PASSWORD!";
        byte[] hash = CryptoHelpers.hashPassword(password);
        Assert.assertFalse("Verification of an invalid hash succeeded", CryptoHelpers.verifyHash(hash,
                "x"+password));
    }

    @Test
    public void testGenerateNonce() throws Exception {
        byte[] secretNonce = CryptoHelpers.generateNonce(CryptoHelpers.ENCRYPTION_TYPE_SECRET);
        byte[] privateNonce = CryptoHelpers.generateNonce(CryptoHelpers.ENCRYPTION_TYPE_BOX);

        Assert.assertEquals("Secret nonce length invalid ", CRYPTO_SECRETBOX_XSALSA20POLY1305_NONCEBYTES,
                secretNonce.length);
        Assert.assertEquals("Private nonce length invalid", CRYPTO_BOX_CURVE25519XSALSA20POLY1305_NONCEBYTES,
                privateNonce.length);
    }
}
