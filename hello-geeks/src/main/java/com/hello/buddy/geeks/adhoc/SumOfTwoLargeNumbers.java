package com.hello.buddy.geeks.adhoc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfTwoLargeNumbers {

    /**
     * Sum of two large numbers
     * Given two numbers as strings. The numbers may be very large (may not fit in long long int), the task is to find sum of these two numbers.
     *
     * Examples:
     *
     * Input  : str1 = "3333311111111111",
     *          str2 =   "44422222221111"
     * Output : 3377733333332222
     *
     * Input  : str1 = "7777555511111111",
     *          str2 =    "3332222221111"
     * Output : 7780887733332222
     ***/

    public String sumOfTwoLargeNumbers(String x1, String x2) {
        List<Integer> x1Collection = Arrays.stream(x1.split("")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> x2Collection = Arrays.stream(x2.split("")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> largestNumber = x1Collection.size() > x2Collection.size() ? x1Collection : x2Collection;
        List<Integer> smallestNumber = x1Collection.size() > x2Collection.size() ? x2Collection : x1Collection;

        int loop = largestNumber.size()-1, carryOver = 0, digitSum, sLoop = smallestNumber.size()-1;
        List<Integer> summationResult = new ArrayList<>();
        while (loop >= 0) {
            if (loop >= (largestNumber.size()-smallestNumber.size())) {
                digitSum = carryOver + largestNumber.get(loop) + smallestNumber.get(sLoop);
                sLoop--;
            } else {
                digitSum = carryOver + largestNumber.get(loop);
            }
            carryOver = loop ==0 ? 0 : digitSum/10;
            summationResult.add(loop ==0 ? digitSum : digitSum%10);
            loop--;
        }

        int resultLoop = summationResult.size()-1;
        StringBuilder sb = new StringBuilder();
        while(resultLoop >= 0) {
            sb.append(summationResult.get(resultLoop));
            resultLoop--;
        }
        return sb.toString();
    }
}
