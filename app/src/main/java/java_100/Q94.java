package java_100;
import java.util.Scanner;

public class Q94 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int open = 0, close = 0;
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == '(')
                open++;
            else if(str.charAt(i) == ')')
                close++;
        }
        System.out.printf("%d %d", open, close);
        scan.close();
    }
}