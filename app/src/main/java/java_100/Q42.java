package java_100;
import java.util.Scanner;

public class Q42 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int distance = scan.nextInt();
        if((distance >= 50 && distance <= 70) || distance % 6 == 0)
            System.out.println("win");
        else
            System.out.println("lose");
        scan.close();
    }
}