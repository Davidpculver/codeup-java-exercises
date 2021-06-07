package shapes;

public class ShapesTest {

    public static void main(String[] args) {
//        POLY EXERCISE
//        Rectangle box1 = new Rectangle(4, 5);
//        System.out.println("Perimeter: " + box1.getPerimeter());
//        System.out.println("Area: " + box1.getArea());
//
//        Rectangle box2 = new Square(5);
//        System.out.println("Perimeter: " + box2.getPerimeter());
//        System.out.println("Area: " + box2.getArea());


//        ABSTRACT / INTERFACES

        Measurable myShape = new Square(5);
//        Measurable myShape = new Rectangle(5, 5);
        System.out.println("MyShape area = " + myShape.getArea());
        System.out.println("MyShape perim = " + myShape.getPerimeter());
//        System.out.println(myShape.getLength());  // this works if create new Rectangle from Rectangle class, but not Measurable
    }
}


//Why does the code fail to compile if you leave off the getPerimeter method in Rectangle?
//Its defined in Measurable interface and is abstract method. Required in rect to be implemented

//    What happens if you try to call the getLength or getWidth methods of the myShape variable? Why?
//Getters should only be accessed in qual bc thats where they are defined. If we wanted to use these methods we would need to reference the quad type.