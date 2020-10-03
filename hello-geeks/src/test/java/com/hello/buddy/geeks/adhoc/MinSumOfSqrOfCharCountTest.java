package com.hello.buddy.geeks.adhoc;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinSumOfSqrOfCharCountTest {

    private MinSumOfSqrOfCharCount subject;

    @Before
    public void setup() {
        subject = new MinSumOfSqrOfCharCount();
    }

    @Test
    public void minSumOfSqOfCharCount() {
        assertEquals(6, subject.minSumOfSqOfCharCount("abccc", 1));
        assertEquals(2, subject.minSumOfSqOfCharCount("aaab", 2));
        assertEquals(10, subject.minSumOfSqOfCharCount("abcdefghijjjj", 3));
        assertEquals(5, subject.minSumOfSqOfCharCount("abcdeee", 2));
    }
}