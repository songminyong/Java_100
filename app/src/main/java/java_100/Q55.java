package java_100;
import java.util.Scanner;

public class Q55 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();
        
        char grade = 0;
        if(score >= 90)
            grade = 'A';
        else if(score >= 80)
            grade = 'B';
        else if(score >= 70)
            grade = 'C';
        else if(score >= 60)
            grade = 'D';
        else
            grade = 'F';
        
        System.out.println(grade);
        scan.close();
    }
}
