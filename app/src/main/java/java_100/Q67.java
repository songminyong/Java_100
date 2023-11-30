package java_100;
import java.util.Scanner;

public class Q67 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        while(i > 0) {
            System.out.println(i);
            i--;
        }
        scan.close();
    }
}