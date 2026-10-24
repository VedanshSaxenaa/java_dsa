package basics_before_dsa.loops;

import java.util.Scanner;
public class ForLoop {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("give a number ");
      int n = sc.nextInt();
        System.out.println("forward order");
      for (int i=0; i<=n; i++){
          System.out.println(i);
      }
        System.out.println("reverse order");
      for (int i=n; i>=0; i-- ){
          System.out.println(i);
      }
        System.out.println("odd n numbers");
      for (int i=0; i<n; i++ ){
          System.out.println(2*i+1);
      }
        System.out.println("reverse odd numbers");
      for (int i=n-1; i>=0; i-- ){
          System.out.println(2*i+1);
      }

      // using while loop
        System.out.println("using while loop");
      int i=0;
      while (i<=n){
          System.out.println(i++);
        }

        System.out.println("reverse order using while ");
       i=n;
      while (i>=0){
          System.out.println(i--);
      }

        System.out.println("odd numbers");
      i=0;
      while(i<n){
          System.out.println(2*i+1);
          i++;
      }
        System.out.println("reverse odd numbers");
      i=n;
      while(i>0){
          System.out.println(2*i-1);
          i--;
      }

        System.out.println("using do while");
      i=0;
      do {
          System.out.println(i++);
      }while(i<n);

        System.out.println("odd numbers");
        i=0;
        do{
            System.out.println(2*i+1);
            i++;
        }while(i<n);

        System.out.println("reverse odd numbers");
        i=n;
        do{
            System.out.println(2*i-1);
            i--;
        }while(i>0);
    }
}
