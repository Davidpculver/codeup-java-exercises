package util;

import java.util.Locale;
import java.util.Scanner;

public class Input {

//    private Scanner scanner;
//
//    public Input() {
//        this.scanner = new Scanner(System.in);
//    }
//
//    public String getString(){
//        System.out.println("Enter a string");
//        String response = scanner.nextLine();
//        return "Your response: " + response;
//    }
//
//    public boolean yesNo(){
//        System.out.println("Enter yes or no");
//        if(scanner.next().toLowerCase(Locale.ROOT).startsWith("y")){
////            System.out.println("You entered yes. This will return true.");
//            return true;
//        } else {
////            System.out.println("You did not enter yes. This returns false.");
//            return false;
//        }
//    }
//
//    public int getInt(int min, int max){
//        System.out.printf("Enter a number between %d and %d.%n", min, max);
//        int userInput = scanner.nextInt();
//        if ((userInput > max) || (userInput < min)) {
//            System.out.println("You did not enter a number between min and max. Try again");
//            getInt(min, max);
//        } else {
//            userInput = userInput;
//            System.out.printf("Great job, %d fits the range.", userInput);
//        }
//        return userInput;
//    }
//
//    public double getDouble(double min, double max){
//        System.out.printf("Enter a decimal number between %.2f and %.2f.%n", min, max);
//        double userInput = scanner.nextDouble();
//        if ((userInput > max) || (userInput < min)) {
//            System.out.println("You did not enter a decimal number between min and max. Try again");
//            getDouble(min, max);
//        } else {
//            userInput = userInput;
//            System.out.printf("Great job, %.2f fits the range.", userInput);
//        }
//        return userInput;
//    }
//
//    public double getDouble(){
//        double min = 1.25;
//        double max = 11.50;
//        System.out.printf("Enter a decimal number between %.2f and %.2f.%n", min, max);
//        double userInput = scanner.nextDouble();
//        if(userInput > min && userInput < max){
//            userInput = userInput;
//            System.out.printf("Great job, %.2f fits the range.", userInput);
//        }
//        else  {
//            System.out.println("You did not enter a decimal number between min and max. Try again");
//            getDouble(min, max);
//        }
//        return userInput;
//    }


// INSTRUCTOR EXAMPLE
    private Scanner scanner;

//    create constructor; public so we can use it outside of this page.
    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
//        my way is fine, having souts to confirm whats happening
        return this.scanner.nextLine();
    }

    public boolean yesNo(){
        String userInput = this.scanner.nextLine();
//        since we are returning boolean, only need to return the cases, not need the if statement.
        return userInput.trim().equalsIgnoreCase("y") || userInput.trim().equalsIgnoreCase("yes");
    }



    public int getInt(){
        return this.scanner.nextInt();
    }

    public int getInt(int min, int max){
        System.out.printf("Enter a number between %d and %d.", min, max);
        int userNumber = this.scanner.nextInt();
        if(userNumber >= min && userNumber <= max){
            return userNumber;
        } else {
            System.out.println("That number is invalid");
            return getInt(min, max);
        }
    }



    public double getDouble(){
        return this.scanner.nextDouble();
    }

//    Not checking on if user input is a double; we are assuming they are following directions.
    public double getDouble(double min, double max){
        System.out.printf("Give me a decimal number between %f and %f.", min, max);
        double userNumber = this.scanner.nextDouble();

        if(userNumber >= min && userNumber <= max){
            return userNumber;
        } else {
            System.out.println("Invalid number");
            return getDouble(min, max);
        }
    }


}
