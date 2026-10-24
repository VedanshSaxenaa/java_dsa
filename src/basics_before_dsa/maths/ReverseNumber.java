package basics_before_dsa.maths;
import java.util.Scanner;
public class ReverseNumber {
    // public static void print (int n ){
//        while (n>0){
//            int digit =n%10;
//            System.out.print(digit);
//            n=n/10;
//        }
 public static int print (int n){
        int rev = 0;
        while (n>0){
            int digit = n%10;
            rev = rev*10 + digit;
            n = n/10;
        }
        return rev;

    }


    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println( print(n));
    }
}
