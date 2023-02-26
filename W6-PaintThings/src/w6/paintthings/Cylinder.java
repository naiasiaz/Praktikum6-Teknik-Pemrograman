package w6.paintthings;

/**
 * @author Naia Siti Az-zahra
 * @version 1.0
 * @since 2023-02-23
 */

public class Cylinder extends Shape {
    private double radius;
    private double height;
    
    public Cylinder(double r, double h) {
        super("Cylinder");
        radius = r;
        height = h;
    }
    
    @Override
    public double area() {
        return Math.PI * radius * radius * height;
    }
    
    @Override
    public String toString() {
        return super.toString() + " of radius " + radius + " and of height " + height;
    }
}
