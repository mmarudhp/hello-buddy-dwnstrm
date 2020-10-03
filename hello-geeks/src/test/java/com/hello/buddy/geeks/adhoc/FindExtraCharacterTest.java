package com.hello.buddy.geeks.adhoc;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindExtraCharacterTest {

    private FindExtraCharacter subject;

    @Before
    public void setup() {
        subject = new FindExtraCharacter();
    }

    @Test
    public void findExtraCharacter() {
        assertEquals("e", subject.findExtraCharacter("abcd", "cbdae"));
    }
}