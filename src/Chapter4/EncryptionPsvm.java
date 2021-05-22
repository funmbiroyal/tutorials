package Chapter4;

public class EncryptionPsvm {
    public static void main(String[] args) {
        Encryption encryption = new Encryption();
        encryption.encrypt(2345);
        System.out.println("The encrypted message is "+ " "+ encryption.getEncryptedMessage());
        encryption.decrypt(1290);
        System.out.println("The decrypted message is "+ " "+ encryption.getDecryptedMessage());
    }
}
