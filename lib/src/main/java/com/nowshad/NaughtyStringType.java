package com.nowshad;

import java.util.List;

public enum NaughtyStringType {
    RESERVED_STRINGS(NaughtyStringInternal.RESERVED_STRINGS),
    NUMERIC_STRINGS(NaughtyStringInternal.NUMERIC_STRINGS);


    private List<String> items;

    NaughtyStringType(List<String> items) {
        this.items = items;
    }

    public List<String> getString() {
        return items;
    }
}
