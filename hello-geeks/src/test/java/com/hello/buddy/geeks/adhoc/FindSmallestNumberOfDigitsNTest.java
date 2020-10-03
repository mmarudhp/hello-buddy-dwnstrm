package com.hello.buddy.geeks.adhoc;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindSmallestNumberOfDigitsNTest {

    private FindSmallestNumberOfDigitsN subject;

    @Before
    public void setup() {
        subject = new FindSmallestNumberOfDigitsN();
    }

    @Test
    public void findSmallestNumberOfDigitsN() {
        assertEquals("500000", subject.findSmallestNumberOfDigitsN(5));
        assertEquals("800000000", subject.findSmallestNumberOfDigitsN(8));
        assertEquals("39000000000000", subject.findSmallestNumberOfDigitsN(12));
    }

//    @Test
    public void sumOfDigits() {
        assertEquals(5, subject.sumOfDigits(500000));
        assertEquals(21L, subject.sumOfDigits(123456));
        assertEquals(36, subject.sumOfDigits(12345678));
    }

}