package java_100;
import java.util.Scanner;

public class Q63 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int day = scan.nextInt();
        System.out.printf("%d", day * 24);
        scan.close();
    }
}