package oopLecture;

import java.util.Scanner;

public class UserTools {
    public static Scanner scanner = new Scanner(System.in);
    //   static methods: always referred to using the class that every user can use: every user can logIn.
//    Instance methods: only for specific instance of individual user
    public static void logIn(User u) {

        System.out.println("Please enter your password: ");

        String userPassword = scanner.nextLine();

//        password is field from user.java - can use it because it's public (global)
        if(userPassword.equals(u.getPassword())){
            u.setLoggedIn(true);
            System.out.println("Successful login.");
        } else {
            System.out.println("Incorrect password");
            logIn(u);
        }

    }

    public static void changePassword(User u){
        if(!u.isLoggedIn()){
            System.out.println("You are currently logged out. Please log in");
            logIn(u);
        } else {
            System.out.println("Please enter your current password: ");
            String currentPassword = scanner.nextLine();
            if(u.getPassword().equals(currentPassword)){
                System.out.println("Please enter a new password");
                String newPassword = scanner.nextLine();
                u.setPassword(newPassword);
                System.out.println("Your new password is: " + newPassword);
            } else {
                System.out.println("Sorry that password is incorrect.");
            }
        }
    }

    public static void changeUsername(User u) {
        if (!u.isLoggedIn()) {
            System.out.println("You are currently logged out. Please log in");
            logIn(u);
        } else {
            System.out.println("Please enter your new username: ");
            String newUsername = scanner.nextLine();
            u.setUsername(newUsername);
            System.out.println("Your new username is: " + newUsername);
        }
    }


    public static void logOut(User u) {
        System.out.println("Are you sure you want to log out? Y/N");

        String userChoice = scanner.nextLine();

//        password is field from user.java - can use it because it's public (global)
        if(userChoice.equalsIgnoreCase("Y")){
            System.out.println("You have logged out");
        } else {
            System.out.println("We will keep you logged in");
        }

    }


//    MOVED TO MANAGER
    public static void main(String[] args) {
//        User testUser = new User();
//
//        testUser.id = 1;
//        testUser.username = "crdorito";
////        testUser.password = "password";
//        testUser.setPassword("newPassword");
//        testUser.email = "crdorito@gmail.com";
//
//        System.out.println(testUser.getPassword());
//
//        UserTools.logIn(testUser);

//        User user2 = new User("codeup", "gocodeup", "codeup@email.com");
//
//        System.out.println("User2 Username: " + user2.getUsername());
//        System.out.println("User2 Password: " + user2.getPassword());
//        System.out.println("User2 Email: " + user2.email);
//
////        user2.setPassword("Testing");
//        System.out.println(user2.getPassword());
//
//        changePassword(user2);
    }

}
