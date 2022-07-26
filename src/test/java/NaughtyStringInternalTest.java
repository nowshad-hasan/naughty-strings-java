import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NaughtyStringInternalTest {

    @Test
    void testGetRandomStrings_whenEmptyList_shouldReturnEmptyList() {
        List<String> results = NaughtyStringInternal.getRandomStrings(0);
        assertTrue(results.isEmpty());
    }

    @Test
    void testGetRandomStrings_whenSingleItemList_shouldReturnSingleItemList() {
        List<String> result = NaughtyStringInternal.getRandomStrings(1);
        assertFalse(result.isEmpty());
        assertEquals(1, result.size());
    }

    @Test
    void testGetRandomStrings_whenNegativeSize_shouldThrowError() {
        assertThrows(IllegalArgumentException.class, () -> NaughtyStringInternal.getRandomStrings(-1));
    }

    //todo fail for single test run
    //pass when full class test runs
    @Test
    void testGetStrings_whenReservedType_shouldReturnReservedItems() {
        List<String> actualList = NaughtyStringInternal.getStrings(NaughtyStringType.RESERVED_STRINGS);
        List<String> expectedList = NaughtyStringType.RESERVED_STRINGS.getString();
        assertIterableEquals(expectedList, actualList);
    }

    @Test
    void testGetStrings_whenReservedType_shouldReturnListOfStrings(){
        List<String> reservedList = NaughtyStringInternal.getStrings(NaughtyStringType.RESERVED_STRINGS);
        assertTrue(reservedList.size()>0);
    }
}
