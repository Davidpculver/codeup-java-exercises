import java.util.Random;

public class ServerNameGenerator {


    static String[] adjectives = {"adorable", "annoying", "awful", "charming", "disturbed", "dull", "excited", "grumpy", "helpless", "unsightly"};

    static String[] nouns = {"people", "family", "government", "food", "instructor", "lecture", "story", "world", "man", "coffee shop"};

    public static void randomServerName(){

//        for(int i = 0; i < 10; i++){
            Random rand = new Random();
            int answer = rand.nextInt(10);
            Random rand2 = new Random();
            int answer2 = rand.nextInt(10);
//            System.out.println("answer " + answer);
//            System.out.println("answer2 " + answer2);
            System.out.println("Here is your server name:");
            System.out.println(adjectives[answer] + " - " + nouns[answer2]);
//        }

    }

    public static void main(String[] args) {
        randomServerName();
    }

}
