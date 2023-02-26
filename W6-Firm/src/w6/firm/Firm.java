package w6.firm;

/**
 * @author Naia Siti Az-zahra
 * @version 1.0
 * @since 2023-02-21
 * @description Demonstrates polymorphism via inheritance
 */

public class Firm {

    /**
     * Creates a staff of employees for a firm and pays them
     * @param args
     */
    public static void main(String[] args) {
        Staff personnel = new Staff();
        
        personnel.payday();
    }
    
}
