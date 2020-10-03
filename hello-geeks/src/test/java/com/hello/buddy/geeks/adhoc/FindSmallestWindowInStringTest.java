package com.hello.buddy.geeks.adhoc;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindSmallestWindowInStringTest {

    private FindSmallestWindowInString subject;

    @Before
    public void setup() {
        subject = new FindSmallestWindowInString();
    }

    @Test
    public void findSmallestWindowInString() {
//        assertEquals("t stri", subject.findSmalledWindowInString("this is a test string", "tist"));
//        assertEquals("ksfor", subject.findSmalledWindowInString("geeksforgeeks", "ork"));
        assertEquals("cbda", subject.findSmalledWindowInString("aabbceefdssqcbda", "abcd"));
    }
}