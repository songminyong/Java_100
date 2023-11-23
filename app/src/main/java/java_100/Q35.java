package java_100;
import java.util.Scanner;

public class Q35 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int sum = 0;

        for(int index = 2; index <= input; index++) {
            if(index % 2 == 0)
                sum += index;
        }

        System.out.println(sum);
        scan.close();
    }
}