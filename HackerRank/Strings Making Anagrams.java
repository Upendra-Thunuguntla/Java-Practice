import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class Solution {

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
        Map<Character,Integer> counta = new TreeMap<Character,Integer>();

        for(char x = 'a'; x<='z';x++) {
            counta.put(x, 0);
        }
        int lena = a.length();
        int lenb = b.length();
        char m, n = ' ';
        int count = 0;
        for (int i=0; i<= ((lena>lenb) ? lena : lenb); i++){
            if (i<lena){
                m= a.charAt(i);
                counta.put (m,counta.get(m)+1);
            }
            if (i<lenb){
                n = b.charAt(i);
                counta.put (n,counta.get(n)-1);
            }
        }        
        count = counta.values().stream().reduce(0, (x,y) -> Math.abs(x)+Math.abs(y));
        return count;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
