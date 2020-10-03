package com.hello.buddy.geeks.adhoc;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExpandStringInRangeTest {

    private ExpandStringInRange subject;

    @Before
    public void setup() {
        subject = new ExpandStringInRange();
    }

    @Test
    public void expandInRange() {
        assertEquals("1, 2, 3, 4, 5, 8, 11, 12, 13, 14, 18, 20, 26, 27, 28, 29", subject.expandInRange("1-5, 8, 11-14, 18, 20, 26-29"));
        assertEquals("1, 2, 3", subject.expandInRange("1-3"));
        assertEquals("1", subject.expandInRange("1"));
    }
}