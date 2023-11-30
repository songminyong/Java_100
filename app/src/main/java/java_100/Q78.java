package java_100;

import java.util.Scanner;

public class Q78 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int result = scan.nextInt(); // ÃÊ±â°ª ÀÔ·Â

        while (true) {
            String operator = scan.next();

            if (operator.equals("=")) {
                System.out.println(result);
                break;
            }

            int operand = scan.nextInt();

            switch (operator) {
                case "+":
                    result += operand;
                    break;
                case "-":
                    result -= operand;
                    break;
                case "*":
                    result *= operand;
                    break;
                case "/":
                    result /= operand;
                    break;
            }
        }
        scan.close();
    }
}
