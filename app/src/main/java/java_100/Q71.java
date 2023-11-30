package java_100;
import java.util.Scanner;

public class Q71 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int input = 0, sum = 0;
        for(int i = 0; i < n ; i++) {
            input = scan.nextInt();
            sum += input;
        }
        System.out.println(sum);
        scan.close();
    }
}