package shapes;

//importing input class from util package
import util.Input;

public class CircleApp {







//    public static void main(String[] args) {
//        Circle circle1 = new Circle(5);
//        System.out.println(circle1.getArea());
//        System.out.println(circle1.getCircumference());
//    }


//    INSTRUCTOR EXAMPLE
public static void main(String[] args) {
    System.out.println("What is the radius of your circle?");
    Input in = new Input();

//    Longer more explicit way
//    double userRadius = in.getDouble();
////    plug this variable into the constructor to instantiate a new Circle object
//    Circle c = new Circle(userRadius);


    Circle c = new Circle(in.getDouble());

    System.out.println("Area: " + c.getArea());
    System.out.println("Circumference " + c.getCircumference());
}


}
