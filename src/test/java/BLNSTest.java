import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Nowshad Hasan
 * @since 30/7/22 7:52 am
 */
public class BLNSTest {

    @Test
    void testGetRandomList_whenSizeGreaterThanZero_shouldReturnGreaterThanZeroList() {
        List<String> randomList = BLNS.getRandomList(10, NaughtyStrings.CHANGING_LENGTH_WHEN_LOWERCASE);
        assertTrue(randomList.size() > 0);
    }

    @Test
    void testGetRandomList_whenSizeLessThanZero_shouldThrowError() {
        assertThrows(IllegalArgumentException.class, () -> BLNS.getRandomList(-20, NaughtyStrings.REGIONAL_INDICATOR_SYMBOLS));
    }

    @Test
    void testGetRandomList_whenTypeIsNull_shouldThrowError() {
        assertThrows(IllegalArgumentException.class, () -> BLNS.getRandomList(20, null));
    }

    @Test
    void testGetList_whenNull_shouldThrowError() {
        assertThrows(IllegalArgumentException.class, () -> BLNS.getList(null));
    }

    @Test
    void testGetList_whenAllString_shouldReturnAllStrings() {
        List<String> actualList = BLNSInternal.getAllStringList();
        List<String> expectedList = BLNS.getList(NaughtyStrings.ALL);
        assertIterableEquals(actualList, expectedList);
    }

    @Test
    void testGetList_whenReservedString_shouldReturnReservedStrings() {
        List<String> actualList = BLNSInternal.getStrings(NaughtyStrings.RESERVED_STRINGS);
        List<String> expectedList = BLNS.getList(NaughtyStrings.RESERVED_STRINGS);
        assertIterableEquals(actualList, expectedList);
    }

    @Test
    void testGetList_whenRegionalIndicatorSymbols_shouldReturnRegionalIndicatorSymbols() {
        List<String> actualList = BLNSInternal.getStrings(NaughtyStrings.REGIONAL_INDICATOR_SYMBOLS);
        List<String> expectedList = BLNS.getList(NaughtyStrings.REGIONAL_INDICATOR_SYMBOLS);
        assertIterableEquals(actualList, expectedList);
    }

    @Test
    void testGetList_whenJapaneseEmoticons_shouldReturnJapaneseEmoticons() {
        List<String> actualList = BLNSInternal.getStrings(NaughtyStrings.JAPANESE_EMOTICONS);
        List<String> expectedList = BLNS.getList(NaughtyStrings.JAPANESE_EMOTICONS);
        assertIterableEquals(actualList, expectedList);
    }
}
