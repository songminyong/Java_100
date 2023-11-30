package java_100;
import java.util.Scanner;

public class Q61 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        char op = scan.next().charAt(0);
        int b = scan.nextInt();
        double result = 0;

        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                break;
        }
        System.out.printf("%.2f", result);

        scan.close();
    }
}