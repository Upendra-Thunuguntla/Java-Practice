import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        String mod = s.substring(s.indexOf("M")-1, s.length());
        String time = s.substring(0,s.indexOf("M")-1);
        int hour = Integer.parseInt(time.substring(0,2));
        String result = "";
        if (mod.equals("AM")) {
            if (hour ==12) {
                result = 0+"0";
            }else {
                if (hour<10) {
                    result = "0"+hour;
                }else {
                    result = hour+"";
                }
            }

        }else {
            if (hour ==12) {
                result = "12";
            }else {

                result =  hour+12+"";
            }
        }
        return result+time.substring(2);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
