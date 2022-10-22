package io.github.nowshad;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Nowshad Hasan
 * @since 29/7/22 2:04 pm
 */
public class NaughtyStringsTest {

    @Test
    void testNumericString_whenNumericString_shouldReturnNumericStringList() {
        List<String> expectedList = NaughtyStrings.NUMERIC_STRINGS.getString();
        List<String> actualList = BLNSInternal.NUMERIC_STRINGS;
        assertIterableEquals(expectedList, actualList);
    }

    @Test
    void testSpecialCharacters_whenSpecialCharacters_shouldReturnGreaterThanZeroList() {
        List<String> expectedList = NaughtyStrings.SPECIAL_CHARACTERS.getString();
        assertTrue(expectedList.size() > 0);
    }
}
