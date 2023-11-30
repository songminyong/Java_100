package java_100;
import java.util.Scanner;

public class Q49 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hour = scan.nextInt();
        int minute = scan.nextInt();
        if(minute >= 30)
            System.out.printf("%d %d", hour, minute - 30);
        else
            System.out.printf("%d %d", hour - 1, 30 - minute);
        scan.close();
    }
}
