package java_100;
import java.util.Scanner;

public class Q41 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int distance = scan.nextInt();
        if((distance >= 30 && distance <= 40) || (distance >= 60 && distance <= 70))
            System.out.println("win");
        else
            System.out.println("lose");
        scan.close();
    }
}