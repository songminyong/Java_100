package java_100;
import java.util.Scanner;

public class Q38 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int base = scan.nextInt();
        int height = scan.nextInt();
        System.out.printf("%.1f", base * height * 0.5);
        scan.close();
    }
}
