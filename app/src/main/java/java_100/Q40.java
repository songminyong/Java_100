package java_100;
import java.util.Scanner;

public class Q40 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double distance = scan.nextDouble();
        if(distance >= 50 && distance <= 60)
            System.out.println("win");
        else
            System.out.println("lose");
        scan.close();
    }
}