package java_100;
import java.util.Scanner;

public class Q54 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if(b % a == 0)
            System.out.printf("%d*%d=%d", a, b/a, b);
        else if(a % b == 0)
            System.out.printf("%d*%d=%d", b, a/b, a);
        else
            System.out.println("none");
        scan.close();
    }
}

