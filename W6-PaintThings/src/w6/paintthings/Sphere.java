package w6.paintthings;

/**
 * @author Naia Siti Az-zahra
 * @version 1.0
 * @since 2023-02-23
 * @description Represents a sphere
 */

public class Sphere extends Shape {
    private double radius;  // radius in feet
    
    // Constructor: Sets up the sphere
    public Sphere(double r) {
        super("Sphere");
        radius = r;
    }
    
    @Override
    // Returns the surface area of the sphere
    public double area() {
        return 4*Math.PI*radius*radius;
    }
    
    @Override
    // Returns the sphere as a String
    public String toString() {
        return super.toString() + " of radius " + radius;
    }
}
