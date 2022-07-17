/**
 * @author Nowshad Hasan
 * @since 12/7/22 11:10 pm
 */
public class NaughtyStringMain {
    public static void main(String[] args) {
        System.out.println(NaughtyStrings.getRandomList(5));

        System.out.println(NaughtyStrings.getRandomListByType(1, NaughtyStringType.RESERVED_STRINGS));

        System.out.println(NaughtyStrings.getListByType(NaughtyStringType.NUMERIC_STRINGS));
    }
}
