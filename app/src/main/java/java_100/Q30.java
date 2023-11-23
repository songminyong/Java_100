package java_100;
import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        if(i > 0)
            System.out.println("plus\n");
        else
            System.out.println("minus\n");
        if(i % 2 == 0)
            System.out.println("even\n");
        else
            System.out.println("odd\n");

        scan.close();
    }
}
