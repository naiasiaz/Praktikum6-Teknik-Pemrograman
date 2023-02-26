package w6.paintthings;

/**
 * @author Naia Siti Az-zahra
 * @version 1.0
 * @since 2023-02-23
 * @description Represents a type of paint that has a fixed area covered by a gallon
 * All measurements are in feet
 */

public class Paint {
    private double coverage; // Number of aquare feet per gallon
    
    // Constructor: Sets up the paint object
    public Paint(double c) {
        coverage = c;
    }
    
    // Returns the amount of paint (number of gallons) needed to paint the shape given as the parameter
    public double amount(Shape s) {
        System.out.println("Computing amount for " + s);
        double area = s.area();
        double result = area / coverage;
        return result;
    }
}
