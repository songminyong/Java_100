package java_100;
import java.util.Scanner;

public class Q44 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int day = scan.nextInt();
        switch (day) {
            case 1:
            case 3:
            case 5:
            case 7:
                System.out.println("oh my god");
                break;
            case 2:
            case 4:
            case 6:
            default:
                System.out.println("enjoy");
                break;
        }
        scan.close();
    }
}
