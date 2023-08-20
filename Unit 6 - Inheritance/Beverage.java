
/**
 * Beverage
 *
 * @author Nick Choi
 * @version 4/13/23
 */

public class Beverage {
    protected String beverageName; 

    public Beverage(String beverageName) {
        this.beverageName = beverageName;
    }
    public String getBeverageName() { 
        return beverageName;
    }
    public String toString() {
        return "Beverage name: " + getBeverageName();
    }
}