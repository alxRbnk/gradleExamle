package by.rbnk;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringUtilsTest {

    @ParameterizedTest
    @ValueSource(strings = {"123", "456", "789"})
    public void testIsPositiveNumber_positiveCases(String input) {
        StringUtils utils = new StringUtils();
        assertTrue(utils.isPositiveNumber(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"-123", "-123.45", "-123,45", "0", "12a3", ""})
    public void testIsPositiveNumber_negativeCases(String input) {
        StringUtils utils = new StringUtils();
        assertFalse(utils.isPositiveNumber(input));
    }
}