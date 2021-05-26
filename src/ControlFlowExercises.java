import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//       #1 while loop
//
//        int i = 5;
//        while (i <= 15){
//            System.out.print(i++ + " ");
//        }
//
//        do-while loops
//
//        int i = 2;
//        do {
//            if(i % 2 == 0) {
//                System.out.println(i);
//            }
//            i++;
//        } while (i <= 100);

//        instructor example
//        int i = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//        } while (i <= 100);

//
//        int j = 100;
//        do {
//            if(j % 5 == 0){
//                System.out.println(j);
//            } j--;
//        } while (j >= -10);

//        instructor example
//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);

//
//        long k = 2;
//        do {
//            System.out.println(k);
//            k *= k;
//        } while (k < 1000000);


//        instructor example
//        long i = 2L;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i < 1000000);

//
//        for loops
//
//        for(int i = 2; i <= 100; i++){
//            if(i % 2 == 0){
//                System.out.println(i);
//            }
//        }

//
//        for(int j = 100; j >= -10; j--){
//            if(j % 5 == 0){
//                System.out.println(j);
//            }
//        }

//        instructor
//        for(int i = 100; i >= -10; i -= 5){
//            System.out.println(i);
//        }
//
//        for(long k = 2; k <= 1000000; k*=k){
//            System.out.println(k);
//        }

//        instructor
//        for(long i = 2L; i < 1000000; i *= i){
//            System.out.println(i);
//        }


//         #2
///*You have to design the code such that the user has only three tries to guess the correct pin of the account. You set the pin as a constant with a final attribute. When correct display "Correct, welcome back." When incorrect display "Incorrect, try again.". When user runs out of tries display "Sorry but you have been locked out."
//program Starts:
//Please enter pin:
//22132
//Output:
//Incorrect, try again.
//Please enter pin:
//23412
//Output:
//Incorrect, try again.
//Please enter pin:
//12345
//Output:
//Correct, welcome back.

        Scanner scanner = new Scanner(System.in);
//        final int pin = 1112;
//
//        for(int i = 0; i <= 2; i++) {
//            System.out.println("Enter your pin number:");
//            int attempt = scanner.nextInt();
//            if (attempt == pin) {
//                System.out.println("Correct, welcome back.");
//                break;
//            } else if(i == 2) {
//                System.out.println("Sorry but you have been locked out");
//            }  else {
//                System.out.println("Incorrect, try again.");
//            }
//        }

//        instructor example
//        final int pin = 12345;
//        int userInput = 0;
//        int attempts = 1;
//        while (attempts <= 3){
//            System.out.println("enter pin number:");
//            userInput = scanner.nextInt();
//            if(userInput != pin){
//                if(attempts < 3){
//                    System.out.println("incorrect, try again");
//                }
//                else {
//                    System.out.println("You're locked out.");
//                }
//            } else {
//                System.out.println("correct, welcome back");
//                break;
//            }
//            attempts++;
//        }



//        System.out.println("What number would you like to go up to?");
//        int userInput = scanner.nextInt();
//        System.out.printf("Here is your table!%n");
//        System.out.printf("number  |  squared |  cubed%n------  | ------   | -----%n ");
//        for(int i = 1; i <= userInput; i++){
//            int squared = i * i;
//            int cubed = i * i * i;
//            System.out.printf("%d       | %d        | %d%n", i, squared,cubed);
//        }


//        DISPLAY POWER TABLE BASED ON USER INPUT
//        do{
//            System.out.println("What number would you like to go up to?");
//        int userInput = scanner.nextInt();
//        System.out.printf("Here is your table!%n");
//        System.out.printf("number  |  squared |  cubed%n------  | ------   | -----%n ");
//        for(int i = 1; i <= userInput; i++){
//            int squared = i * i;
//            int cubed = i * i * i;
//            System.out.printf("%d       | %d        | %d%n", i, squared,cubed);
//        }
//            System.out.println("Would you like to continue? Yes/No");
//
//        } while(scanner.next().toLowerCase().equals("yes"));


//       instructor example (it does not run again when you enter y)
//        System.out.println("What number would you like to go up to?");
//        boolean userWantsToContinue = false;
//        do{
//            int userInput = scanner.nextInt();
//            System.out.println("Here is your table!");
//            System.out.println("");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | ------");
//            for(int i = 1; i <= userInput; i++){
//                System.out.printf("%-7d| %-8d| %-5d%n", i, i*i, i * i * i);
//            }
//            System.out.println("Enter another number? y/n");
//            String userAnswer = scanner.next();
//            if(userAnswer.equals("y")){
//                userWantsToContinue = true;
//            }
//        } while (userWantsToContinue == true);







//        do {
//            System.out.println("Please enter your numeric grade: 0-100");
//            int userInput = scanner.nextInt();
//            if(userInput >= 88 && userInput <= 100){
//                System.out.printf("Your percentage of %d gets you an A. Great job!", userInput);
//            } else if(userInput >= 80 && userInput <= 87){
//                System.out.printf("Your percentage of %d gets you a B. Great effort!", userInput);
//            } else if(userInput >= 67 && userInput <= 79){
//                System.out.printf("Your percentage of %d gets you a C. Keep studying!", userInput);
//            } else if(userInput >= 60 && userInput <= 66){
//                System.out.printf("Your percentage of %d gets you an D. You barely passed!", userInput);
//            } else {
//                System.out.printf("Your percentage of %d gets you a F. You failed!", userInput);
//            }
//            System.out.printf("%nWould you like to enter another grade? Yes/No");
//
//        } while (scanner.next().toLowerCase().equals("yes"));

//        instructor example
        String userChoice = "y";
        while(!userChoice.equals("n")){
            System.out.println("Enter the student's numerical grade: ");
            byte grade = scanner.nextByte();
            char letterGrade;
            if(grade > 0 && grade <= 59){
                letterGrade = 'F';
            } else if (grade > 59 && grade <= 66){
                letterGrade = 'D';
            } else if (grade > 66 && grade <= 79){
                letterGrade = 'C';
            } else if (grade > 79 && grade <= 87){
                letterGrade = 'B';
            } else {
                letterGrade = 'A';
            }
            System.out.println("Letter grade is: " + letterGrade);
            System.out.println("Would you like to enter another grade? (y/n)");
            userChoice = scanner.next();
        }


    }
}
