package java_100;
import java.util.Scanner;

public class Q81 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 0, max = -1000001, min = 1000001;
        for(int i = 0; i < 5; i++) {
            n = scan.nextInt();
            if(max < n)
                max = n;
            if(min > n)
                min = n;
        }
        scan.close();
    }
}