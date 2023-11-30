package java_100;
import java.util.Scanner;

public class Q45 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if(b*b-4*a*c == 0)
            System.out.printf("%.2f\n", -1*b/2*a);
        else if(b*b-4*a*c > 0) {
            System.out.printf("%.2f\n", (-1*b+Math.sqrt(b*b-4*a*c))/2*a);
            System.out.printf("%.2f\n", (-1*b-Math.sqrt(b*b-4*a*c))/2*a);
        }
        else if(b*b-4*a*c < 0)
            System.out.println("실근이 없습니다.\n");
        scan.close();
    }
}
