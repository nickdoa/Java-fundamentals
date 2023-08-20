
/**
 * SodaRunner
 *
 * @author Nick Choi
 * @version 4/13/23
 */


public class SodaRunner {
    public static void main(String[] args) {
        SodaContainer container = new SodaContainer("Coca Cola", "Regular", 150, 39, "Height: 12.4 inches Diameter: 4.33 inches", 2, "Red", "Plastic", true);
        DietSoda dietSoda = new DietSoda("Diet Coke", container);
        System.out.println(dietSoda.toString());
    }
}
