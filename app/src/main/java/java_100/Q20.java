package java_100;
import java.util.Scanner;

public class Q20 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int sum = a + b + c;
        double mean = sum / 3;
        System.out.printf("%d\n%.1f", sum, mean);
        scan.close();
    }
}
