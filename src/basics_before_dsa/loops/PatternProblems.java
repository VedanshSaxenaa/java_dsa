package basics_before_dsa.loops;

public class PatternProblems {
    public static void print1(int n){
        for (int i=0; i<n ; i++){
            for (int j=0; j<n ;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void print2(int n){
        for (int i =0 ; i<n ; i++){
            for (int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();

        }System.out.println();
    }
    public static void print3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; ) {
                System.out.print("*");
                j--;
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void print4(int n){
        for (int i=0 ; i<n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void print5(int n){
        for (int i=1 ; i<n; i++){
            for (int j=1; j<=i;j++ ){
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void print6(int n){
        for(int i=0; i<n; i++){
            for(int j=1; j<n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void print7(int n){
        for (int i=0; i<n; i++){
            for (int j=n-i-1; j>0; j--){
                System.out.print(" ");;
            }
            for (int k=0; k<2*i+1; k++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
    public static void print8(int n){
        for (int i=0; i<n; i++){
            for (int j=0; j<i; j++){
                System.out.print(" ");;
            }
            for (int k=0; k<2*(n-i)-1; k++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
    public static void print9(int n){
        for (int i=0; i<n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int r=0; r<n; r++){
            for (int l=0; l<r; l++){
                System.out.print(" ");
            }
            for (int m=0; m<2*(n-r)-1; m++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
//        print1(6);
//        print2(6);
//        print3(6);
//        print4(6);
//        print5(6);
//        print6(6);
//        print7(6);
//        print9(6);

    }
}
