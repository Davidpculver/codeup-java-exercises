import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//       #1 while loop

//        int i = 5;
//        while (i <= 15){
//            System.out.println(i);
//            i++;
//        }

//        do-while loops

//        int i = 2;
//        do {
//            if(i % 2 == 0) {
//                System.out.println(i);
//            }
//            i++;
//        } while (i <= 100);

//        int j = 100;
//        do {
//            if(j % 5 == 0){
//                System.out.println(j);
//            } j--;
//        } while (j >= -10);

//        long k = 2;
//        do {
//            System.out.println(k);
//            k *= k;
//        } while (k <= 1000000);

//        for loops

//        for(int i = 2; i <= 100; i++){
//            if(i % 2 == 0){
//                System.out.println(i);
//            }
//        }

//        for(int j = 100; j >= -10; j--){
//            if(j % 5 == 0){
//                System.out.println(j);
//            }
//        }

//        for(long k = 2; k <= 1000000; k*=k){
//            System.out.println(k);
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

//        System.out.println("What number would you like to go up to?");
//        int userInput = scanner.nextInt();
//        System.out.printf("Here is your table!%n");
//        System.out.printf("number  |  squared |  cubed%n------  | ------   | -----%n ");
//        for(int i = 1; i <= userInput; i++){
//            int squared = i * i;
//            int cubed = i * i * i;
//            System.out.printf("%d       | %d        | %d%n", i, squared,cubed);
//        }

        do{
            System.out.println("What number would you like to go up to?");
        int userInput = scanner.nextInt();
        System.out.printf("Here is your table!%n");
        System.out.printf("number  |  squared |  cubed%n------  | ------   | -----%n ");
        for(int i = 1; i <= userInput; i++){
            int squared = i * i;
            int cubed = i * i * i;
            System.out.printf("%d       | %d        | %d%n", i, squared,cubed);
        }
            System.out.println("Would you like to continue? Yes/No");

        } while(scanner.next().toLowerCase().equals("yes"));



    }
}
