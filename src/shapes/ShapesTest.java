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

//        Measurable myShape = new Square(5);
        Measurable myShape = new Rectangle(5, 5);
        System.out.println("MyShape area = " + myShape.getArea());
        System.out.println("MyShape perim = " + myShape.getPerimeter());
//        System.out.println(myShape.getLength());  // this works if create new Rectangle from Rectangle class, but not Measurable
    }
}
