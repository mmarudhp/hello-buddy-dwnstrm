package com.hello.buddy.geeks.adhoc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
    Java program to expand a String if range is given?
    Suppose we have given a String in which some ranges as specified and we have to place the numbers
    which is between the given range in the specified place as given in the example:

    Examples:

    Input : string x = "1-5, 8, 11-14, 18, 20, 26-29"
    Output : string y = "1, 2, 3, 4, 5, 8, 11, 12,
    13, 14, 18, 20, 26, 27, 28, 29"

 ***/

public class ExpandStringInRange {

    public String expandInRange(String input) {
        String output =  Arrays.asList(input.split(", "))
                .stream()
                .map(this::splitByHypen)
                .map(this::subInputByHypen)
                .collect(Collectors.joining())
                .trim();
        return output.substring(0, output.length()-1);
    }

    private List<String> splitByHypen(String rangeInputByComma) {
        return Arrays.asList(rangeInputByComma.split("-"));
    }

    private String subInputByHypen(List<String> range) {
        StringBuilder sb = new StringBuilder();

        if(range.size() == 1) {
            return sb.append(range.get(0)).append(", ").toString();
        }

        Integer lowerBound = Integer.parseInt(range.get(0));
        Integer upperBound = Integer.parseInt(range.get(1));
        while(lowerBound <= upperBound) {
            sb.append(lowerBound).append(", ");
            lowerBound++;
        }
        return sb.toString();
    }
}
