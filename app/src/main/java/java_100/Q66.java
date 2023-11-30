package java_100;
import java.util.Scanner;

public class Q66 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        for(int i = 1; sum < n; i++)
            sum += i;
        System.out.println(sum);
        scan.close();
    }
}