package java_100;
import java.util.Scanner;

public class Q46 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tunnel[] = new int[3];
        tunnel[0] = scan.nextInt();
        tunnel[1] = scan.nextInt();
        tunnel[2] = scan.nextInt();

        for(int i = 0; i < 3; i++) {
            if(tunnel[i] > 170)
                System.out.println("PASS");
            else
                System.out.println("CRASH");
        }
        scan.close();
    }
}
