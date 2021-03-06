package shapes;

public class Square extends Rectangle {


//    POLY EXERCISE
//    This is the side variable
//    protected double side;
//
//    //pass the variable of "side" to the parent class constructor.
//    public Square(double side) {
////        this.width = side;
////        this.length = side;
////        new Rectangle(side, side);
//        //by calling super() we can access the original public Rectangle constructor/method we created
//        //However this method requires two arguments: length and width so we have to set those values equal to something or the code wont run.
//        //we can do this by calling "side" twice to fill the values for Length & width.
//        super(side, side);
////        set "the side variable" equal to whats being passed into the constructor
//        this.side = side;
//    }
//
//    public double getArea() {
//        return side * side;
//    }
//
//    //
//    public double getPerimeter() {
//        return 4 * side;
//    }

//    ABSTRACT / INTERFACES

//}

//MY SOLUTION
//public class Square extends Quadrilateral {
//
//    protected int side;
//
//    public Square(int side){
//        super(side, side);
//        this.side = side;
//    }
//
//    public int setLength(int length){
//        this.length = length;
//        return length;
//    }
//
//    public int setWidth(int width){
//        this.width = width;
//        return width;
//    }
//
//
//    @Override
//    public double getPerimeter() {
//        return side * 4;
//    }
//
//    @Override
//    public double getArea() {
//        return side * side;
//    }

//INSTRUCTOR EXAMPLE

    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
        this.length = width;
    }


}





