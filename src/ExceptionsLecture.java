import java.util.Scanner;

public class ExceptionsLecture {

    public String maybeAnInteger = "42";
    public String notAnInteger = "I am a string not an integer.";

    public void askForAnInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer.");
        String userInput = scanner.nextLine();
        try {
            int userInputInteger = Integer.parseInt(userInput);
            System.out.println("The integer in your string is: " + userInputInteger);
        } catch (NumberFormatException nfe) {
            System.out.println("Uh Oh, " + nfe.getMessage() + " there is no integer!");
        } finally {
            System.out.println("Thank you for using this integer application.");
            System.out.println("Please come back and play again");
        }
    }

    public void aMoreComplexAskFor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer.");
        String userInput = scanner.nextLine();
        try {
//            calling the parseInt with 4 parameters
//            not sure what the radix is...
//            Do not put more general catch above more specific.
            int userInputAsInteger = Integer.parseInt(userInput, 10, 15, 10);
            System.out.println("Thank you for entering: " + userInputAsInteger);
        } catch (NumberFormatException nfe) {
//           ***** MOST OF THE TIME USE nfe.printStackTrace(); ******
//            nfe.printStackTrace();
            System.out.println("No integers between characters 10 and 15");
        } catch (IndexOutOfBoundsException iobe) {
            System.out.println("Your string wasn't long enough.");
        } finally {
            System.out.println("Thank you for visiting our application.");
        }

    }
}



