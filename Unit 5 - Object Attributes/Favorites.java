
/**
 * Favorites
 *
 * @author Nick Choi
 * @version 3/29/23
 */

public class Favorites {
    private String name;
    private String food;
    private String color;
    private String music;
    private String automobile;
    private String sport;
    
    public Favorites(String name, String food, String color, String music, String automobile, String sport) {
        this.name = name;
        this.food = food;
        this.color = color;
        this.music = music;
        this.automobile = automobile;
        this.sport = sport;
    }
    public String toString() {
        return  "Name       : " + name + "\n" +
                "Food       : " + food + "\n" +
                "Color      : " + color + "\n" +
                "Music      : " + music + "\n" +
                "Automobile : " + automobile + "\n" +
                "Sport      : " + sport;
    }
}
