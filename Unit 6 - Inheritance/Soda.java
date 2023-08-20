
/**
 * Soda
 *
 * @author Nick Choi
 * @version 4/13/23
 */

public class Soda extends Beverage {
    protected String sodaName; 
    
    public Soda(String sodaName) {
        super(sodaName);
        this.sodaName = sodaName;
    }
    public String getSodaName() { 
        return sodaName;
    }    
    public String toString() {
        return "Soda name: " + getSodaName();
    }
}