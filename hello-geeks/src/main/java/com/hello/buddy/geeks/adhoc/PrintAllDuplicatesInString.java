package com.hello.buddy.geeks.adhoc;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintAllDuplicatesInString {

    /***
     *  Print all the duplicates in the input string
     * Write an efficient C program to print all the duplicates and their counts in the input string
     *
     * Algorithm: Let input string be “geeksforgeeks”
     * 1: Construct character count array from the input string.
     *
     * count[‘e’] = 4
     * count[‘g’] = 2
     * count[‘k’] = 2
     * ……
     *
     * 2: Print all the indexes from the constructed array which have value greater than 1.
     ***/

    public String printAllDuplicatesInString(String input) {
        Map<String, Long> groupBy = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return groupBy.entrySet().stream()
                .filter(e -> e.getValue()> 1)
                .map(e -> e.getKey())
                .collect(Collectors.joining(" "))
                .trim();
    }
}
