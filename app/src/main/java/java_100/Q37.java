package java_100;
import java.util.Scanner;

public class Q37 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
                System.out.printf("*");
            System.out.printf("\n");
        }
        scan.close();
    }
}