package java_100;

import java.util.Scanner;

public class Q89 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i + j == k)
                    System.out.printf("%d %d", i, j);
            }
        }
        scan.close();
    }
}
