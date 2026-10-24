package basics_before_dsa.maths;

import java.util.Scanner;

public class GCD {

    // Brute force approach
    public static int gcdBrute(int n1, int n2) {
        int gcd = 1;

        for (int i = 1; i <= Math.min(n1, n2); i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }

    // Better approach
    public static int gcdBetter(int n1, int n2) {
        for (int i = Math.min(n1, n2); i >= 1; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                return i;
            }
        }
        return 1; // fallback
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int result1 = gcdBrute(n1, n2);
        int result2 = gcdBetter(n1, n2);

        System.out.println("GCD (Brute Force): " + result1);
        System.out.println("GCD (Better): " + result2);

        sc.close();
    }
}