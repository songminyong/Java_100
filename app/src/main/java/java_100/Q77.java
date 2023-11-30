package java_100;
import java.util.Scanner;

public class Q77 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 1;
        for(int i = 1; i <= n; i++)
            sum *= i;
        System.out.println(sum);
        scan.close();
    }
}
