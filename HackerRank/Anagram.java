//https://www.hackerrank.com/challenges/anagram

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the anagram function below.
    static int anagram(String s) {
        if (s.length()%2!=0){
            return -1;
        }
        int count =0;
        String s1 = s.substring(0,s.length()/2);
        String s2 = s.substring(s.length()/2);
        char[] s2c = s2.toCharArray();
        List<Character> cl = new ArrayList<Character>();
        for (char c : s2c) {
            cl.add(c);
        }
        for (int i=0;i<s1.length();i++) {
            if (!cl.contains(s1.charAt(i))) {
                count++;
            }else {
                cl.remove((Character)s1.charAt(i));
            }
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = anagram(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
