package java_100;
import java.util.Scanner;

public class Q36 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int die1 = scan.nextInt();
        int die2 = scan.nextInt();

        for(int i = 1; i <= die1; i++)
        {
            for(int j = 1; j <= die2; j++)
                System.out.printf("%d %d\n", i, j);
        }
        scan.close();
    }
}