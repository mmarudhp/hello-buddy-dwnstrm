package com.hello.buddy.geeks.adhoc;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindInitialsOfNameTest {

    private FindInitialsOfName subject;

    @Before
    public void setup() {
        subject = new FindInitialsOfName();
    }

    @Test
    public void findInitialsOfName() {
        assertEquals("M M", subject.findInitialsOfName("Marudhupandian Maruthan"));
        assertEquals("P K S", subject.findInitialsOfName("prabhat kumar singh"));
    }
}