/**
 * @author Nowshad Hasan
 * @since 12/7/22 11:10 pm
 */
public class BLNSMain {
    public static void main(String[] args) {
        System.out.println(BLNS.getRandomList(5, NaughtyStrings.ALL));
        System.out.println(BLNS.getRandomList(3, NaughtyStrings.TWO_BYTE_CHARACTERS));
        System.out.println(BLNS.getList(NaughtyStrings.TWO_BYTE_CHARACTERS));
        System.out.println(BLNS.getList(NaughtyStrings.ALL));
    }
}
