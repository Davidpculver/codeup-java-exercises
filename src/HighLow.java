import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static void guessNumber() {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        boolean correct = false;
        Random rand = new Random();
        int answer = rand.nextInt(100) + 1;
        System.out.println("answer:" + answer);
        System.out.println("Guess a number between 1 and 100");
        do {
            System.out.printf("You have %d attempts remaining.%n", 10 - counter);
            if (counter == 10) {
                System.out.println("You failed to guess the correct answer. Try again.");
                break;
            }
            else if (scanner.hasNextInt()) {
                int guess = scanner.nextInt();
                if (guess > 100 || guess < 1) {
                    System.out.println("You did not enter a valid guess.");
                    System.out.printf("%nWould you like to try again? Y/N%n");
                    String resp = scanner.next();
                    if (resp.toLowerCase().startsWith("y")) {
                        guessNumber();
                    } else {
                        System.out.println("Come back when you're ready to play. Goodbye");
                    }
                } else if (guess > answer) {
                    System.out.println("LOWER");
                    counter++;
                } else if (guess < answer) {
                    System.out.println("HIGHER");
                    counter++;
                } else {
                    System.out.println("GOOD GUESS!!");
                    correct = true;
                }
            } else if (!scanner.hasNextInt()){
                System.out.println("You did not enter a number. Restart and play the game the right way.");
                break;
            }

        } while (correct == false);
    }

    public static void main(String[] args) {
        guessNumber();
    }
}
