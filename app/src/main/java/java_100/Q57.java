package java_100;
import java.util.Scanner;

public class Q57 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 1: 400   2: 340  3: 170  4:100   5:70
        int a = scan.nextInt();
        int b = scan.nextInt();
        int calorie = 0;
        switch (a) {
            case 1:
                calorie += 400;
                break;
            case 2:
                calorie += 340;
                break;
            case 3:
                calorie += 170;
                break;
            case 4:
                calorie += 100;
                break;
            case 5:
                calorie += 70;
                break;
            default:
                break;
        }
        switch (b) {
            case 1:
                calorie += 400;
                break;
            case 2:
                calorie += 340;
                break;
            case 3:
                calorie += 170;
                break;
            case 4:
                calorie += 100;
                break;
            case 5:
                calorie += 70;
                break;
            default:
                break;
        }
        if(calorie > 500)
            System.out.println("angry");
        else
            System.out.println("no angry");
        scan.close();
    }
}