package basics_before_dsa.maths;
import java.util.Scanner;
public class CountDigits {
    public static int print(int n) {
        int counter =0;
        while (n > 0) {
           counter ++;
           n = n/10;
        }
        if (n==0){
            return 1;
        }
        return counter;
    }

    public static void main (String[]args){
        System.out.println("enter the digit");
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt();
        System.out.println( "number of digits are : " + print(n));
        }

}
