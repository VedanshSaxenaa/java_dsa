package basics_before_dsa.loops;

import java.util.Scanner;
public class ConditionalStatements {
    public static void main(String[] args) {

        //-------- Take an integer input and print whether it is positive, negative, or zero.-------

        Scanner sc = new Scanner(System.in);
          System.out.println("give me a number ");
         int num = sc.nextInt();
         if (num > 0 ) {
             System.out.println("you gave me a positive number ");
         }
         else if (num < 0){
             System.out.println("the number is negative ");}
         else {
             System.out.println("you gave me a zero");
         }


         //-----------Take two numbers and print the greater number.--------------

         System.out.println("give me 2 numbers");
         int num1 = sc.nextInt();
         int num2 = sc.nextInt();
         if (num1 > num2){
             System.out.println("the greatest number is "+ num1);
         }
         else {
             System.out.println("the greatest number is "+ num2);
         }


         //  ------------Largest of 3 Numbers---------------

        System.out.println("give 3 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println(a + " is the greatest");
        } else if (b > a && b > c) {
            System.out.println(b + " is the greatest");
        } else {
            System.out.println(c + " is the greatest");
        }


        //-------- Leap Year Checker----------

        System.out.println("wanna check your year is leap or not ? give a year");
        int year = sc.nextInt();
        if ((year % 400 ==0) || ((year % 4 == 0) && (year % 100 !=0))){
            System.out.println("year is leap year");
        }
        else{
            System.out.println("year ain't a leap year ");
            }


      //----------Day of the Week------------

        System.out.println("give me number ");
        int number = sc.nextInt();
        switch (number){
            case 1: System.out.println("monday");
                break;
            case 2: System.out.println("tuesday");
                break;
            case 3: System.out.println("wednesday");
                break;
            case 4: System.out.println("thursday");
                break;
            case 5: System.out.println("friday");
                break;
            case 6: System.out.println("saturday");
                break;
            case 7: System.out.println("sunday");
                break;
            default:
                System.out.println("not defined");}


        // ----------simple calculator-----------

        System.out.println("enter two numbers");
        int first = sc.nextInt();
        int second = sc.nextInt();
        System.out.println("enter the operator");
        char op =sc.next().charAt(0);
        switch(op){
            case  '+': System.out.println(first+second);
                break;
            case  '-': System.out.println(first-second);
                break;
            case  '*': System.out.println(first*second);
                break;
            case  '/':
                if (second == 0){
                    System.out.println("undefined solution");
                }else {
                    System.out.println(first/second);
                }
                break;
            default:
                System.out.println("invalid input");
        }

    }
}
