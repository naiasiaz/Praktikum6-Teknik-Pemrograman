package w6.paintthings;

/**
 * @author Naia Siti Az-zahra
 * @version 1.0
 * @since 2023-02-23
 */

public class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle(double l, double w) {
        super("Rectangle");
        length = l;
        width = w;
    }
    
    @Override
    public double area() {
        return length * width;
    }
    
    @Override
    public String toString() {
        return super.toString() + " of length " + length + " and of width " + width;
    }
}
