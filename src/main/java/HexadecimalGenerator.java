import java.util.Random;

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
}//end of class 
