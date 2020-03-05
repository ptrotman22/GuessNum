import java.util.Random;
import java.util.Scanner;

public class GuessNum {
    public static void main(String[] args){
        // Random Number Generator between 1 and 20.
        Random random = new Random();
        int ranNum = random.nextInt(20) + 1;

        Scanner input = new Scanner(System.in);
        //String name;

        System.out.println("Hello! What is your name?");
        String name = input.nextLine();

        //input.nextLine();

        System.out.println("Well, "+ name +", I am thinking of a number between 1 and 20.\n" +
                "\n" +
                "Take a guess.");
        int num = input.nextInt();

        //System.out.println();
        int count = 1;
        while (num != ranNum){
            if (num > ranNum){
                System.out.println("Your guess is too high.\n" +
                        "\n" +
                        "Take a guess.");
                num = input.nextInt();
            }
            else {
                System.out.println("Your guess is too low.\n" +
                        "\n" +
                        "Take a guess.");
                num = input.nextInt();
            }
            count++;
        }
        if (num == ranNum){
            System.out.println("Good job, "+ name +"! You guessed my number in " + count + " guesses!");
        }

    }
}
