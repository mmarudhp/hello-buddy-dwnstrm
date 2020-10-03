package com.hello.buddy.geeks.adhoc;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseWordInStatementTest {

    private ReverseWordInStatement subject;

    @Before
    public void setup() {
        subject = new ReverseWordInStatement();
    }

    @Test
    public void reverse() {
        assertEquals("geeksforgeeks to Welcome", subject.reverse("Welcome to geeksforgeeks"));
        assertEquals("Programming Java love I", subject.reverse("I love Java Programming"));
    }

}