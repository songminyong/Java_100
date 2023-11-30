package java_100;
import java.util.Scanner;

public class Q83 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 1; i < n; i++)
        {
            for(int j = 0; j < i; j++)
                System.out.printf("*");
            System.out.println("");
        }
        scan.close();
    }
}