package java_100;
import java.util.Scanner;

public class Q80 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ')
                System.out.printf(" ");
            else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'c')
                System.out.printf("%c", str.charAt(i) + 23);
            else 
                System.out.printf("%c", str.charAt(i) - 3);
        }
        scan.close();
    }
}