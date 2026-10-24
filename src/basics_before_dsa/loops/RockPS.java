package basics_before_dsa.loops;

import java.util.Scanner;
import java.util.Random;
public class RockPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        for (int i=0; i<5; i++) {
            System.out.println("choose a number ");
            System.out.println("1 : Rock  , 2 : Paper , 3 : Scissors");
            int num = sc.nextInt();
            if (num < 1 || num > 3) {
                System.out.println("dude choose a number between 1 to 3 only");
                continue;
            }

            int random = rand.nextInt(3) + 1;


            switch (random) {
                case 1:
                    System.out.println("Computer's got Rock");
                    break;
                case 2:
                    System.out.println("Computer's got Paper ");
                    break;
                case 3:
                    System.out.println("Computer's got Scissors");
                    break;

            }

            // for a tie
            if (num == random) {
                System.out.println("its a tie");
            }
            // for lose
            else if ((num == 1 && random == 2) || (num == 2 && random == 3) || (num == 3 && random == 1)) {
                System.out.println(" you lose ");
            }
            // for win
            else {
                System.out.println("you won ");
            }
        }
    }
}
