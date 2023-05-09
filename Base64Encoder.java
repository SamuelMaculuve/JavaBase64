import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class Base64Encoder {

    public static void main(String[] args) throws Exception {
        // Data to encrypt
        String data = "926w3oz6aldz4cr5eomouvj6wg5xqian";

        // Secret key used for encryption
        String secretKey = "isutcsamuelisutc";

        // Convert the secret key to a byte array
        byte[] keyBytes = secretKey.getBytes("UTF-8");

        // Create a secret key from the byte array
        SecretKeySpec secretKeySpec = new SecretKeySpec(keyBytes, "AES");
        
        // Initialize the cipher for encryption
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);

        // Encrypt the data
        byte[] encryptedData = cipher.doFinal(data.getBytes("UTF-8"));

        // Encode the encrypted data using Base64
        String encodedData = Base64.getEncoder().encodeToString(encryptedData);

        // Print the encoded data to the console
        System.out.println(encodedData);
    }
}
