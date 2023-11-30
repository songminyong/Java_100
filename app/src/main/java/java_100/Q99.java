package java_100;

import java.util.Scanner;

public class Q99 {
    static void getGrade(int score) 
    {
        if (score >= 90) 
            System.out.println("A");
        else if (score >= 80)
            System.out.println("B");
        else if (score >= 70) 
            System.out.println("C");
        else if (score >= 60) 
            System.out.println("D");
        else 
            System.out.println("E");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputScore = scan.nextInt();
        getGrade(inputScore);
        scan.close();
    }

}