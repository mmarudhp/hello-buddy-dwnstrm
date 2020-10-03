package com.hello.buddy.geeks.adhoc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MinSumOfSqrOfCharCount {

    /**
     * Minimum sum of squares of character counts in a given string after removing k characters
     * Given a string of lowercase alphabets and a number k, the task is to print the minimum value of the string after removal of ‘k’ characters.
     * The value of a string is defined as the sum of squares of the count of each distinct character.
     * For example consider the string “saideep”,
     * here frequencies of characters are s-1, a-1, i-1, e-2, d-1, p-1 and value of the string is 1^2 + 1^2 + 1^2 + 1^2 + 1^2 + 2^2 = 9.
     *
     * Expected Time Complexity : O(n)
     *
     * Examples:
     *
     * Input :  str = abccc, K = 1
     * Output :  6
     * We remove c to get the value as 12 + 12 + 22
     *
     * Input :  str = aaab, K = 2
     * Output :  2
     * Asked In : Amazon
     **/

    public long minSumOfSqOfCharCount(String input, int countOfCharsToBeRemoved) {
        Map<String, Long> groupByCDistinctChars = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Collection<Long> values = groupByCDistinctChars.values();
        List<Long> descOrderValues = new ArrayList<>();
        values.stream().sorted(Comparator.reverseOrder()).forEachOrdered(descOrderValues::add);

        int loop = 0;
        long count = countOfCharsToBeRemoved;
        List<Long> finalValues = new ArrayList<>();
        while (loop < descOrderValues.size()) {
            Long value = descOrderValues.get(loop);
            if (count > 0) {
                if (value > count) {
                    finalValues.add(value-count);
                    count = 0;
                } else if (value <= count) {
                    finalValues.add(value - (value-1));
                    count = count - (value - 1);
                }
            } else {
                finalValues.add(value);
            }
            loop++;
        }
        return finalValues.stream().map(x -> x*x).mapToLong(Long::longValue).sum();
    }
}
