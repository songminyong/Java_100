package java_100;
import java.util.Scanner;

public class Q50 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int BMI = scan.nextInt();
        if(BMI < 18.5)
            System.out.println("저체중");
        else if(BMI <= 23)
            System.out.printf("정상체중");
        else
            System.out.println("과체중");
        scan.close();
    }
}

