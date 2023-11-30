package java_100;
import java.util.Scanner;

public class Q58 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if(a > b && a > c) {
            if(a < b + c)
                System.out.println("yes");
            else
                System.out.println("no");
        }
        else if(b > a && b > c) {
            if(b < a + c)
                System.out.println("yes");
            else
                System.out.println("no");
        }
        else if(c > a && a > b) {
            if(c < a + c)
                System.out.println("yes");
            else
                System.out.println("no");
        }
        scan.close();
    }
}