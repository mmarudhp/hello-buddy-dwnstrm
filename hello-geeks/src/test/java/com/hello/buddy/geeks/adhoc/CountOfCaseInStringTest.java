package com.hello.buddy.geeks.adhoc;

import org.junit.Before;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.assertEquals;

public class CountOfCaseInStringTest {

    private CountOfCaseInString subject;

    @Before
    public void setup() {
        subject = new CountOfCaseInString();
    }

    @Test
    public void countOfCaseInString() {
        Map<String, Long> actual = subject.countOfCaseInString("#GeeKs01fOr@gEEks07");
        assertEquals(new Long(5), actual.get("UpperCase"));
        assertEquals(new Long(8), actual.get("LowerCase"));
        assertEquals(new Long(2), actual.get("SpecialCase"));
        assertEquals(new Long(4), actual.get("Number"));
    }
}