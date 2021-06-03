public class Penguin extends Bird{
//    Override MakeNoise()
    public void makeNoise(){
        System.out.println(this.getName() + " goes honk honk!");
    }

//    Override move()
    public void move(){
        System.out.println(this.getName() + " goes waddle waddle.");
    }

}
