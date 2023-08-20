
/**
 * SodaContainer
 *
 * @author Nick Choi
 * @version 4/13/23
 */

public class SodaContainer {
    private String brand;
    private String flavor;
    private int calories;
    private int sugarContent;
    private String dimensions;
    private int liters;
    private String color;
    private String bottleMaterial;
    private boolean isRecyclable;
    
    public SodaContainer(String brand, String flavor, int calories, int sugarContent, String dimensions, int liters, String color, String bottleMaterial, boolean isRecyclable) {
        this.brand = brand;
        this.flavor = flavor;
        this.calories = calories;
        this.sugarContent = sugarContent;
        this.dimensions = dimensions;
        this.liters = liters;
        this.color = color;
        this.bottleMaterial = bottleMaterial;
        this.isRecyclable = isRecyclable;
    }
    public String getBrand() {
        return brand;
    }
    public String getFlavor() {
        return flavor;
    }
    public int getCalories() {
        return calories;
    }
    public int getSugarContent() {
        return sugarContent;
    }
    public String getDimensions() {
        return dimensions;
    }
    public int getLiters() {
        return liters;
    }
    public String getColor() {
        return color;
    }
    public String getBottleMaterial() {
        return bottleMaterial;
    }
    public boolean isRecyclable() {
        return isRecyclable;
    }
    public String toString() {
        return "Brand: " + brand + "\n" +
        "Flavor: " + flavor + "\n" +
        "Calories: " + calories + "\n" +
        "Sugar Content: " + sugarContent + "g" + "\n" +
        "Dimensions: " + dimensions + "\n" +
        "Liters: " + liters + "\n" +
        "Color: " + color + "\n" +
        "Bottle Material: " + bottleMaterial + "\n" +
        "Recyclable: " + isRecyclable;
        }
}
