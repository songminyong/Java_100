package java_100;
import java.util.Scanner;

public class Q60 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        
        if(a <= 170)
            System.out.printf("CRASH %d", a);
        else if(b <= 170)
            System.out.printf("CRASH %d", b);
        else if(c <= 170)
            System.out.printf("CRASH %d", c);
        else
            System.out.println("PASS");

        scan.close();
    }
}