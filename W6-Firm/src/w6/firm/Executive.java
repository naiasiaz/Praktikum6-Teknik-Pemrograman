package w6.firm;

/**
 * @author Naia Siti Az-zahra
 * @version 1.0
 * @since 2023-02-21
 * @description Represents an executive staff member, who can earn a bonus
 */

public class Executive extends Employee {
    private double bonus;
    
    // Constructor
    // Sets up this executive with the specified information
    public Executive (String eName, String eAddress, String ePhone, String socSecNumber, double rate) {
        super (eName, eAddress, ePhone, socSecNumber, rate);
        bonus = 0;  // bonus has yet to be awarded
    }
    
    // Awards the specified bonus to this executive
    public void awardBonus (double execBonus) {
        bonus = execBonus;
    }
    
    @Override
    // Computes and returns the pay for an executive, which is
    // the regular employee payment plus a one-time bonus.
    public double pay() {
        double payment = super.pay() + bonus;
        
        bonus = 0;
        
        return payment;
    }

}
