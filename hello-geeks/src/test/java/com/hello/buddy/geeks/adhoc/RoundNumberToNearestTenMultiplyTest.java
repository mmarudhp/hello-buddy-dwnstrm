package com.hello.buddy.geeks.adhoc;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoundNumberToNearestTenMultiplyTest {

    private RoundNumberToNearestTenMultiply subject;

    @Before
    public void setup() {
        subject = new RoundNumberToNearestTenMultiply();
    }

    @Test
    public void roundOfNumber() {
        assertEquals(new Integer(4720), subject.roundOfNumber(4722));
        assertEquals(new Integer(40), subject.roundOfNumber(38));
        assertEquals(new Integer(10), subject.roundOfNumber(10));
    }
}