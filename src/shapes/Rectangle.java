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

//MY SOLUTIONS
//    public Rectangle(int length, int width) {
//        super(length, width);
//        this.length = length;
//        this.width = width;
//    }
//
//    public double getPerimeter() {
//        return (2 * length) + (2 * width);
//    }
//
//
//    public double getArea() {
//        return length * width;
//    }
//
//    @Override
//    public int getLength() {
//        return super.getLength();
//    }
//
//    @Override
//    public int setLength(int length) {
//        return length;
//    }
//
//    @Override
//    public int getWidth() {
//        return super.getWidth();
//    }
//
//    @Override
//    public int setWidth(int width) {
//        return width;
//    }

//    INSTRUCTOR EXAMPLE

    public Rectangle(double length, double width){
//        Using super: Pull these from the parent class. Setting length, width in the quad
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return (length * 2) + (width * 2);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void setLength(double length) {

    }

    @Override
    public void setWidth(double width) {

    }


}
