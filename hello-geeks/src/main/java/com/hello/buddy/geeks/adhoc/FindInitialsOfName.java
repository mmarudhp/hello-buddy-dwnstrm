package com.hello.buddy.geeks.adhoc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindInitialsOfName {

    /***
     *  Program to find the initials of a name.
     * Given a string name, we have to find the initials of the name
     *
     * Examples:
     *
     * Input  : prabhat kumar singh
     * Output : P K S
     * We take the first letter of all
     * words and print in capital letter.
     *
     * Input  : Jude Law
     * Output : J L
     *
     * Input  : abhishek kumar singh
     * Output : A K S
     *
     ***/

    public String findInitialsOfName(String input) {
        List<String> collect = Arrays.stream(input.split(" ")).collect(Collectors.toList());
        return collect.stream().map(x -> x.substring(0, 1)).map(String::toUpperCase).collect(Collectors.joining(" ")).trim();
    }
}
