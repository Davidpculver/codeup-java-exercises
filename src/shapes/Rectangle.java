package shapes;

public class Rectangle extends Quadrilateral implements Measurable {


//    POLY EXERCISE
//    protected double length;
//    protected double width;
//
//    public Rectangle(){}
//
//    public Rectangle(double length, double width){
//        this.length = length;
//        this.width = width;
//    }
//
//
//    public double getArea(){
////        System.out.println(length * width);
//        return length * width;
//    }
//
//    public double getPerimeter(){
////        System.out.println((2 * length) + (2 * width));
//        return (2 * length) + (2 * width);
//    }

    //    ABSTRACT / INTERFACES

    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }


    public double getArea() {
        return length * width;
    }


    public int setLength(int length) {
        this.length = length;
        return length;
    }


    public int setWidth(int width) {
        this.width = width;
        return width;
    }
}
