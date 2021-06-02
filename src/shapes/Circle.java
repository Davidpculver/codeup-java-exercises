package shapes;

import java.util.Scanner;

public class Circle {

//    private double radius;
//    private double getArea;
//    private double getCircumference;
//
//    public Circle(){}
//
//    public Circle(double radius) {
//        this.radius = radius;
//    }
//
//    public double getArea(){
//        return Math.PI * (radius * radius);
//    }
//
//    public double getCircumference(){
//        return 2 * Math.PI * this.radius;
//    }



//    INSTRUCTOR EXAMPLE
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return (radius * radius) * Math.PI;
    }

    public double getCircumference(){
        return (2 * Math.PI) * this.radius;
    }

}
