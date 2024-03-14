/* Write a Java program to create an interface Encryptable with methods encrypt (String data) and decrypt (String encryptedData) that
define encryption and decryption operations. Create two classes AES and RSA that implement the Encryptable interface and provide their
own encryption and decryption algorithms. */

interface Encryptable {
    String encrypt(String str);
    String decrypt(String str1);
}

class AES implements Encryptable {
    public String encrypt(String str) {
        System.out.println("AES encryption: " + str);
        return "AES-EncryptedData";
    }

    public String decrypt(String str1) {
        System.out.println("AES decryption: " + str1);
        return "AES-DecryptedData";
    }
}

class RSA implements Encryptable {
    public String encrypt(String data) {
        // Implement RSA encryption algorithm
        System.out.println("RSA encryption: " + data);
        return "RSA-EncryptedData";
    }

    public String decrypt(String encryptedData) {
        // Implement RSA decryption algorithm
        System.out.println("RSA decryption: " + encryptedData);
        return "RSA-DecryptedData";
    }
}

class Q10 {
    public static void main(String[] args) {
        Encryptable aesEncryptor = new AES();
        Encryptable rsaEncryptor = new RSA();
        String aesData = "SensitiveData";
        String aesEncrypted = aesEncryptor.encrypt(aesData);
        String aesDecrypted = aesEncryptor.decrypt(aesEncrypted);

        String rsaData = "ConfidentialInfo";
        String rsaEncrypted = rsaEncryptor.encrypt(rsaData);
        String rsaDecrypted = rsaEncryptor.decrypt(rsaEncrypted);
    }
}