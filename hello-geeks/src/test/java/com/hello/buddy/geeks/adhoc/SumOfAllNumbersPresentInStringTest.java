package com.hello.buddy.geeks.adhoc;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumOfAllNumbersPresentInStringTest {

    private SumOfAllNumbersPresentInString subject;

    @Before
    public void setup() {
        subject = new SumOfAllNumbersPresentInString();
    }

    @Test
    public void sumOfAllNumbersPresentInString() {
        assertEquals(new Integer(24), subject.sumOfAllNumbersPresentInString("1abc23"));
        assertEquals(new Integer(4), subject.sumOfAllNumbersPresentInString("geeks4geeks"));
        assertEquals(new Integer(100), subject.sumOfAllNumbersPresentInString("1abc2x30yz67"));
        assertEquals(new Integer(123), subject.sumOfAllNumbersPresentInString("123abc"));
    }

}