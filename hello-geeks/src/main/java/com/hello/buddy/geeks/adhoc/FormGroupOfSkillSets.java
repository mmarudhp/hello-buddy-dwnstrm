package com.hello.buddy.geeks.adhoc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FormGroupOfSkillSets {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int total = scan.nextInt();
        int[] input = new int[total];
        for(int i = 0; i < total; i++)
            input[i] = scan.nextInt();

        System.out.println(input.length > 0 ? solve(input): 0);

        //O(n+3*(n^2))
    }

    static long solve(int[] input) {
        int[][] splitInput = new int[input.length][input.length-1];
        //O(n^2)
        for (int splitOuterLoop = 0; splitOuterLoop < input.length; splitOuterLoop++) {
            int secDimen = 0;
            for(int splitInnerLoop = 0; splitInnerLoop < input.length; splitInnerLoop++) {
                if (splitInnerLoop != splitOuterLoop) {
                    splitInput[splitOuterLoop][secDimen] = input[splitInnerLoop];
                    secDimen++;
                }
            }
        }

        // O(n^2)
        int[][] summationOfOtherTwo = new int[input.length][input.length-1];
        for(int outer = 0; outer<input.length; outer++) {
            int[] groups = splitInput[outer];
            int inner = 0;
            while (inner<input.length-1) {
                int sumOfTwo = groups[inner] + (inner == input.length-2 ? groups[0] : groups[inner+1]);
                summationOfOtherTwo[outer][inner] = sumOfTwo;
                inner++;
            }
        }

        //O(n^2)
        List<Integer> possibleSkillGroup = new ArrayList<>();
        for (int outer = 0; outer < input.length; outer++) {
            int[] groups = summationOfOtherTwo[outer];
            boolean isEligible = true;
            for (int inner = 0; inner < groups.length; inner++) {
                isEligible = isEligible && input[outer] < groups[inner];
            }

            if(isEligible) {
                possibleSkillGroup.add(input[outer]);
            }
        }

        return (possibleSkillGroup != null && !possibleSkillGroup.isEmpty()) ?
                possibleSkillGroup.stream().peek(System.out::println).mapToInt(Integer::intValue).sum() : 0;
    }
}
