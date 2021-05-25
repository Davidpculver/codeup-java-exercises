import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        #1 format floating point numbers
        double pi = 3.14159;
//        To get: The value of pi is approximately 3.14.
//        not much of a difference between 'format' and 'printf'. printf like console.log, format gives a string to hold on to. functionally identical.
        System.out.format("The value of pi is approximately %.2f.%n", pi);
//


        Scanner scanner = new Scanner(System.in);
//          #2 scanner
//        System.out.println("Please enter an integer.");
//        int integer = scanner.nextInt();
//        System.out.printf("The number you entered is: %d", integer);
//
//        System.out.println("Please enter 3 words.");
//        String firstWord = scanner.next();
//        String secondWord = scanner.next();
//        String thirdWord = scanner.next();
//        System.out.printf("The words you typed are:%n %s,%n %s,%n %s.%n", firstWord, secondWord, thirdWord);

//        instructor example
//        System.out.println("Give me a word.");
//        String str1 = scanner.next();
//        System.out.println("Another one..");
//        String str2 = scanner.next();
//        System.out.println("Another one..");
//        String str3 = scanner.next();
//        System.out.println("You entered the words: \"%s\", \"%s\", and \"%s\".", str1, str2, str3);

//        System.out.println("Enter a sentence.");
//        scanner.nextLine();   to clear out the scanner so it doesnt fall to the next line.
//        String sentence = scanner.nextLine();
//        System.out.printf("I like your sentence of: %s", sentence);

//        instructor example:
//        System.out.println("Enter a sentence.");
////        scanner.nextLine();   to clear out the scanner so it doesnt fall to the next line.
//        String sentence = scanner.nextLine();
//        System.out.printf("You entered: \"%s\"%n", sentence);


//        System.out.println("Enter the length of the classroom in feet");
//        String length = scanner.nextLine();
//        System.out.println("Now enter the width of the classroom.");
//        String width = scanner.nextLine();
//        int theLength = Integer.parseInt(length);
//        int theWidth = Integer.parseInt(width);
//        System.out.println("The area of the classroom is: " + (theLength * theWidth));
//        System.out.println("The perimeter of the classroom is: " + ((theLength * 2) + (theWidth * 2)));

//        Instructor example for area / perimeter
        System.out.println("Give me a length in feet:");
        int length = Integer.parseInt(scanner.nextLine());
        System.out.printf("Length entered: %d feet.%nGive me a width in feet:%n", length);
        int width = Integer.parseInt(scanner.nextLine());
        int area = length * width;
        int perimeter = (2 * width) + (2 * length);
        System.out.printf("Length entered: %d feet. %n Width entered: %d feet. %n Area of room: %d feet squared. %nPerimeter of room: %d feet.%n", length, width, area, perimeter);



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

//        scanner.useDelimiter("\n");
//        System.out.println("Enter the length, width, and height of the classroom in feet");
//        String length = scanner.nextLine();
////        System.out.println("Now enter the width of the classroom.");
//        String width = scanner.nextLine();
////        System.out.println("Now enter the height of the classroom.");
//        String height = scanner.nextLine();
//        float theLength = Float.parseFloat(length);
//        float theWidth = Float.parseFloat(width);
//        float theHeight = Float.parseFloat(height);
//        System.out.println("The area of the classroom is: " + (theLength * theWidth));
//        System.out.println("The perimeter of the classroom is: " + ((theLength * 2) + (theWidth * 2)));
//        System.out.println("The volume of the classroom is: " + ((theLength * theWidth) * theHeight));

    }
}
