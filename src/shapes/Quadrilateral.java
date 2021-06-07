package shapes;

public abstract class Quadrilateral extends Shape implements Measurable{

//    My solution
//    protected int length;
//    protected int width;
//
//    public Quadrilateral(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public Quadrilateral(){}
//
//    public int getLength() {
//        return length;
//    }
//
//    public abstract int setLength(int length);
//
//    public int getWidth() {
//        return width;
//    }
//
//    public abstract int setWidth(int width);

//    INSTRUCTOR EXAMPLE
    protected double length;
    protected double width;

    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

//    Using void because only setting value, not returning
    public abstract void setLength(double length);
    public abstract void setWidth(double width);




}
