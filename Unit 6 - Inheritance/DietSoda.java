
/**
 * DietSoda
 *
 * @author Nick Choi
 * @version 4/13/23
 */

public class DietSoda extends Soda {
    private SodaContainer container;
    
    public DietSoda(String sodaName, SodaContainer container) {
        super(sodaName);
        this.container = container;
    }
    public SodaContainer getContainer() {
        return container;
    }
    public String toString() {
        return super.toString() + "\n" + container.toString();
    }
}