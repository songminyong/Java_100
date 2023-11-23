package java_100;
import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[3];
        a[0] = scan.nextInt();
        a[1] = scan.nextInt();
        a[2] = scan.nextInt();

        for(int i = 0; i < 3; i++)
        {
            if(a[i] % 2 == 0)
                System.out.printf("%d\n", a[i]);
        }
        scan.close();
    }
}
