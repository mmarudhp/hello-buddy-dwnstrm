package com.hello.buddy.geeks.adhoc;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PangramCheckingTest {

    private PangramChecking subject;

    @Before
    public void setup() {
        subject = new PangramChecking();
    }

    @Test
    public void isPangram() {
        assertTrue(subject.isPangram("The quick brown fox jumps over the lazy dog"));
        assertFalse(subject.isPangram("The quick brown fox jumps over the dog"));
    }
}