package oopLecture;

// setting up fields for the User class
//    for private, have to use getters and setters. private only available within this class
public class User {
    public int id;
    private String username;
    private String password;
    public String email;
    private boolean isLoggedIn = false;

//    empty constructor for the User class
    public User(){
    }

//    setters and getters for private
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    //    instance methods: getters/setters (method) returning the value of password
    public String getPassword(){
        return password;
    }

    public String setPassword(String password){
        return this.password = password;
    }

//    right click, generate, getter/setter, select what to add for.
    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }


//    instance method - used to describe "this" particular instance of the User object.
    public void describeUser(){
        System.out.println("TestUser Username: " + this.username);
        System.out.println("TestUser Password: " + this.password);
        System.out.println("TestUser Email: " + this.email);
        System.out.println("Logged in? " + this.isLoggedIn);
    }



    //    Creating an overloaded constructor method - used in the main method. can have as many constructors that we want. (method overload)
    public User(String username, String password, String email){
        this.username = username;
//        defining within the class, so dont have to use setPassword
        this.password = password;
        this.email = email;
    }





    public static void main(String[] args){
        User testUser = new User();

        testUser.id = 1;
        testUser.username = "crdorito";
        testUser.password = "password";
        testUser.email = "crdorito@gmail.com";

//        Moved to instance method describe user
//        System.out.println("TestUser Username: " + testUser.username);
//        System.out.println("TestUser Password: " + testUser.password);
//        System.out.println("TestUser Email: " + testUser.email);
//        System.out.println("Logged in? " + testUser.isLoggedIn);

//        Using the User constructor
        User user2 = new User("codeup", "gocodeup", "codeup@email.com");

        System.out.println("User2 Username: " + user2.username);
        System.out.println("User2 Password: " + user2.password);
        System.out.println("User2 Email: " + user2.email);
        System.out.println(user2.getPassword());

    }

}
