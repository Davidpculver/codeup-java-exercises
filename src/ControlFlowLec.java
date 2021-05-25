import java.util.Scanner;

public class ControlFlowLec {
    public static void main(String[] args) {
//        int x = 5;
////        no strict equality in java because types are defined when its declared.
//        if (x == 5){
//            System.out.println("If you are reading this, x is 5.");
//        }
//
////        Out side conditional brackets so it runs every time.
//        System.out.println("This means nothing about x because it runs regardless of what x is.");

//        int y = 2;
//        y = 3;
//        if(y == 2) {
//            System.out.println("Yes, y does equal 2.");
//        } else {
//            System.out.println("No, y does not equal 2.");
//        }

//        short y = -5;
//        y = 12;
//        y = 32000;
//        if(y < 0){
//            System.out.println("Y contains a negative number.");
//        } else if(y >= 0 && y < 30000){
//            System.out.println("Y contains a positive number");
//        } else {
//            System.out.println("Y contains a numeric value that is close to max val of short type variables which is " + Short.MAX_VALUE);
//        }

//        String customerChoice;
//        customerChoice = "Chocolate";
//
//        switch (customerChoice){
//            case "vanilla":
//                System.out.println("One vanilla coming right up.");
//                break;
//            case "Chocolate":
//                System.out.println("One chocolate coming right up.");
//                break;
//            case "Strawberry":
//                System.out.println("One strawberry coming right up.");
//                break;
//            default:
//                System.out.println("We dont have that.");
//        }
//
//        Logical Operators
//        && || &

//        int c = 0;
//        int d = 100;
//        int e = 50;

//        Short circuit && operator: because if first condition is false, it stops running.
//        if(c == 1 && e++ < 100){
//
//        }
//        System.out.println("e = " + e);
//
////        c == 0 evaluates to true, e does increment. Both have to evaluate to true for the code to run.
//        if(c == 0 && e++ < 100){
//
//        }
//        System.out.println("e = " + e);

//        non short circuit operator: & will always evaluate both conditions. (Kind of similar to or in js) Rare to use.
//        if (c == 1 & e++ < 100){
////           code to run
//        }
//
//        System.out.println("e = " + e);

//        boolean existance = true;
//        boolean solipsism = false;
//        boolean weLiveInADream = false;
//        boolean thisDeskIsReal = true;
//
//        if(thisDeskIsReal || weLiveInADream){
//            System.out.println("Common sense is victorious");
//        } else {
//            System.out.println("Im really confused now.");
//        }



//        these get stored in the same place: the string pool.
        String myName = "David";
//        String anotherDavid = "David";
////        this stores in a new place - a completely different reference
//        String david = new String("David");

//        judges whether they refer to the same thing
//        System.out.println(myName == anotherDavid);
//        System.out.println(myName == david);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("What is your name?");
////        getting input is equivelent to creating new memory space for the string. so below returns false. UserInput refers to different memory space to myName - not the value.
//        String userInput = scanner.next();
////        if(userInput == myName){
////            System.out.println("hello me, thats my name");
////        } else {
////            System.out.println("you are not me");
////        }
//
////        use .equals to compare. this returns true
//        if(userInput.equals(myName)){
//            System.out.println("hello, me!");
//        } else {
//            System.out.println("you're not me");
//        }


//        Loops
//        int i = 1;
//        while(i <= 10){
//            System.out.println("I'm in the loop. I have not incremented. My value is: " + i);
//            i++;
//            System.out.println("I'm in the loop. I have incremented. My value is: " + i);
//        };
//        System.out.println("Outside the loop.");


        for(int i = 0; i < 10; i++){
//            Can only access i inside of the block
            System.out.println(i);
        }


    }
}
