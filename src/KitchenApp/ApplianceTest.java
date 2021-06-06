package KitchenApp;


//Abstract class
//Highest level of "parent"/"superclass".
//Creates "template" for a class. "idea" that we will define at a later time.
//Can't directly instantiate an abstract class

public class ApplianceTest {
    public static void main(String[] args) {
//        Unable to create (instantiate) new object from an abstract class.
//        Appliance app1 = new Appliance();

//        Appliance app1 = new Refrigerator("two door fridge", "LG", true);
//
////        only have access to brandName and type because accessing creating from Appliance class which does not have hasFreezer.
//        System.out.println(app1.brandName);
//        System.out.println(app1.type);

        Refrigerator app2 = new Refrigerator("two door fridge", "LG", true);
        System.out.println(app2.brandName);
        System.out.println(app2.type);
        System.out.println(app2.isHasShelves());
        app2.keepFresh();

        IceChest chest = new IceChest();
        chest.keepFresh();

//Can still access brandname because it is accessed from Appliance - can cause some issues, but possible.
        MiniFridge mini = new MiniFridge("One door", "Samsung");
        System.out.println(mini.brandName);
    }
}
