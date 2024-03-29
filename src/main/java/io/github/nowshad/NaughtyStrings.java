package io.github.nowshad;

import java.util.List;

public enum NaughtyStrings {
    RESERVED_STRINGS(BLNSInternal.RESERVED_STRINGS),
    NUMERIC_STRINGS(BLNSInternal.NUMERIC_STRINGS),
    SPECIAL_CHARACTERS(BLNSInternal.SPECIAL_CHARACTERS),
    UNICODE_SYMBOLS(BLNSInternal.UNICODE_SYMBOLS),
    UNICODE_SUBSCRIPT_SUPERSCRIPT_ACCENTS(BLNSInternal.UNICODE_SUBSCRIPT_SUPERSCRIPT_ACCENTS),
    QUOTATION_MARKS(BLNSInternal.QUOTATION_MARKS),
    TWO_BYTE_CHARACTERS(BLNSInternal.TWO_BYTE_CHARACTERS),
    TWO_BYTE_LETTER(BLNSInternal.TWO_BYTE_LETTER),
    SPECIAL_UNICODE_CHARACTERS_UNION(BLNSInternal.SPECIAL_UNICODE_CHARACTERS_UNION),
    CHANGING_LENGTH_WHEN_LOWERCASE(BLNSInternal.CHANGING_LENGTH_WHEN_LOWERCASE),
    JAPANESE_EMOTICONS(BLNSInternal.JAPANESE_EMOTICONS),
    EMOJI(BLNSInternal.EMOJI),
    REGIONAL_INDICATOR_SYMBOLS(BLNSInternal.REGIONAL_INDICATOR_SYMBOLS),
    UNICODE_NUMBERS(BLNSInternal.UNICODE_NUMBERS),
    RIGHT_TO_LEFT_STRINGS(BLNSInternal.RIGHT_TO_LEFT_STRINGS),
    OGHAM_TEXT(BLNSInternal.OGHAM_TEXT),
    UNICODE_UPSIDE_DOWN(BLNSInternal.UNICODE_UPSIDE_DOWN),
    UNICODE_FONT(BLNSInternal.UNICODE_FONT),
    SCRIPT_INJECTION(BLNSInternal.SCRIPT_INJECTION),
    SQL_INJECTION(BLNSInternal.SQL_INJECTION),
    SERVER_CODE_INJECTION(BLNSInternal.SERVER_CODE_INJECTION),
    COMMAND_INJECTION(BLNSInternal.COMMAND_INJECTION),
    XXE_INJECTION(BLNSInternal.XXE_INJECTION),
    UNWANTED_INTERPOLATION(BLNSInternal.UNWANTED_INTERPOLATION),
    FILE_INCLUSION(BLNSInternal.FILE_INCLUSION),
    CVES_AND_VULNERABILITIES(BLNSInternal.CVES_AND_VULNERABILITIES),
    WINDOWS_SPECIAL_FILENAMES(BLNSInternal.WINDOWS_SPECIAL_FILENAMES),
    IRC_SPECIFIC_STRINGS(BLNSInternal.IRC_SPECIFIC_STRINGS),
    SCUNTHORPE_PROBLEM(BLNSInternal.SCUNTHORPE_PROBLEM),
    HUMAN_INJECTION(BLNSInternal.HUMAN_INJECTION),
    TERMINAL_ESCAPE_CODES(BLNSInternal.TERMINAL_ESCAPE_CODES),
    IOS_VULNERABILITIES(BLNSInternal.IOS_VULNERABILITIES),
    PERSIAN_SPECIAL_CHARACTERS(BLNSInternal.PERSIAN_SPECIAL_CHARACTERS),
    JINJA_2_INJECTION(BLNSInternal.JINJA_2_INJECTION),
    ALL(BLNSInternal.ALL);

    private List<String> items;

    NaughtyStrings(List<String> items) {
        this.items = items;
    }

    public List<String> getString() {
        return items;
    }
}
