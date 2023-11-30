package java_100;
import java.util.Scanner;

public class Q52 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        int n1 = n % 10;
        
        if(n >= 11 && n <= 13) {
            System.out.printf("%dth", n);
            return;
        }
        else if(n1 == 1) {
            System.out.printf("%dst", n);
            return;
        }
        else if(n1 == 2) {
            System.out.printf("%dnd", n);
            return;
        }
        else if(n1 == 3) {
            System.out.printf("%drd", n);
            return;
        }
        else
            System.out.printf("%dth", n);
    }
}
