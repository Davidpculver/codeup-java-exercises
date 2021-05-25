import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f%n", pi);

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Please enter an integer.");
//        int integer = scanner.nextInt();
//        System.out.printf("The number you entered is: %d", integer);
//
//        System.out.println("Please enter 3 words.");
//        String firstWord = scanner.next();
//        String secondWord = scanner.next();
//        String thirdWord = scanner.next();
//        System.out.printf("The words you typed are:%n %s,%n %s,%n %s.%n", firstWord, secondWord, thirdWord);

//        System.out.println("Enter a sentence.");
//        String sentence = scanner.nextLine();
//        System.out.printf("I like your sentence of: %s", sentence);

//        System.out.println("Enter the length of the classroom in feet");
//        String length = scanner.nextLine();
//        System.out.println("Now enter the width of the classroom.");
//        String width = scanner.nextLine();
//        int theLength = Integer.parseInt(length);
//        int theWidth = Integer.parseInt(width);
//        System.out.println("The area of the classroom is: " + (theLength * theWidth));
//        System.out.println("The perimeter of the classroom is: " + ((theLength * 2) + (theWidth * 2)));

//        Below works as well: not using parseInt;
//        System.out.println("Enter the length of the classroom in feet");
//        int length = scanner.nextInt();
//        System.out.println("Now enter the width of the classroom.");
//        int width = scanner.nextInt();
//        int theArea = (int)(length * width);
//        int thePerimeter = (int)((length * 2) + (width * 2));
//        System.out.printf("The area of the classroom is: %d%n", theArea);
//        System.out.printf("The perimeter of the classroom is: %d%n", thePerimeter);

//        Bonus

        scanner.useDelimiter("\n");
        System.out.println("Enter the length, width, and height of the classroom in feet");
        String length = scanner.nextLine();
//        System.out.println("Now enter the width of the classroom.");
        String width = scanner.nextLine();
//        System.out.println("Now enter the height of the classroom.");
        String height = scanner.nextLine();
        float theLength = Float.parseFloat(length);
        float theWidth = Float.parseFloat(width);
        float theHeight = Float.parseFloat(height);
        System.out.println("The area of the classroom is: " + (theLength * theWidth));
        System.out.println("The perimeter of the classroom is: " + ((theLength * 2) + (theWidth * 2)));
        System.out.println("The volume of the classroom is: " + ((theLength * theWidth) * theHeight));

    }
}
