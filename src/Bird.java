// Bird is the super class. Sets protocol on how the subclasses must follow.

public class Bird {
    //    Can it fly?
//    Private instance variable. Make sure any other class is using it in the right way.
    private boolean canFly;

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    //    What kind of bird is it?
//    protected: anything within the hierarchy can access this. Not the best way to go about security.
    protected String name;

    public String getName() {
        return name;
    }

    //Can add code inside the setters that helps prevent anything bad happen to our private variable.
    public void setName(String name) {
//        Make sure user is logged in
//        Make sure user does not enter an integer, Etc.
        this.name = name;
    }

    //    Essentially uses this as default since most birds tweet tweet. Only need to override in other classes if they make different noise.
//    public void makeNoise(){
//     System.out.print("Tweet tweet!");
//    }

//    Refactoring so we can use this as super class - demonstrated in Duck class
    public void makeNoise() {
        System.out.print(this.getName() + " goes ");
    }

    public void move() {
        System.out.println("Flap flap");
    }




//    Constructor that takes in arguments.
    public Bird (String nameOfThisBird, boolean itCanFly){
        this.name = nameOfThisBird;
        this.canFly = itCanFly;
    }

    //    Need to have this default constructor. Can have it completely empty
    public Bird(){
        System.out.println("A bird just got created.");
        this.canFly = true;
        this.name = "Parrot";
    }


}
