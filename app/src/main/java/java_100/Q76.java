package java_100;
import java.util.Scanner;

public class Q76 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int sum = n;
        if(k == 0)
            sum = 1;
        else {
            for(int i = 1; i < k; i++)
                sum *= n;
        }
        System.out.println(sum);
        scan.close();
    }
}
