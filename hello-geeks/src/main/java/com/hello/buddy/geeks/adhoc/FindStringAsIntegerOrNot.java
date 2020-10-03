package com.hello.buddy.geeks.adhoc;

import java.util.regex.Pattern;

public class FindStringAsIntegerOrNot {

    /***
     *  Program to check if input is an integer or a string
     *
     *  Input : 127
     * Output : Integer
     * Explanation : All digits are in the range '0-9'.
     *
     * Input : 199.7
     * Output : String
     * Explanation : A dot is present.
     *
     * Input : 122B
     * Output : String
     * Explanation : A alphabet is present.
     **/

    public boolean isNumeric(String input) {
        Pattern pattern = Pattern.compile("\\d+");
        return pattern.matcher(input).matches();
    }
}
