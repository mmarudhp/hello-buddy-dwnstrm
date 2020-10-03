package com.hello.buddy.geeks.adhoc;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AlphabetCountTest {

    private AlphabetCount subject;

    @Before
    public void setup() {
        subject = new AlphabetCount();
    }

    @Test
    public void countOfAlphabet_usingStream() {
        assertEquals("A5B3C4D2", subject.countOfAlphabetUsingStream("AAAAABBBCCCCDD"));
    }

    @Test
    public void countOfAlphabet_usingBruteForce() {
        assertEquals("A5B3C4D2", subject.countOfAlphabetUsingBruteForce("AAAAABBBCCCCDD"));
    }

}