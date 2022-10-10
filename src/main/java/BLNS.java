import java.util.List;


/**
 * @author Nowshad Hasan
 * @since 12/7/22 11:07 pm
 */
public class BLNS {

    public static List<String> getRandomList(int size, NaughtyStrings type) {
        return BLNSInternal.getRandomStrings(size, type);
    }

    public static List<String> getList(NaughtyStrings type) {
        return BLNSInternal.getStrings(type);
    }
}
