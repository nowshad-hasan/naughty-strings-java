package com.nowshad;

import java.util.*;


/**
 * @author Nowshad Hasan
 * @since 12/7/22 11:07 pm
 */
public class NaughtyStrings {

    public static List<String> getRandomStrings(int size) {
        return NaughtyStringInternal.getRandomStrings(size);
    }

    public static List<String> getRandomStrings(int size, NaughtyStringType type) {
        return NaughtyStringInternal.getRandomStrings(size, type);
    }
}
