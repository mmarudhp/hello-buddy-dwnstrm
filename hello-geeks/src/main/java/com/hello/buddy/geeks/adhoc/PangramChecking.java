package com.hello.buddy.geeks.adhoc;

import java.util.HashSet;
import java.util.Set;

public class PangramChecking {

    /**
     *
     *  Pangram Checking
     * Given a string check if it is Pangram or not. A pangram is a sentence containing every letter in the English Alphabet.
     *
     * Examples : The quick brown fox jumps over the lazy dog ” is a Pangram [Contains all the characters from ‘a’ to ‘z’]
     * “The quick brown fox jumps over the dog” is not a Pangram [Doesn’t contains all the characters from ‘a’ to ‘z’, as ‘l’, ‘z’, ‘y’ are missing]
     ***/

    public boolean isPangram(String input) {
        Set<Character> alphabets = new HashSet<>();

        int loop = 0;
        while (loop < input.length()) {
            if (input.charAt(loop) >= 'a' && input.charAt(loop) <= 'z' ||
                    input.charAt(loop) >= 'A' && input.charAt(loop) <= 'Z') {
                alphabets.add(Character.toLowerCase(input.charAt(loop)));
            }
            loop++;
        }
        return alphabets.size() == 26;
    }
}
