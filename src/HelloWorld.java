import java.sql.SQLOutput;

public class HelloWorld {
    //  p-s-v-m method: typically used for debugging and running app inside of class; Lets us see interactions between code, and command line. The main method is like the index.html file
    public static void main(String[] args) {
//      System: computer - Out: output - print: print in command line. IDE compiles it for us. (command+shift+r shortcut to run)
//      println - print to separate line
        System.out.println("Hello, ");
        System.out.println("World!");


        byte smallNumber = 34;
        System.out.println(smallNumber);

        short notAsSmallNumber = 30000;

        int num = 45000000;

//        can store numbers up to - so can be much smaller, may have to enter L following the number; but takes up more memory than necessary
        long largeNumber = 14;

        System.out.println(largeNumber);

//        Cap F to denote working with a float number (casting)
        float decimal = 1.5F;

        double bigDecimal = 45;
        System.out.println(bigDecimal);

//        unicode character contained in single quotes; double quotes used for strings. Cannot change
        char singleLetter = 'g';

        boolean amILearningJava = true;

//         strings are reference data type; use capital s
        String message = "I am learning Java\n and am scared!";
        System.out.println(message);

//      final: can not change the value (like const in js) - use "screaming snake case" - capital letters with underscore
        final char FINAL_EXAMPLE = 'w';

//        prints 9
        int sum = 4 + 5;
        System.out.println(sum);

        int difference = 72 - 19;

        int product = 11 * 9;

        int quotient = product / sum;
        System.out.println(quotient);

        int remainder = difference % sum;

        int whatWillThisBe = -4 * 2;
        System.out.println(whatWillThisBe);

//        same js - post incrementation. prints 9, then 10
        System.out.println(sum++);
        System.out.println(sum);


//        CASTING: One type into another type
        int iAmAnInt = 44;
        long iAmALong = iAmAnInt;
        System.out.println(iAmALong);

        iAmALong = 99;
        iAmAnInt = (int) iAmALong;
        System.out.println(iAmAnInt);

        iAmAnInt = 27;
        double iAMADouble = iAmAnInt;
        System.out.println(iAMADouble);


        int myFavoriteNumber = 5;
        System.out.println(myFavoriteNumber);

        String myString = "3.14159";
        System.out.println(myString);

//        float myNumber = 3.14F;
        float myNumber = (float) 3.14;
        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//        int class = 55;

        String theNumberThree = "three";
        System.out.println(theNumberThree);
        Object o = theNumberThree;
//        int three = (int) o;
//        System.out.println(three);
        System.out.println(o);
//        int three = (int) "three";


//        int x = 4;
//        x += 5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y *= x;
//        System.out.println(y);
//        System.out.println(x);

        int x = 10;
        int y = 2;
//        x /= y;
//        System.out.println(x);
        y -= x;
        System.out.println(y);

    }
}
