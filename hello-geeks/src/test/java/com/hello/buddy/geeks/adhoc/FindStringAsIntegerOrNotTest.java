package com.hello.buddy.geeks.adhoc;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FindStringAsIntegerOrNotTest {

    private FindStringAsIntegerOrNot subject;

    @Before
    public void setup() {
        subject = new FindStringAsIntegerOrNot();
    }

    @Test
    public void isNumeric() {
        assertTrue(subject.isNumeric("123456789"));
        assertFalse(subject.isNumeric("123456asd9"));
    }
}