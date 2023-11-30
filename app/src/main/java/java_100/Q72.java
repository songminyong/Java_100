package java_100;
import java.util.Scanner;

public class Q72 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int input = 0, max = 0;
        for(int i = 0; i < n ; i++) {
            input = scan.nextInt();
            if(input > max)
                max = input;
        }
        System.out.println(max);
        scan.close();
    }
}