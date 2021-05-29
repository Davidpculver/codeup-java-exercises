import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

//    fix later, not working correctly
//    public static int mult(int num1, int num2){
//        System.out.println("number 1: " + num1);
//        System.out.println("number 2: " + num2);
//        if(num2 == 0){
//            System.out.println("NUMBER1: " + num1);
//            System.out.println(num1);
//        } else {
//            num1 += num1;
//            System.out.println("num 1: " + num1);
//            System.out.println("num 2: " + num2);
//            mult(num1, num2 - 1);
//        }
//        return num1;
//    }

    //    this one works.
    public static int mult(int num1, int num2) {
        if (num1 == 0) {
            return 0;
        }
        return mult(num1 - 1, num2) + num2;
    }


    public static int divide(int num1, int num2) {
        return num1 / num2;
    }


    //    Could not get do while loop to work.
    public static int getInteger(int min, int max) {
        System.out.printf("Enter a number between %d and %d: ", min, max);
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        if ((userInput > max) || (userInput < min)) {
            System.out.println("You did not enter a number between min and max. Try again");
            getInteger(min, max);
        } else {
            userInput = userInput;
            System.out.printf("Great job, %d fits the range.", userInput);
        }
        return userInput;
    }


    public static void getFactorial() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Please enter a number between 1 and 10");
            long num = scanner.nextInt();
            long result = 1;
            System.out.printf("%d! = ", num);
            for (int factor = 1; factor <= num; factor++) {
                result *= factor;
                System.out.printf("%d ", factor);
            }
            System.out.println(result);
            System.out.println("Would you like to continue? Yes/No");
        } while (scanner.next().toLowerCase().equals("yes"));
    }


    public static void rollDice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of sides of your dice");
        int sides = scanner.nextInt();
        scanner.nextLine();
        if (sides > 0) {
            System.out.printf("You have selected a %d sided dice.%n", sides);
            System.out.println("Are you ready to roll? Y/N");
            String roll = scanner.nextLine();
            if (roll.toLowerCase().startsWith("y")) {
                Random rand = new Random();
                int die1 = rand.nextInt(sides) + 1;
                int die2 = rand.nextInt(sides) + 1;
                System.out.printf("Die1: %d%n", die1);
                System.out.printf("Die2: %d%n", die2);
            } else if (!roll.toLowerCase().startsWith("y")) {
                System.out.println("Come back when you're ready to play. Goodbye");
            }
        } else {
            System.out.println("Please enter a valid positive number.");
            rollDice();
        }
    }


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
                System.out.println("You did not enter a number. Please restart and play the game the right way idiot.");
                break;
            }

        } while (correct == false);
    }


    public static void main(String[] args) {
//        System.out.println(add(2,5));
//        System.out.println(subtract(8,3));
//        System.out.println(multiply(4,5));
//        System.out.println(divide(15,3));
//        System.out.println(mult(6, 3));
//        getInteger(1, 10);
//        getFactorial();
//        rollDice();
        guessNumber();
    }
}
