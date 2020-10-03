package com.hello.buddy.geeks.adhoc;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.stream.Collectors;

/**

    Write a Java Program to Swap first and last character of words in a Sentence as mentioned in the example?

        Examples:

        Input : geeks for geeks
        Output :seekg rof seekg
 **/

public class SwapFirstAndLastCharOfWordInSentence {

    public static void main(String[] args) {
        SwapFirstAndLastCharOfWordInSentence swap = new SwapFirstAndLastCharOfWordInSentence();
        String input = "The Indian subcontinent was home to the Indus Valley Civilisation of the bronze age";

        System.out.println("Input : " + input);
        System.out.println("T1 : " + new Timestamp(System.currentTimeMillis()));
        System.out.println("Output : " + swap.swapByLoop(input));
        System.out.println("T2 : " + new Timestamp(System.currentTimeMillis()));
        System.out.println("Output : " + swap.swapByStreans(input));
        System.out.println("T3 : " + new Timestamp(System.currentTimeMillis()));
    }

    private String swapByStreans(String input) {
        return Arrays.asList(input.split(" "))
                .stream()
                .map(this::swapFirstAndLastCharInWord)
                .collect(Collectors.joining(" ")).trim();
    }

    private String swapByLoop(String input) {
        String[] ipArr = input.split(" ");
        StringBuilder sb = new StringBuilder();
        int loop = 0;
        while(loop < ipArr.length) {
            String swapWord = swapFirstAndLastCharInWord(ipArr[loop]);
            sb.append(swapWord).append(" ");
            loop++;
        }
        return sb.toString().trim();
    }

    private String swapFirstAndLastCharInWord(String word) {
        char[] chars = word.toCharArray();
        char temp = chars[0];
        chars[0] = chars[chars.length-1];
        chars[chars.length-1] = temp;
        return new String(chars);
    }
}
