package shapes;

public class Rectangle {

    protected double length;
    protected double width;

    public Rectangle(){}

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }


    public double getArea(){
//        System.out.println(length * width);
        return length * width;
    }

    public double getPerimeter(){
//        System.out.println((2 * length) + (2 * width));
        return (2 * length) + (2 * width);
    }

}
