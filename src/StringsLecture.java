import java.util.Locale;
import java.util.Scanner;

public class StringsLecture {
    public static void main(String[] args) {

//        can do this comparison when char
//        char character = 'd';
//        System.out.println(character == 'd');

//        scanner creates new object, so can't compare strings directly. Below wont work
//        Scanner scanner = new Scanner(System.in);
//        String bob = "Uncle Bob";
//        String maybeBob = scanner.nextLine();
//        System.out.println(bob == maybeBob);

//        Using the equals method to compare strings
//        Scanner scanner = new Scanner(System.in);
//        String bob = "Uncle Bob";
//        System.out.println("Who is your favorite uncle?");
//        String maybeBob = scanner.nextLine();
////        use the Equals method on the string object
//        System.out.println(bob.equals(maybeBob));

//        Scanner scanner = new Scanner(System.in);
//        String bob = "Uncle Bob";
//        System.out.println("Who is your favorite uncle?");
//        String maybeBob = scanner.nextLine();
////        use the Equals method on the string object
//        System.out.println("User answered with correct answer AND capitalization: " + bob.equals(maybeBob));
////        .equalsIgnoreCase
//        System.out.println("User answered with correct answer: " + bob.equalsIgnoreCase(maybeBob));

//        compare start and end of strings
        String david = "David";
        String dad = "Dad";
//        concat to empty string the first letter of david and save in a string variable so we can compare it to dad.startsWith value
        String firstLetterDavid = "" + david.charAt(0);
        System.out.println("David and Dad start with the same letter? " + dad.startsWith(firstLetterDavid));


//        String coolCats = "Cool cats are cool.";
//        Can pass in variable, or literal value. starts with checks to see if it starts with the sequence of what is passed in, not just the first letter.
//        System.out.println(coolCats.toLowerCase().startsWith("cool"));

//        compare end of characters
        String coolCats = "Cool cats are cool.";
        System.out.println(coolCats.endsWith("."));

//        Manipulation
//        .charAt(number) - see above

//        Where does the sequence start?
        int locationOfAInDad = dad.indexOf("a");
        System.out.println("The location of the letter a in the string \"dad\" is: " + locationOfAInDad);


        int coolCatsLength = coolCats.length();
        System.out.println(coolCatsLength);

        String hiDad = "Hello, Father!";
        System.out.println(hiDad);
//        start, and end. add one to include the last letter
        String father = hiDad.substring(7, 13);
        System.out.println(father);
//        on its own hiDad.replace does not change the value of hiDad. but it will if we set explicity using assignment operator: hiDad =
        hiDad = hiDad.replace(father, dad);
        System.out.println(hiDad);

//        .trim() gets rid of leading and trailing white space, not the spaces within the sentence..
        String whiteSpace = "          Thats a lot of white space";
        System.out.println(whiteSpace);
        System.out.println(whiteSpace.trim());


    }
}
