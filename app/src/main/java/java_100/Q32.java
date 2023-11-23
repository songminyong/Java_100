package java_100;
import java.util.Scanner;

public class Q32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char eval = scan.next().charAt(0);

        switch (eval) {
            case 'D':
                System.out.println("slowly~");
                break;
            case 'C':
                System.out.println("run!");
                break;
            case 'B':
                System.out.println("good!!");
                break;
            case 'A':
                System.out.println("best!!!");
            default:
                System.out.println("what?");
                break;
        }
        scan.close();
    }
}