package java_100;

import java.util.Random;
import java.util.Scanner;

public class Q100 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int correct = random.nextInt(100) + 1; // 1부터 100까지의 랜덤 숫자 생성
        int guess;
        do {
            System.out.print("번호를 입력하세요");
            guess = scan.nextInt();
            if (guess > correct)
                System.out.println("번호가 정답보다 작습니다.");
            else if (guess < correct)
                System.out.println("번호가 정답보다 큽니다.");
            else 
                System.out.println("정답입니다.");
        } while (guess != correct);
        scan.close();
    }
}
