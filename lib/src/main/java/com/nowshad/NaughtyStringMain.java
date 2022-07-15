package com.nowshad;

/**
 * @author Nowshad Hasan
 * @since 12/7/22 11:10 pm
 */
public class NaughtyStringMain {
    public static void main(String[] args) {
//        System.out.println(NaughtyStrings.AllStrings);
        System.out.println(NaughtyStrings.getRandomStrings(5));

        System.out.println(NaughtyStrings.getRandomStrings(0, NaughtyStringType.RESERVED_STRINGS));
    }
}
