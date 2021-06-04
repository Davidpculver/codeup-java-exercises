public class Finch extends Bird{

//    When we use the super keyword, it will match whichever method matches our entered arguments.
    public void makeNoise(){
        super.makeNoise();
        System.out.println("Tweet tweet!");
    }

    public Finch(){
        super(); //dont need this
        System.out.println("A Finch just got created.");
    }

    public Finch(String name, boolean canIFly){
        this.setName(name);
        this.setCanFly(canIFly);
    }
}
