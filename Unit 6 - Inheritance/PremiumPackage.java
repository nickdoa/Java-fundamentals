
/**
 * PremiumPackage
 *
 * @author Nick Choi
 * @version 4/5/23
 */

public class PremiumPackage extends StandardPackage {
    public PremiumPackage(int nights) {
        super(nights);
    }
    @Override
    public String getResort() {
        return "Carribean Resort";
    }
    @Override
    public double getCostPerNight() {
        return 150.00;
    }
    public String getMealPlan() {
        return "Breakfast";
    }
    @Override
    public String toString() {
        String str = super.toString() + "\n" +
                     "Meal Plan = " + getMealPlan();
        return str;
    }
}


