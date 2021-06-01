package oopLecture;

import java.util.Scanner;

public class UserManager {
    public static Scanner scanner = new Scanner(System.in);

    public static void startMenu(User u) {
        System.out.println("welcome, what would you like to do?");
        System.out.println("1. Log in. \n2. Exit Program");

        int userChoice = scanner.nextInt();

        if (userChoice == 1) {
            UserTools.logIn(u);
            editPreferences(u);
        } else {
            System.out.println("thank you for your time. bye");
        }
    }

    public static void editPreferences(User u) {
        if (!u.isLoggedIn()) {
            System.out.println("Sorry you are logged out. log in");
            UserTools.logIn(u);
        } else {
            System.out.println("Welcome to your preferences. Would you like to: \n1.Change password\n2. Change username \n3. View credentials \n4. logout");
            int userChoice = scanner.nextInt();
            System.out.println("Your chose choice " + userChoice);
            switch (userChoice) {
                case 1:
                    UserTools.changePassword(u);
                    editPreferences(u);
                    break;
                case 2:
//                    use instance method to describe user from user.java
                    UserTools.changeUsername(u);
                    editPreferences(u);
                    break;
                case 3:
//                    use instance method to describe user from user.java
                    u.describeUser();
                    editPreferences(u);
                    break;
                default:
                    UserTools.logOut(u);
                    startMenu(u);
            }
        }
    }


    public static void main(String[] args) {

        User user2 = new User("codeup", "gocodeup", "codeup@email.com");

        startMenu(user2);
    }

}
