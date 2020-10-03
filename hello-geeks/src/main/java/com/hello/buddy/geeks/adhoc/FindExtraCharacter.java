package com.hello.buddy.geeks.adhoc;

import java.util.Arrays;

public class FindExtraCharacter {

    /***
     * Find one extra character in a string
     *
     * Given two strings which are of lengths n and n+1. The second string contains all the character of the first string, but there is one extra character. Your task to find the extra character in the second string.
     *
     * Examples :
     *
     * Input : string strA = "abcd";
     *         string strB = "cbdae";
     * Output : e
     * string B contain all the element
     * there is a one extra character which is e
     *
     * Input : string strA = "kxml";
     *         string strB = "klxml";
     * Output : l
     * string B contain all the element
     * there is a one extra character which is l
     * Recommended: Please try your approach on {IDE} first, before moving on to the solution.
     * Method 1(Brute Force):-
     * Check with two for loop.
     * Time Complexity:- O(n^2)
     * Space Complexity:- O(1).
     *
     * Method 2(Hash Map):-
     * Create an empty hash table and insert all character of second string. Now remove all characters of first string. Remaining character is the extra character.
     *
     * Time Complexity:- O(n)
     * Auxiliary Space:- O(n).
     *
     ***/

    public String findExtraCharacter(String input1, String input2) {
        String largestInput = input1.length() > input2.length() ? input1 : input2;
        String smallestInput = input1.length() > input2.length() ? input2 : input1;

        return Arrays.stream(largestInput.split(""))
                .filter(x -> !smallestInput.contains(x))
                .findFirst()
                .orElse("");
    }
}
