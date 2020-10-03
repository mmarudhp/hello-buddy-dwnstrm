package com.hello.buddy.geeks.adhoc;

public class RoundNumberToNearestTenMultiply {

    /**
     * Round the given number to nearest multiple of 10
     * Given a positive integer n, round it to nearest whole number having zero as last digit.
     *
     * Examples:
     *
     * Input : 4722
     * Output : 4720
     *
     * Input : 38
     * Output : 40
     *
     * Input : 10
     * Output: 10
     *
     ***/

    public Integer roundOfNumber(Integer input) {
        Integer modOfTen = input % 10;

        return modOfTen < 5 ?
                input - modOfTen :
                input + (10 - modOfTen);
    }
}
