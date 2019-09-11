import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //ask what kind of dice to roll
        System.out.println("How many sides to the dice you need to roll?");

        //get type of dice to roll
        Scanner sc = new Scanner(System.in);
        int diceType = sc.nextInt();

        //ask how many dice to roll
        System.out.println("How many dice do you need to roll?");

        //get number of dice to roll
        Scanner sc2 = new Scanner(System.in);
        int diceQuantity = sc2.nextInt();

        //ask if they need a 'best of' roll
        System.out.println("Do you need to select the best of the rolls? (y/n)");

        //get number of "best of" dice
        Scanner sc3 = new Scanner(System.in);
        String chooseBestOf = sc3.nextLine();

        if (chooseBestOf.equals("y")) {
            System.out.println("How many top dice do you need to pick?");

            //get number of dice to pick
            Scanner sc4 = new Scanner(System.in);
            String quantityBestOfR = sc4.nextLine();
        } else if (chooseBestOf.equals("n")) {

        } else {
            System.out.println(chooseBestOf);
        }

        //change dice to die based on number of dice requested
        String dice;
        if (diceQuantity == 1) {
            dice = "die";
        } else {
            dice = "dice";
        }

        //confirm info
        System.out.println("You roll " + diceQuantity + " " + diceType + "-sided " + dice + ".");

        //determine number

        int diceTotal = 0;
        int x = 1;

        while (x <= diceQuantity)
        {
            Random rand = new Random();
            int rand1 = rand.nextInt(diceType) + 1;
            System.out.println("Your roll is " + rand1);
            diceTotal = diceTotal + rand1;

            // Increment the value of x for next iteration
            x++;
        }

        //print out number
        System.out.println("Your total is " + diceTotal + ".");



    }
}
