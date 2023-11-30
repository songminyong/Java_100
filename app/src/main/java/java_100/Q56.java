package java_100;
import java.util.Scanner;

public class Q56 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = 0;
        int flip = 0;

        for(int i = 0; i < 4; i++) {
            input = scan.nextInt();
            if(input == 1)
                flip++;
        }

        switch (flip) {
            case 0:
                System.out.println("모");
                break;
            case 1:
                System.out.println("도");
                break;
            case 2:
                System.out.println("개");
                break;
            case 3:
                System.out.println("걸");
                break;
            case 4:
                System.out.println("윷");
                break;
            default:
                break;
        }

        scan.close();
    }
}
