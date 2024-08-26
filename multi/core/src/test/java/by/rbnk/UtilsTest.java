package by.rbnk;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    private final Utils utils = new Utils();

    @Test
    void testIsAllPositiveNumbers() {
        assertTrue(utils.isAllPositiveNumbers("1", "2", "3", "100"));
        assertFalse(utils.isAllPositiveNumbers("1", "2", "-3", "100"));
        assertFalse(utils.isAllPositiveNumbers("-1", "-2", "-3", "-100"));
        assertFalse(utils.isAllPositiveNumbers());
        assertFalse(utils.isAllPositiveNumbers("0", "0", "0"));
        assertFalse(utils.isAllPositiveNumbers("abc", "2", "100"));
    }
}