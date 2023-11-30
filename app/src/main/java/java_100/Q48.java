package java_100;
import java.util.Scanner;

public class Q48 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int birthday = scan.nextInt();
        int gender = scan.nextInt();
        int birth_year = birthday / 10000;
        int age = 0;

        switch (gender) {
            case 1:
            case 2:
                age = 2018 - (1900 + birth_year);
                break;
            case 3:
            case 4:
                age = 2018 - (2000 + birth_year);
                break;
            default:
                break;
        }
        System.out.println(age);
        scan.close();
    }
}
