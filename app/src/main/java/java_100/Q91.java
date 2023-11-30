package java_100;
import java.util.Scanner;

public class Q91 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int a[] = new int[num];
        for(int i = 0; i < num; i++)
            a[i] = scan.nextInt();
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < num; j++)
                System.out.printf("%d ", a[(i + j) % num]);
            System.out.println("");
        }
        scan.close();
    }
}