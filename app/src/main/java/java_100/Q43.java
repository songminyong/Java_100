package java_100;
import java.util.Scanner;

public class Q43 {
    public static String toKorean(int i) {
        switch (i) {
            case 1: return "일";
            case 2: return "이";
            case 3: return "삼";
            case 4: return "사";
            case 5: return "오";
            case 6: return "육";
            case 7: return "칠";
            case 8: return "팔";
            case 9: return "구";
            default: return "";
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int index = input;
        int[] cipher = new int[5];

        cipher[0] = index / 10000;
        index -= cipher[0] * 10000;
        cipher[1] = index / 1000;
        index -= cipher[1] * 1000;
        cipher[2] = index / 100;
        index -= cipher[2] * 100;
        cipher[3] = index / 10;
        index -= cipher[3] * 10;
        cipher[4] = index;

        if(cipher[0] != 0)
            System.out.print(toKorean(cipher[0]) + "만");
        if(cipher[1] != 0)
            System.out.print(toKorean(cipher[1]) + "천");
        if(cipher[2] != 0)
            System.out.print(toKorean(cipher[2]) + "백");
        if(cipher[3] != 0)
            System.out.print(toKorean(cipher[3]) + "십");
        if(cipher[4] != 0)
            System.out.print(toKorean(cipher[4]));

        scan.close();
    }
}