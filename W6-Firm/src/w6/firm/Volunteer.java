package w6.firm;

/**
 * @author Naia Siti Az-zahra
 * @version 1.0
 * @since 2023-02-21
 * @description Represents a staff member that works as a volunteer
 */

public class Volunteer extends StaffMember {
    // Sets up a volunteer using the specified information
    public Volunteer (String eName, String eAddress, String ePhone) {
        super (eName, eAddress, ePhone);
    }
    
    @Override
    // Returns a zero pay value for this volunteer
    public double pay() {
        return 0.0;
    }
}
