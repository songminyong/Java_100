package java_100;
import java.util.Scanner;

public class Q95 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.next();
        int[] result = new int[26];
        char idx = 0;
        for(int i = 0; i < sentence.length(); i++) {
            idx = sentence.charAt(i);
            if(idx >= 'a' && idx <= 'z')
                result[idx - 'a']++;
        }

        for(int i = 0; i < 26; i++)
            System.out.printf("%c:%d\n", (char)('a' + i), result[i]);
        scan.close();
    }
}