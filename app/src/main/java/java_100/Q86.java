package java_100;
import java.util.Scanner;

public class Q86 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n / 2 + 1; i++) 
        {
            for (int j = 0; j < i * 2 + 1; j++) 
                System.out.print("*");
            System.out.println("");
        }
        scan.close();
    }
}
