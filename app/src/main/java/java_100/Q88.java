package java_100;
import java.util.Scanner;

public class Q88 {
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
	        int sum = 0, partSum = 0;
	        for (int i = 1; i <= n; i++) {
	            partSum += i;
	            sum += partSum;
	        }
	        System.out.println(sum);

            scan.close();
	    }
}