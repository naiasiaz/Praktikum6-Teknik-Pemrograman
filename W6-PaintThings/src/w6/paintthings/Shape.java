package w6.paintthings;

/**
 * @author Naia Siti Az-zahra
 * @version 1.0
 * @since 2023-02-23
 */

public abstract class Shape {
    String shapeName;
    
    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }
    
    public abstract double area();
    
    @Override
    public String toString() {
        return "A shape with [shape of " + shapeName + "]";
    }
    
}
