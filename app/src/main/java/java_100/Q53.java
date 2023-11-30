package java_100;
import java.util.Scanner;
import java.lang.Math;

public class Q53 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double max = a + b;
        if(max < a - b)
            max = a - b;
        if(max < b - a);
            max = b - a;
        if(max < a * b)
            max = a * b;
        if(max < a / b)
            max = a / b;
        if(max < b / a)
            max = b / a;
        if(max < Math.pow(a, b))
            max = Math.pow(a, b);
        if(max < Math.pow(b, a))
            max = Math.pow(b, a);
        System.out.println(max);
        scan.close();
    }
}

