package com.hello.buddy.geeks.adhoc;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfTestCases = scan.nextInt();
        int[] valueOfGivenTestCases = new int[numberOfTestCases];

        for (int countOfTestCases = 0; countOfTestCases < numberOfTestCases; countOfTestCases++) {
            valueOfGivenTestCases[countOfTestCases] = scan.nextInt();
        }

        for (int resultLoop = 0; resultLoop < numberOfTestCases; resultLoop++) {
            fizzBuzz(valueOfGivenTestCases[resultLoop]);
        }
    }

    private static void fizzBuzz(int count) {
        for (int iterate = 1; iterate <= count; iterate++) {
             if (iterate % 3 == 0) {
                System.out.println(iterate % 5 == 0 ? "FizzBuzz" : "Fizz");
            } else if (iterate % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(iterate);
            }
        }
    }
}
