package java_100;
import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(a > b ? a : b);
        scan.close();
    }
}
