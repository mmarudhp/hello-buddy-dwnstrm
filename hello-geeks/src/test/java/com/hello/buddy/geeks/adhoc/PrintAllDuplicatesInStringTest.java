package com.hello.buddy.geeks.adhoc;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrintAllDuplicatesInStringTest {

    private PrintAllDuplicatesInString subject;

    @Before
    public void setup() {
        subject = new PrintAllDuplicatesInString();
    }

    @Test
    public void printAllDuplicatesInString() {
        assertEquals("s t", subject.printAllDuplicatesInString("test string"));
        assertEquals("u", subject.printAllDuplicatesInString("Marudhu"));
    }
}