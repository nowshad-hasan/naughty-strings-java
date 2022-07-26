import java.util.List;


/**
 * @author Nowshad Hasan
 * @since 12/7/22 11:07 pm
 */
public class NaughtyStrings {

    public static List<String> getRandomList(int size) {
        return NaughtyStringInternal.getRandomStrings(size);
    }

    public static List<String> getRandomListByType(int size, NaughtyStringType type) {
        return NaughtyStringInternal.getRandomStrings(size, type);
    }

    public static List<String> getListByType(NaughtyStringType type) {
        return NaughtyStringInternal.getStrings(type);
    }

    public static List<String> getAll() {
        return NaughtyStringInternal.ALL_STRING;
    }
}
