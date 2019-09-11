import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayTest {
    public static void main (String[] args) {

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

        int bestOfQuantity;
        bestOfQuantity = 0;

        if (chooseBestOf.equals("y")) {
            System.out.println("How many top dice do you need to pick?");

            //get number of dice to pick
            Scanner sc4 = new Scanner(System.in);
            bestOfQuantity = sc4.nextInt();
        } else if (chooseBestOf.equals("n")) {

        } else {
            System.out.println(chooseBestOf);
        }

        //roll proper number of dice
        //i.e. create array with requested number of random rolls
        int[] testArray = new int [diceQuantity];
        System.out.println(Arrays.toString(testArray));
        int x = 0;
        while (x < diceQuantity)
        {
            Random rand = new Random();
            int roll = rand.nextInt(6) + 1;
            System.out.println("Your roll is " + roll);
            testArray[x]  = roll;

            // Increment the value of x for next iteration
            x++;
        }

        System.out.println(Arrays.toString(testArray));
        Arrays.sort(testArray);
        System.out.println(Arrays.toString(testArray));
        int[] newArr = new int[bestOfQuantity];
        int initPos = testArray.length - bestOfQuantity;
        System.arraycopy(testArray, initPos, newArr, 0, bestOfQuantity);
        System.out.println(Arrays.toString(newArr));
        int sum = 0;
        //Advanced for loop
        for( int num : newArr) {
            sum = sum+num;
        }
        System.out.println("Your final sum is " + sum + ".");
    }
}
