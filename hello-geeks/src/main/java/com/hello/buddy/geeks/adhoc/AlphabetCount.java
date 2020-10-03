package com.hello.buddy.geeks.adhoc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AlphabetCount {
    /**
     * IP : AAAAABBBCCCCDD
     * OP : A5B3C4D2
     **/

    public String countOfAlphabetUsingStream(String input) {
        Map<String, Long> collect = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return collect.entrySet().stream().map(e -> e.getKey()+ e.getValue()).collect(Collectors.joining());
    }

    public String countOfAlphabetUsingBruteForce(String input) {
        Map<String, Integer> tempMap = new HashMap<>();
        int loop = 0;
        while(loop <= input.length()-1) {
            String charAt = Character.toString(input.charAt(loop));
            if (tempMap.containsKey(charAt)) {
                Integer count = tempMap.get(charAt);
                tempMap.put(charAt, ++count);
            } else {
                tempMap.put(charAt, 1);
            }
            loop++;
        }
        tempMap.forEach((k, v) -> System.out.println("Key : " + k + ", value : " + v));

        StringBuilder sb = new StringBuilder();
        for(String key : tempMap.keySet()) {
            sb.append(key).append(tempMap.get(key));
        }
        return sb.toString();
    }
}
