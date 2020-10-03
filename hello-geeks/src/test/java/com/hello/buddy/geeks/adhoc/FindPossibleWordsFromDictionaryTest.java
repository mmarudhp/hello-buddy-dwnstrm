package com.hello.buddy.geeks.adhoc;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class FindPossibleWordsFromDictionaryTest {

    private FindPossibleWordsFromDictionary subject;

    @Before
    public void setup() {
        subject = new FindPossibleWordsFromDictionary();
    }

    @Test
    public void findPossibleWord() {
        String[] dictionaryAry = new String[]{"go","bat","me","eat","goal","boy", "run"};
        Character[] charAry = new Character[]{'e','o','b', 'a','m','g', 'l'};
        assertEquals(Arrays.asList("go", "me", "goal"), subject.findPossibleWords(dictionaryAry, charAry));
    }
}