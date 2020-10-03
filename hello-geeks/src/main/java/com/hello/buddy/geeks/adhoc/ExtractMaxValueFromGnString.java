package com.hello.buddy.geeks.adhoc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ExtractMaxValueFromGnString {
    /***
     * Extract maximum numeric value from a given string | Set 2 (Regex approach)
     * Given an alphanumeric string, extract maximum numeric value from that string.
     *
     * Examples:
     *
     * Input : 100klh564abc365bg
     * Output : 564
     * Maximum numeric value among 100, 564
     * and 365 is 564.
     * Input : abchsd0365sdhs
     * Output : 365
     ***/

    public Integer extractMaxValue_approach1(String input) {
        List<String> inputAsChar = Arrays.stream(input.split("")).collect(Collectors.toList());
        List<Integer> numericList = new ArrayList<>();

        int loop = 0;
        StringBuilder numericValue = new StringBuilder();
        while (loop < inputAsChar.size()) {
            if(isNumeric(inputAsChar.get(loop))) {
                numericValue.append(inputAsChar.get(loop));
            } else {
                if (numericValue.length() > 0) {
                    numericList.add(Integer.parseInt(numericValue.toString()));
                    numericValue.setLength(0);
                }
            }
            loop++;
        }

        if (numericValue.length() > 0) {
            numericList.add(Integer.parseInt(numericValue.toString()));
            numericValue.setLength(0);
        }

        return numericList.stream().max(Comparator.comparing(Integer::valueOf)).get();
    }

    private boolean isNumeric(String strChar) {
        return Character.isDigit(strChar.charAt(0));
    }

    public Integer extractMaxValue_approach2(String input) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(input);
        int max = 0;

        while(matcher.find()) {
            int num = Integer.parseInt(matcher.group());
            max = max < num ? num : max;
        }
        return max;
    }
}
