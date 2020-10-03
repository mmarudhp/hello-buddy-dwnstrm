package com.hello.buddy.geeks.adhoc;

import java.util.Arrays;

public class HighestNumber {

    /**
     * Find the highest number from the possible combination of digits from given number
     **/

    public static void main(String[] args) {
        int input = 8796;
        int[] arrays = convertToArraysAndSort(input);

        System.out.println("Highest Possible Number for " + input + " is : " + findHighestNumber(arrays));
    }

    private static int findHighestNumber(int[] arrays) {
        StringBuilder builder = new StringBuilder();
        int loop = arrays.length;
        while(loop > 0) {
            builder.append(arrays[--loop]);
        }
        return Integer.parseInt(builder.toString());
    }

    private static int[] convertToArraysAndSort(int input) {
        String given = Integer.toString(input);
        int length = given.length();
        int[] digits = new int[length];
        int loop = 0;
        while (loop < length) {
            digits[loop] = Character.getNumericValue(given.charAt(loop));
            loop++;
        }
        Arrays.sort(digits);
        System.out.println("--> digits : " + digits.length);
        return digits;
    }
}
