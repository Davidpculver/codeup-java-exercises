import java.util.Scanner;

public class consoleIOlec {
    public static void main(String[] args) {
//        s stands for string
        String name = "David";
//        %n new line = only works in a formatted string
//        Must use printf to use %commands, formatted strings and other arguments.
        System.out.printf("Hello, %s%n", name);
//      d stands for decimal (number)
        System.out.format("%d is %s's favorite number\n This is a %b statement%n", 42, name, true);

        System.out.println("Hello, " + name);
// Scanner allows userinput in the console.Have to bring Scanner into 'being' (option+enter). To look for user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hey friend-o, how's it going? ");
//        only captures the next work: so this will only pick up the first word of the user response.
//        .next is looking for text - grabs until next whitespace (the next 'string').
//        String userInput = scanner.next();
//capture the entire input: grabs everything until the next return key
        String userInput = scanner.next();

        System.out.printf("You're feeling: %s%n", userInput);

        System.out.println("Give me a number: ");
        int num = scanner.nextInt();
        System.out.printf("Your number is: %d%n", num);

    }
}
