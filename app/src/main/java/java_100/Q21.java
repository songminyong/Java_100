package java_100;
import java.util.Scanner;

public class Q21 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        double result = a * Math.pow(2, b);
        System.out.printf("%.0f", result);
        scan.close();
    }    
}
