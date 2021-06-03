//Can access the Bird class since its in the same directory

public class BirdTest {
    public static void main(String[] args) {
//        Cardinal reference to the Bird object.
//        Bird cardinal = new Bird();
//        cardinal.setName("Cardinal");
//        cardinal.setCanFly(true);
//        cardinal.makeNoise();
//        cardinal.move();

//        Runs even if no code inside the Duck class
//        Duck mallard = new Duck();
//        mallard.makeNoise();

//        Constructor
//        declare reference variable (lives in the 'stack'); new = assignment operator creates the object calls the default constructor ( looks like: public Bird(){} ) has no return type because it returns the object; assigns the new object (lives in the 'heap').
        Duck mallard = new Duck();
        mallard.setName("Mallard");
        mallard.makeNoise();

        Finch goldFinch = new Finch();
        goldFinch.setName("Gold Finch");
        goldFinch.makeNoise();

        Penguin penguin = new Penguin();
//        Still using inherited setName method. the name lives inside the Bird object
        penguin.setName("Emperor Penguin");
        penguin.setCanFly(false);
        penguin.move();
        penguin.makeNoise();


//        Polymorphism allows us to have different reference and object types
//        create reference to penguin object and make the reference type bird.
//        WHY??? can make polymorphic arrays.
//        Bird myPenguin = new Penguin();

//        Code in bird class runs before code in finch class. Children cannot exist before the parents.The first thing that runs when constructor - its superclass constructor runs first.
        Finch houseFinch = new Finch();


        Bird piratesBestFriend = new Bird();
        System.out.println(piratesBestFriend.getName());
    }

}
