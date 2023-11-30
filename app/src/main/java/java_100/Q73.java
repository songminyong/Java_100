package java_100;
import java.util.Scanner;

public class Q73 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int h = scan.nextInt();
        int sum = 0;
        if(k % 2 == 0)
            sum += k * 5;
        else
            sum += k - k / 2;
        if(h % 2 == 0)
            sum += h * 5;
        else
            sum += h - k / 2;
        System.out.println(sum);
        scan.close();
    }
}