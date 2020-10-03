package com.hello.buddy.geeks.adhoc;

import java.util.Arrays;

public class FindSmallestNumberOfDigitsN {

    /**
     * Smallest number with sum of digits as N and divisible by 10^N
     * Find the smallest number such that the sum of its digits is N and it is divisible by 10^N.
     *
     * Examples :
     *
     * Input : N = 5
     * Output : 500000
     * 500000 is the smallest number divisible
     * by 10^5 and sum of digits as 5.
     *
     * Input : N = 20
     * Output : 29900000000000000000000
     **/

    public String findSmallestNumberOfDigitsN(int input) {
        Double tenPowerOfInp = Math.pow(10, input);
        Long min = tenPowerOfInp.longValue();
        int loop = 1;
        while(true) {
            long possibleValue = min * loop;
            if (sumOfDigits(possibleValue) == input && divisibleBy10PowN(possibleValue, min)) {
                return Long.toString(possibleValue);
            }
            loop++;
        }
    }

    public int sumOfDigits(long possibleValue) {
        return Arrays.stream(String.valueOf(possibleValue).split(""))
                .mapToInt(Integer::parseInt)
                .sum();
    }

    public boolean divisibleBy10PowN(long possibleValue, long min) {
        return possibleValue % min == 0;
    }
}
