package java_100;
import java.util.Scanner;

public class Q51 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int n1 = n / 10;
        int n2 = n % 10;
        int compressed = (n1 + 10 * n2) * 2;
        System.out.println(compressed);
        if(compressed <= 50)
            System.out.println("GOOD");
        else
            System.out.println("OH MY GOD");
        scan.close();
    }
}
