
/**
 * Horse
 *
 * @author Nick Choi
 * @version 4/3/23
 */

public class Horse {
    // instance variables
    private String owner; 
    private int age;
    private double value; 

    public Horse() {
        owner = "";
        age = 0;
        value = 0;
    }
    public Horse(String o, int a, double v) {
        owner = o;
        age = a;
        value = v;
    }
    public String toString() {
        String str;
        str = "Owner = " + owner + "\n" +
              "Age = " + age + "\n" +
              "Value = $" + value;
        return str;
    }
}
