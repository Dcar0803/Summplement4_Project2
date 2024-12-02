import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testing {

	@Test
    void testGenerateHexadecimal() {
        String hex = HexadecimalGenerator.generateHexadecimal();
        assertNotNull(hex, "Generated hexadecimal string should not be null");
        assertTrue(hex.matches("^[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}$"),
                "Generated string should match the required hexadecimal format");
    }
	
	
	 @Test
	    void testHashString() {
	        String input = "testInput";
	        String hash = HexadecimalGenerator.hashString(input);
	        assertNotNull(hash, "Hashed string should not be null");
	        assertTrue(hash.matches("^[a-fA-F0-9]+$"), "Hashed string should only contain hexadecimal characters");
	    }
	 
	 
	 
	 @Test
	    void testStringArrayInsert() {
	        StringArrayHandler arrayHandler = new StringArrayHandler(10);
	        String hexString = "12345678-1234-1234-1234-1234567890ab";
	        arrayHandler.insert(hexString, 12);
	        assertEquals(hexString, arrayHandler.get(2), "The string should be inserted at index 2 (12 % 10 = 2)");
	    }

}//end of class 
