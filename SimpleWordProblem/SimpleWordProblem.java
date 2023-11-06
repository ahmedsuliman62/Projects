import java.util.Scanner;
import java.util.Random;

public class SimpleWordProblem {
    public static void main(String[] args) {

        Scanner scan = new Scanner();
        Random rand = new Random();
        rand1 = rand.nextInt(10) + 1;
        rand2 = rand.nextInt(10) + 1;

        int sum = rand1 + rand2;
        System.out.println("If little Timmy has " + rand1 + " donuts, and Lily gives him "
                + rand2 + " donuts, how many donuts does little Timmy have?");

        int ans = scan.nextInt();

        if (ans == sum) {
            System.out.println("That's the correct answer good job!");
        }
        else {
            System.out.println("Sorry, that's not the correct answer please try again!");
        }
    }
}