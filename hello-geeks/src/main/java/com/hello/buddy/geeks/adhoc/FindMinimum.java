package com.hello.buddy.geeks.adhoc;

import java.util.Random;
import java.util.Scanner;

public class FindMinimum {

    /**
     * Find the minimum value in O(1) complexity from a given array of integers (+ve and -ve)
     * **/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();

        int min = findMinimum(getInput(count));
        System.out.println("Minimum Value : " + min);
    }

    private static int findMinimum(int[] input) {
        int minimum = 0, loop = 0;
        while (loop < input.length) {
            minimum = minimum < input[loop] ? minimum : input[loop];
            loop++;
        }
        return minimum;
    }

    private static int[] getInput(int count) {
        Random random = new Random();
        int[] given = new int[count];
        int loop = 0;
        while(loop < count) {
            given[loop] = random.nextInt();
            loop++;
        }
        print(given);
        return given;
    }

    private static void print(int[] given) {
        int loop = 0;
        System.out.print("Given Value is : ");
        while (loop < given.length) {
            System.out.print(given[loop] + "\t");
            loop++;
        }
        System.out.println("");
    }
}
