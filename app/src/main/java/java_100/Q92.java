package java_100;
import java.util.Scanner;

public class Q92 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int a[] = new int[length];
        for(int i = 0; i < length; i++)
            a[i] = scan.nextInt();
        try { Thread.sleep(3000); }catch(Exception e) { }
        for(int i = 0; i < 50; i++)
            System.out.println();
        int k = scan.nextInt();
        System.out.println(a[k-1]);

        scan.close();
    }
}