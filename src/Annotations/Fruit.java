package Annotations;


public class Fruit implements Food{

    private String flavor;

    @Deprecated
    private boolean hasFlesh;

//    Does not pick up the Deprecated annotation
    private boolean edibleSeeds;

    @Deprecated
    public void tasteBitter(){
        System.out.println("look at them run away!");
    }

//    Override not required, but should use for other developers reference.
    @Override
    public String taste(){
        return this.flavor;
    }


    public static void main(String[] args) {
        Fruit lime = new Fruit();
//      will give warning since its Deprecated
//        lime.tasteBitter();
        lime.flavor = "sour";
        System.out.println(lime.taste());


    }

}
