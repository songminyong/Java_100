package java_100;
import java.util.Scanner;

public class Q22 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if(a > b)
            System.out.println(1);
        else
            System.out.println(0);
        scan.close();    
    }    
}
