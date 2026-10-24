package basics_before_dsa.maths;
import java.util.Scanner;
public class PalindromeNumber {
    public static boolean print(int n) {
        int rev = 0;
        int orig = n;
        while (n>0){
            int digit = n%10;
            rev= rev*10 + digit ;
            n=n/10;
        }

        return rev==orig;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(print(n));
 }
}