package com.hello.buddy.geeks.adhoc;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CheckAllCharsInStringAreSame {

    /***
     * Quick way to check if all the characters of a string are same
     * Given a string, check if all the characters of the string are same or not.
     *
     * Examples:
     *
     * Input : s = "geeks"
     * Output : No
     *
     * Input : s = "gggg"
     * Output : Yes
     *
     ***/

    public boolean checkAllCharsInStringAreSame(String input) {
        Map<String, Long> collect = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return collect.size() == 1;
    }
}
