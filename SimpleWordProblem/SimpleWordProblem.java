import java.util.Scanner;
import java.util.Random;

public class SimpleWordProblem {

    public static boolean compare(int num1, int num2) {

        if (num1 == num2) {
            return true;
        }
        return false;
    }

    public static String checkAnswer(int sum, int answer) {

        if (compare(answer, sum)) {
            return "That's the correct answer good job!";
        }
        else {
            return"Sorry, that's not the correct answer please try again!";
        }
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int rand1 = rand.nextInt(10) + 1;
        int rand2 = rand.nextInt(10) + 1;

        int sum = rand1 + rand2;
        System.out.println("If little Timmy has " + rand1 + " donuts, and Lily gives him "
                + rand2 + " donuts, how many donuts does little Timmy have?");

        int ans = scan.nextInt();
        checkAnswer(ans, sum);

    }
}