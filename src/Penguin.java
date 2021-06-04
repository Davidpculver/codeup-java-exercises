
public class Penguin extends Bird{

//    final cannot be reassigned. Can make a whole class final GalapagosPenguin
    final String ORDER = "Sphenisciformes";

//    Override MakeNoise()
    public void makeNoise(){
        System.out.println(this.getName() + " goes honk honk!");
    }

//    Override move()
    public void move(){
        System.out.println(this.getName() + " goes waddle waddle.");
    }

}
