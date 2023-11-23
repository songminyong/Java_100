package java_100;
import java.util.Scanner;

public class Q34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i;
        while(true) {
            i = scan.nextInt();
            System.out.printf("%d\n", i);
            if(i == 0)
                break;
        }

        scan.close();
    }    
}