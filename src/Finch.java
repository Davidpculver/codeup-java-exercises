public class Finch extends Bird{

    public void makeNoise(){
        super.makeNoise();
        System.out.println("Tweet tweet!");
    }

    public Finch(){
        System.out.println("A Finch just got created.");
    }
}
