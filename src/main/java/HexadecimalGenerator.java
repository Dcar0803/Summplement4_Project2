import java.util.Random;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HexadecimalGenerator {
	
	/**
     * Generates a random 32-character hexadecimal string formatted as
     * xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx.
     *
     * @return A formatted hexadecimal string.
     */
	
	
	public static String generateHexadecimal() {
        Random random = new Random();
        StringBuilder hexBuilder = new StringBuilder();

        // Generate 32 random hexadecimal characters
        for (int i = 0; i < 32; i++) {
            hexBuilder.append(Integer.toHexString(random.nextInt(16)));
        }

        // Format into UUID-like pattern
        return hexBuilder.substring(0, 8) + "-" +
               hexBuilder.substring(8, 12) + "-" +
               hexBuilder.substring(12, 16) + "-" +
               hexBuilder.substring(16, 20) + "-" +
               hexBuilder.substring(20);
    }
	
	
	public static String hashString(String input) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = digest.digest(input.getBytes());
            StringBuilder hexBuilder = new StringBuilder();

            for (byte b : hashBytes) {
                hexBuilder.append(String.format("%02x", b));
            }

            return hexBuilder.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error: SHA-256 algorithm not found", e);
        }
    }
	
	
}//end of class 
