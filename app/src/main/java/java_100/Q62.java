package java_100;
import java.util.Scanner;

public class Q62 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        int classNum = scan.nextInt();
        int number = scan.nextInt();
        System.out.printf( "%d",  year * 100000 + classNum * 1000 + number );
        scan.close();
    }
}