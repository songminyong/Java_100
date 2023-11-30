package java_100;
import java.util.Scanner;

public class Q82 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt();
        int end = scan.nextInt();
        for(int i = start; i <= end; i++) {
            for(int j = 1; j <= 9; j++) {
                System.out.printf("%d*%d=%d\n", i, j, i*j);
            }
        }

        scan.close();
    }
}