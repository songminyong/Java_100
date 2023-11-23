package java_100;
import java.util.Scanner;

public class Q39 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int min = a;
        if (min > b)
            min = b;
        if (min > c)
            min = c;
        System.out.println(min);
        scan.close();
    }
}