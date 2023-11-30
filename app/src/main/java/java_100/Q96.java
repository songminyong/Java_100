package java_100;
import java.util.Scanner;

public class Q96 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String[] names = new String[num];
        int[] scores = new int[num];
        for(int i = 0; i < num; i++)
        {
            names[i] = scan.nextLine();
            scores[i] = scan.nextInt();
        }
        for (int i = 0; i < num - 1; i++) {
            for (int j = 0; j < num - i - 1; j++) {
                if (scores[j] < scores[j + 1]) {
                    int tempScore = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = tempScore;
        
                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;
                }
            }
        }
        System.out.println(names[2]);
        scan.close();
    }
}