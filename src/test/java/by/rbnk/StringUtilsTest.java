package by.rbnk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringUtilsTest {

    @Test
    public void testIsPositiveNumber() {
        StringUtils utils = new StringUtils();
        assertTrue(utils.isPositiveNumber("123"));
        assertFalse(utils.isPositiveNumber("-123"));
        assertFalse(utils.isPositiveNumber("-123.45"));
        assertFalse(utils.isPositiveNumber("-123,45"));
        assertFalse(utils.isPositiveNumber("0"));
        assertFalse(utils.isPositiveNumber("12a3"));
        assertFalse(utils.isPositiveNumber(""));
        assertFalse(utils.isPositiveNumber(null));
    }
}