package com.hello.buddy.geeks.adhoc;

import java.io.IOException;
import java.util.Scanner;

public class SubStringsInSubStrings {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int q = scan.nextInt();
        String s = scan.next();
        for (int i_A = 0; i_A < q; i_A++) {
            int l = scan.nextInt();
            int r = scan.nextInt();
            System.out.println(solve(s, n, l, r));
        }
    }

    static int solve(String s, int n, int l, int r) {
        String subString = s.substring(l-1, r);
        int result = 0;
        for(int outerLoop = 0; outerLoop<subString.length(); outerLoop++) {
            for (int innerLoop = outerLoop+1; innerLoop < subString.length(); innerLoop++) {
                if (subString.charAt(outerLoop) == subString.charAt(innerLoop)) {
                    result++;
                }
            }
        }
        return result + subString.length();
    }
}
