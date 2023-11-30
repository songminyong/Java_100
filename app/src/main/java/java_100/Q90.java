package java_100;
import java.util.Scanner;

public class Q90 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a[] = new int[10];
        for(int i = 0; i < 10; i++)
            a[i] = scan.nextInt();
        for(int i = 9; i >= 0; i--)
            System.out.printf("%d ", a[i]);
        scan.close();
    }
}
