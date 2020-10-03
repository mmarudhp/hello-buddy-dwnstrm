package com.hello.buddy.geeks.adhoc;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOfCaseInString {

    /***
     * Count Uppercase, Lowercase, special character and numeric values
     * Given a string, write a program to count the occurrence of Lowercase characters, Uppercase characters, Special characters and Numeric values.
     *
     * Examples:
     *
     * Input : #GeeKs01fOr@gEEks07
     * Output :
     * Upper case letters : 5
     * Lower case letters : 8
     * Numbers : 4
     * Special Characters : 2
     *
     * Input : *GeEkS4GeEkS*
     * Output :
     * Upper case letters : 6
     * Lower case letters : 4
     * Numbers : 1
     * Special Characters : 2
     ***/

    public Map<String, Long> countOfCaseInString(String input) {
        return Arrays.stream(input.split(""))
                .map(this::getCaseOfChar)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    private String getCaseOfChar(String character) {
        char ch = character.charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            return "LowerCase";
        } else if (ch >= 'A' && ch <= 'Z') {
            return "UpperCase";
        } else if (ch >= '0' && ch <= '9') {
            return "Number";
        }
        return "SpecialCase";
    }
}
