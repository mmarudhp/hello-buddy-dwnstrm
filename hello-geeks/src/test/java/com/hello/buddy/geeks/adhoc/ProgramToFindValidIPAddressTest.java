package com.hello.buddy.geeks.adhoc;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ProgramToFindValidIPAddressTest {

    public ProgramToFindValidIPAddress subject;

    @Before
    public void setup() {
        subject = new ProgramToFindValidIPAddress();
    }

    @Test
    public void findValidIPAddress() {
        assertTrue(subject.isValidIPAddress("19.128.1.1"));
        assertTrue(subject.isValidIPAddress("19.10.1.1"));
        assertFalse(subject.isValidIPAddress("19.10.aaa.aaaa1"));
        assertFalse(subject.isValidIPAddress("19.101"));
    }
}
