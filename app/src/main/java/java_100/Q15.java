package java_100;
import java.util.Scanner;

public class Q15 
{
    Scanner scan = new Scanner(System.in);
    int year = scan.nextInt();
    int month = scan.nextInt();
    int day = scan.nextInt();
    System.out.printf("%04d.%02d.%02d", year, month, day);
    scan.close();
}
