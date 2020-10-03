package com.hello.buddy.geeks.adhoc;

public class NaiveAlgorithmForPatternSearching {

    // O(n)
    public String findPatternInGivenString(String input, String pattern) {
        StringBuilder result = new StringBuilder();
        for(int loop = 0; loop <= input.length()-pattern.length(); loop++) {
            if (pattern.equalsIgnoreCase(input.substring(loop, loop+pattern.length()))) {
                result.append(loop).append(" ");
            }
        }
        return result.toString().trim();
    }
}
