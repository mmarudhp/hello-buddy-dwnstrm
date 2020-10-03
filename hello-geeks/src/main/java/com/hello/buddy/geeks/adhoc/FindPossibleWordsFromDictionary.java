package com.hello.buddy.geeks.adhoc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/***
 * Possible Words using given characters in Python
 * Given a dictionary and a character array, print all valid words that are possible using characters from the array.
 * Note: Repetitions of characters is not allowed.
 * Examples:
 *
 * Input : Dict = ["go","bat","me","eat","goal","boy", "run"]
 *         arr = ['e','o','b', 'a','m','g', 'l']
 * Output : go, me, goal.
 **/

public class FindPossibleWordsFromDictionary {

    public List<String> findPossibleWords(String[] dicArray, Character[] charArray) {
        ArrayList<String> dictionary = new ArrayList<>(Arrays.asList(dicArray));
        ArrayList<Character> setOfChars = new ArrayList<>(Arrays.asList(charArray));

        if (!dictionary.isEmpty() && !setOfChars.isEmpty()) {
            return dictionary
                    .stream()
                    .map(d -> this.findWord(d, setOfChars))
                    .filter(Objects::nonNull)
                    .collect(Collectors.toList());
        }
        return null;
    }

    private String findWord(String dictionaryWord, List<Character> setOfChars) {
        if (matchWord(dictionaryWord, setOfChars)) {
            return dictionaryWord;
        }

        return null;
    }

    private boolean matchWord(String dictionaryWord, List<Character> setOfChars) {
        // This below clone is required to check the chars which should not be repeated.
        List<Character> cloneOfSetChars = new ArrayList<>(setOfChars);
        char[] charsOfDictionary = dictionaryWord.toCharArray();
        for(int loop = 0; loop<charsOfDictionary.length; loop++) {
            if (!cloneOfSetChars.contains(charsOfDictionary[loop])) {
                return false;
            }

            cloneOfSetChars.remove(Character.valueOf(charsOfDictionary[loop]));
        }
        return true;
    }
}
