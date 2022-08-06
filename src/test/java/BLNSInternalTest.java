import org.junit.jupiter.api.Test;

import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class BLNSInternalTest {

    @Test
    void testGetRandomStrings_whenEmptyList_shouldReturnEmptyList() {
        List<String> results = BLNSInternal.getRandomStrings(0, NaughtyStrings.ALL);
        assertTrue(results.isEmpty());
    }

    @Test
    void testGetRandomStrings_whenSingleItemList_shouldReturnSingleItemList() {
        List<String> result = BLNSInternal.getRandomStrings(1, NaughtyStrings.ALL);
        assertFalse(result.isEmpty());
        assertEquals(1, result.size());
    }

    @Test
    void testGetRandomStrings_whenNegativeSize_shouldThrowError() {
        assertThrows(IllegalArgumentException.class, () -> BLNSInternal.getRandomStrings(-1, NaughtyStrings.ALL));
    }

    @Test
    void testGetStrings_whenReservedType_shouldReturnReservedItems() {
        List<String> actualList = BLNSInternal.getStrings(NaughtyStrings.RESERVED_STRINGS);
        List<String> expectedList = NaughtyStrings.RESERVED_STRINGS.getString();
        assertIterableEquals(expectedList, actualList);
    }

    @Test
    void testGetStrings_whenReservedType_shouldReturnListOfStrings() {
        List<String> reservedList = BLNSInternal.getStrings(NaughtyStrings.RESERVED_STRINGS);
        assertTrue(reservedList.size() > 0);
    }

    @Test
    void testGetStrings_whenAllStringType_shouldReturnAllStrings() {
        List<String> allStrings = BLNSInternal.getAllStringList();
        assertIterableEquals(allStrings, BLNSInternal.getStrings(NaughtyStrings.ALL));
    }
}
