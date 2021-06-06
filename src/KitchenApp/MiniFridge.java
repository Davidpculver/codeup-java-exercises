package KitchenApp;

public class MiniFridge extends Refrigerator implements StoreFood{

//    Had to create overloaded method in Refrigerator that only takes 2 parameters.
    public MiniFridge(String type, String brandName){
        super(type, brandName);
    }

    public void keepFresh(){
        System.out.println("I'm a mini fridge.");
    }



}
