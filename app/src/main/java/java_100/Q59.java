package java_100;
import java.util.Scanner;

public class Q59 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] win = new int[7];
        int[] pick = new int[6];
        int hit = 0;
        for(int i = 0; i < 7; i++)
            win[i] = scan.nextInt();
        for(int i = 0; i < 6; i++)
            pick[i] = scan.nextInt();
        for(int i = 0 ; i < 6; i++) {
            if(win[i] == pick[i])
                hit++;
        }
        scan.close();

        switch (hit) {
            case 6:
                System.out.println("1등");
                break;
            case 5:
                for(int i = 0; i < 6; i++) {
                    if(win[7] == pick[i]) {
                        System.out.println("2등");
                        return;
                    }
                }    
                System.out.println("3등");
                break;
            case 4:
                System.out.println("4등");
                break;
            case 3:
                System.out.println("5등");
                break;
            default:
                System.out.println("꽝");
                break;
        }
    }
}