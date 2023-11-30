package java_100;
import java.util.Scanner;

public class Q64 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        int j = scan.nextInt();
        System.out.printf("%d", i % j);
        scan.close();
    }
}