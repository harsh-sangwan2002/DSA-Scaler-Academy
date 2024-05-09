package Fibonacci;

import java.util.*;

public class optimised {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int a = 0, b = 1, c = a + b;

        for (int i = 2; i <= n; i++) {

            c = a + b;
            a = b;
            b = c;
        }

        System.out.print(c);

        scn.close();
    }
}