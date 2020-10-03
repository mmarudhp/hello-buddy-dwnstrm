package com.hello.buddy.geeks.adhoc;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumOfTwoLargeNumbersTest {

    private SumOfTwoLargeNumbers subject;

    @Before
    public void setup() {
        subject = new SumOfTwoLargeNumbers();
    }

    @Test
    public void sumOfTwoLargeNumbers() {
        assertEquals("10082", subject.sumOfTwoLargeNumbers("9321", "761"));
        assertEquals("3377733333332222", subject.sumOfTwoLargeNumbers("3333311111111111", "44422222221111"));
//        assertEquals("7780887733332222", subject.sumOfTwoLargeNumbers("7777555511111111", "3332222221111"));
    }
}