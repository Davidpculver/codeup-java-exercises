package KitchenApp;

import java.util.Scanner;

public class Refrigerator extends Appliance implements StoreFood{

    private boolean hasShelves;

    public boolean isHasShelves(){
        return hasShelves;
    }

    public void setHasShelves(boolean hasShelves) {
        this.hasShelves = hasShelves;
    }

//    still have access to type because we are extending from Appliance class. Implementing
    public void setType(String type){
        this.type = type;
    }
//    Coming from the abstract method in appliance class
    public void setBrandName(String brandName){
        this.brandName = brandName;
    }

    public Refrigerator(String type, String brandName, boolean hasShelves){
        super(type, brandName);
        this.hasShelves = hasShelves;
    }

    public Refrigerator(String type, String brandName){
        super(type, brandName);
    }

    public void keepFresh(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to put something in the fridge? (Y/N)");
        String userChoice = scanner.nextLine();
        while(userChoice.equalsIgnoreCase("y") || userChoice.equalsIgnoreCase("yes")){
            System.out.println("What would you like to put in the fridge?");
            String item = scanner.nextLine();
            System.out.printf("Sounds good! I will keep your %s cold for you.\n", item);
            System.out.println("Would you like to add anything else in fridge? (Y/N)");
            userChoice = scanner.nextLine();
        }
        System.out.println("Ok, stay cool!");
    }


}
