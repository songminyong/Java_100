package java_100;
import java.util.Scanner;

public class Q47 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean leap_year = false;
        int year = scan.nextInt();

        if(year % 400 == 0) 
            leap_year = true;
        else if(year % 4 == 0 && year % 100 != 0)
            leap_year = true;
        if(leap_year)
            System.out.println("yes");
        else
            System.out.println("no");

        scan.close();
    }
}
