package com.hello.buddy.geeks.adhoc;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
    Reverse words in a given String in Java
    Let’s see an approach to reverse words of a given String in Java without using any of the String library function

    Examples:

    Input : "Welcome to geeksforgeeks"
    Output : "geeksforgeeks to Welcome"

    Input : "I love Java Programming"
    Output :"Programming Java love I"
**/

public class ReverseWordInStatement {

    public String reverse(String input) {
        List<String> inputBySpace = Arrays.asList(input.split(" "));
        Collections.reverse(inputBySpace);
        return inputBySpace.stream().collect(Collectors.joining(" ")).trim();
    }
}
