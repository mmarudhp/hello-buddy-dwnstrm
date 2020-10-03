package com.hello.buddy.geeks.adhoc;

public class RemovePunctuationInString {

    /**
     *  Removing punctuations from a given string
     *
     * Given a string, remove the punctuation from the string if the given character is a punctuation character as classified by the current C locale. The default C locale classifies these characters as punctuation:
     *
     * !"#$%&'()*+,-./:;?@[\]^_`{|}~
     * Examples:
     *
     * Input : %welcome' to @geeksforgeek<s
     * Output : welcome to geeksforgeeks
     *
     * Input : Hello!!!, he said ---and went.
     * Output : Hello he said and went
     **/

    public String removePunctuation(String input) {
        return input.replaceAll("\\p{Punct}", "");
    }
}
