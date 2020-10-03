package com.hello.buddy.geeks.adhoc;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NaiveAlgorithmForPatternSearchingTest {

    private NaiveAlgorithmForPatternSearching subject;

    @Before
    public void setup() {
        subject = new NaiveAlgorithmForPatternSearching();
    }

    @Test
    public void findPatternInGivenString() {
        assertEquals("10", subject.findPatternInGivenString("THIS IS A TEST TEXT", "TEST"));
        assertEquals("0 9 12", subject.findPatternInGivenString("AABAACAADAABAABA", "AABA"));
        assertEquals("", subject.findPatternInGivenString("AABCCAADDEE", "FAA"));
        assertEquals("0 1 2 3 4 5 6 7 8 9 10 11 12 13", subject.findPatternInGivenString("AAAAAAAAAAAAAAAAAA", "AAAAA"));
        assertEquals("13", subject.findPatternInGivenString("AAAAAAAAAAAAAAAAAB", "AAAAB"));
        assertEquals("", subject.findPatternInGivenString("ABABABCABABABCABABABC", "ABABAC"));
    }
}
