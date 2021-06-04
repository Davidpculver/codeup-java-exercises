//Inherits all public instance variables and methods from the Birds class. (extends Bird)

//Can't run without a main class, but able to access it from another class. Main is the start button to start the other classes to do something.
//Duck is the subclass of the Bird superclass
public class Duck extends Bird {
// Duck inherits from Bird

//    override methods:
// The make noise method in Duck class overrides the makeNoise method in Bird class.

//    uses the super class makeNoise method
//    When overriding you have to fulfill the protocol. Arguments must be the same, and return types compatible
//
    public void makeNoise(){
        super.makeNoise();
        System.out.println("Quack Quack!");
    }

//Dont do this, creates infinite loop.
//    public void setName(String duckName){
//        this.setName(duckName);
//    }

//    Instead use the setName method from Bird super class
    public void setName(String duckName){
//        When using protected in superclass this works:
//        super.name = duckName
//        But this is more secure:
        super.setName(duckName);
    }



}
