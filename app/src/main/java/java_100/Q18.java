package java_100;
import java.util.Scanner;

public class Q18 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char c = str.charAt(0);
        System.out.printf("%d", (int)c);
        scan.close();
    }
}
