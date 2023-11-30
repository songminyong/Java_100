package java_100;
import java.util.Arrays;
import java.util.Scanner;

public class Q97 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int C = scan.nextInt();
        int[] students = new int[N];
        for(int i = 0; i < N; i++)
            students[i] = scan.nextInt();
        Arrays.sort(students);
        for (int i = 0; i < N; i++) {
            System.out.print(students[i] + " ");
            if ((i + 1) % C == 0) {
                System.out.println(); 
            }
        }
        scan.close();
    }
}
