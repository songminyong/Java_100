package java_100;
import java.util.Scanner;

public class Q65 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 0; i < n; i++) {
            if(i % 3 == 0)
                System.out.printf("X ");
            else
                System.out.printf("%d ", i);
        }
        scan.close();
    }
}