package com.hello.buddy.geeks.adhoc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfAllNumbersPresentInString {

    /***
     *  Calculate sum of all numbers present in a string
     * Given a string containing alphanumeric characters, calculate sum of all numbers present in the string.
     *
     * Examples:
     *
     * Input:  1abc23
     * Output: 24
     *
     * Input:  geeks4geeks
     * Output: 4
     *
     * Input:  1abc2x30yz67
     * Output: 100
     *
     * Input:  123abc
     * Output: 123
     * Difficulty level: Rookie
     *
     ***/

    public Integer sumOfAllNumbersPresentInString(String input) {
        List<String> inputInList = Arrays.stream(input.split("")).collect(Collectors.toList());
        List<String> numericListFromInput = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int loop = 0;
        while(loop < inputInList.size()) {
            if (isNumeric(inputInList.get(loop))) {
                sb.append(inputInList.get(loop));
            } else {
                if (sb.length() > 0) {
                    numericListFromInput.add(sb.toString());
                    sb.setLength(0);
                }
            }
            loop++;
        }

        if(sb.length() > 0) {
            numericListFromInput.add(sb.toString());
            sb.setLength(0);
        }

        return numericListFromInput.stream().map(Integer::parseInt).mapToInt(Integer::intValue).sum();
    }

    private boolean isNumeric(String s) {
        return Character.isDigit(s.charAt(0));
    }
}
