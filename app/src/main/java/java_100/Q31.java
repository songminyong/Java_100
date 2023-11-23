package java_100;
import java.util.Scanner;

public class Q31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int score = scan.nextInt();
        char grade = 0;
        
        if(score >= 90)
            grade = 'A';
        else if(score >= 70)
            grade = 'B';
        else if(score >= 40)
            grade = 'C';
        else
            grade = 'D';
        
        System.out.println(grade);
        scan.close();
    }
}