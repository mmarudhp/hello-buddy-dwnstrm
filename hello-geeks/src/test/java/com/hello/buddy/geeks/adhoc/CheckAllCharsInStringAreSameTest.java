package com.hello.buddy.geeks.adhoc;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CheckAllCharsInStringAreSameTest {

    private CheckAllCharsInStringAreSame subject;

    @Before
    public void setup() {
        subject = new CheckAllCharsInStringAreSame();
    }

    @Test
    public void checkAllCharsInStringAreSame() {
        assertTrue(subject.checkAllCharsInStringAreSame("aaaaaaaaaaaaaaaa"));
        assertFalse(subject.checkAllCharsInStringAreSame("Geeks"));
    }
}