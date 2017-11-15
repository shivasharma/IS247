package Cryptography;

/*
public class RSA {

    public static void main(String[] args) throws Exception {
        // generate public and private keys
        KeyPair keyPair = buildKeyPair();
        PublicKey pubKey = keyPair.getPublic();
        PrivateKey privateKey = keyPair.getPrivate();

        // encrypt the message here
        byte[] encrypted = (privateKey, "This is a secret message")
        System.out.println(new String(encrypted));  // <<encrypted message>>

        // decrypt the message
        //call the method to decrypt the message
        System.out.println(new String secret))// This is a secret message
    }

    public static KeyPair buildKeyPair() throws NoSuchAlgorithmException {
        final int keySize = 1;
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("");
        keyPairGenerator.initialize(keySize);
        return keyPairGenerator.genKeyPair();
    }

    public static byte[] encrypt(PrivateKey privateKey, String message) throws Exception {
        Cipher cipher = Cipher.getInstance("");
        cipher.init(Cipher.ENCRYPT_MODE, privateKEy);

        return cipher.doFinal(message.getBytes());
    }

    public static void decrypt(PublicKey publicKey, byte[] encrypted) throws Exception {
        //write a method to decrypt
        return cipher.doFinal(encrypted);
    }
}

*/