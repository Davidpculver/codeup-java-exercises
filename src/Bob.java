import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        String conversation = scanner.nextLine();
//        if(conversation.endsWith("?")){
//            System.out.println("Sure");
//        } else if(conversation.endsWith("!")){
//            System.out.println("Whoa, chill out!");
//        } else if(conversation.equals("")){
//            System.out.println("Fine. Be that way!");
//        } else {
//            System.out.println("Whatever.");
//        }


//        instructor example:

        System.out.println("My name is Bob, my mom said you wanted to talk to me.What do you want?");
        String response = "";
        while(!response.equalsIgnoreCase("QUIT")){
            System.out.println("What do you want?");
            response = scanner.nextLine();
            if(response.isEmpty()){
                System.out.println("Fine. Be that way!");
            } else if(response.endsWith("?")){
                System.out.println("Sure");
            } else if(response.endsWith("!")){
                System.out.println("Whoa, chill out!");
            } else {
                System.out.println("Whatever.");
            }
        }
        System.out.println("Im outta here.");

    }
}
