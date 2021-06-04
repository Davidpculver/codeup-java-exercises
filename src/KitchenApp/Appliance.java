package KitchenApp;

//Use when want to force subclass to define methods

public abstract class Appliance {

    protected String type;
    protected String brandName;


//Can set up generator
    public Appliance(String type, String brandName){
        this.type = type;
        this.brandName = brandName;
    }

//    Can set up abstract methods - set up definition of it
//    creates blueprint for method to be implemented in the subclass. Provides the return type, name of method, and number of parameters and param types.
    public abstract void setType(String type);

    public abstract void setBrandName(String brandName);

}
