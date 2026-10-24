package basics_before_dsa.loops;

import java.util.Scanner;
public class Java_practice {
    public static void main (String args[]){
        // program to convert string to lowercase
        String name = "Vedansh";
        name = name.toLowerCase();
        System.out.println(name);

        // program to replace space with underscore in a string
        String ved = "Hi Vedansh Saxena";
        ved = ved.replace(" ","_");
        System.out.println(ved);

        //replace the name with some name
        String a_name = "Dear name ; thanks a lot ";
        Scanner sc =  new Scanner (System.in);
        System.out.println("enter the name ");
        String new_name = sc.nextLine();
        a_name = a_name.replace("name",new_name);
        System.out.println(a_name);

    }

}
