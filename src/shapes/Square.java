package shapes;

public class Square extends Rectangle{

    protected double side;

    public Square(double side) {
//        this.width = side;
//        this.length = side;
//        new Rectangle(side, side);
        super(side, side);
        this.side = side;
    }

    public void getArea(){
        System.out.println("This area is running " + side * side);
    }
//
    public void getPerimeter() {
        System.out.println("This perimeter is running " + 4 * side);
    }
}
