package com.hello.buddy.geeks.adhoc;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExtractMaxValueFromGnStringTest {

    private ExtractMaxValueFromGnString subject;

    @Before
    public void setup() {
        subject = new ExtractMaxValueFromGnString();
    }

    @Test
    public void extractMaxValueFromGnString() {
        assertEquals(new Integer("564"), subject.extractMaxValue_approach1("100klh564abc365bg"));
        assertEquals(new Integer("365"), subject.extractMaxValue_approach1("abchsd0365sdhs"));

        assertEquals(new Integer("564"), subject.extractMaxValue_approach2("100klh564abc365bg"));
        assertEquals(new Integer("365"), subject.extractMaxValue_approach2("abchsd0365sdhs"));
    }
}