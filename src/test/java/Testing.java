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

}//end of class 
