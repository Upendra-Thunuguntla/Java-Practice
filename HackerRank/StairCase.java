//https://www.hackerrank.com/challenges/staircase
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the staircase function below.
    static void staircase(int n) {
                int last = n-1;
        int first = 1;
        while(last>=0) {
            for (int i=1;i<=last;i++) {
                System.out.print(" ");
            }
            for (int j=1;j<=first;j++) {
                System.out.print("#");
            }
            System.out.print("\n");
            first++;
            last--;
        }


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
