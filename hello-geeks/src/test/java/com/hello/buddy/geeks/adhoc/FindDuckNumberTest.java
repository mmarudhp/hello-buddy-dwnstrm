package com.hello.buddy.geeks.adhoc;

import org.junit.Before;
import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FindDuckNumberTest {

    private FindDuckNumber subject;

    @Before
    public void setup() {
        subject = new FindDuckNumber();
    }

    public void checkDuckNumber() {
        assertTrue(subject.checkDuckNumber("9020202"));
        assertTrue(subject.checkDuckNumber("1990"));
        assertFalse(subject.checkDuckNumber("01919"));
    }

    @Test
    public void test() {
        Pattern p = Pattern.compile(".");
        System.out.println(p.matcher("skdhskdjfh").matches());
    }
}