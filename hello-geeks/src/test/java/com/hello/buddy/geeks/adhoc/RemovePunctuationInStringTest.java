package com.hello.buddy.geeks.adhoc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemovePunctuationInStringTest {

    private RemovePunctuationInString subject;

    @Test
    public void setup() {
        subject = new RemovePunctuationInString();
    }

    @Test
    public void removePunctuation() {
        assertEquals("Welcome to GeeksforGeeks", subject.removePunctuation("Welcome???@@##$ to#$% Geeks%$^for$%^&Geeks"));
    }
}