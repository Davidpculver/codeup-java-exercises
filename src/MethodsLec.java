import java.util.Scanner;

public class MethodsLec {

//    For the most part, important to create the methods outside of the psvm method.
    public static void sayHello(String name){
        System.out.printf("Hi there! My name is %s! Have a great day!%n", name);
    }

    //    can define different methods with the same name; ******METHOD OVERLOADING******, use it all the time.
    public static void sayHello(String salutation, String name){
        System.out.printf("%s there! My name is %s! Have a great day!%n", salutation, name);
    }

    public static void sayHello(){
        System.out.printf("Sorry im in a hurry, have a good day.%n");
    }

    public static void sayHello(int times){
        for(int i = 1; i<=times; i++){
            System.out.println("Hello, darling");
        }
    }



//    return type has to match what its returning. in this case, returns an int
    public static int multiply(int num1, int num2){
        return num1 * num2;
    }

//    RECURSION
    public static void willYouTakeUstToSplashmore(Scanner sc){
        System.out.println("will you take us to splashmore?");
        if(!sc.next().equalsIgnoreCase("yes")) {
            willYouTakeUstToSplashmore(sc);
        } else {
            System.out.println("thanks dad youre the best");
        }
    }

    public static void bottlesOfBlank(String beverage, int numOfBottles){
        if(numOfBottles == 0){
            System.out.printf("No more bottles of %s on the wall%nNo more bottles of %s%nStand up now, stumble around%nAll of the bottles of %s on the wall%n", beverage, beverage, beverage);
        } else if (numOfBottles ==1 ){
            System.out.printf("One bottle of %s on the wall%nOne bottle of %s%nTake it down, pass it around%nNo more bottles of %s on the wall.", beverage, beverage, beverage);
            bottlesOfBlank(beverage, numOfBottles - 1);
        } else if(numOfBottles == 2){
            System.out.printf("2 bottles of %s on the wall%n2 bottles of %s%nTake it down, pass it around%nNo more bottles of %s on the wall.", beverage, beverage, beverage);
            bottlesOfBlank(beverage, numOfBottles - 1);
        } else {
            System.out.printf("%d bottles of %s on the wall%n%d bottles of %s%nTake it down, pass it around%n%d bottles of %s on the wall.", numOfBottles, beverage, numOfBottles, beverage, numOfBottles-1, beverage);
            bottlesOfBlank(beverage, numOfBottles - 1);
        }
    }






//    psvm is a method. for the most part, public static void main is used for testing, does not return anything.
//    public denotes methods visibility. access it through the entire src folder? Or just specific parts?
//    static modifier: is this method going to be off a specific object of this class, or the class as a whole? Intro yourself to someone, hello my name is David. Different from how someone else may introduce themselves - this would be dynamic, not STATIC. Static - same across the board. Unchanging from one class to another.
//    void: the return of the function. Return type. void methods will not return any information to us. different methods return different data type. Void will allow us to print to the java console.
//    Main: the name of the method
//    Parameters: Info passed into the method.
//    Methods in Java are just "functions", set up like in javascript
    public static void main(String[] args) {
//        Have to call the methods from above to run
        sayHello("David");
        sayHello("Howdy", "David");
        sayHello();
        sayHello(5);
//        Have to sout the multiply because we are getting back an integer value that we could use outside of the sout
        System.out.println(multiply(5,2));
        int product = multiply(7,3);
        System.out.printf("Did you know %d X %d ='s %d?%n", product, product, product * product);
        willYouTakeUstToSplashmore(new Scanner(System.in));
        bottlesOfBlank("beer", 80);
    }
}
