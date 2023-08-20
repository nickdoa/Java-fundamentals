
/**
 * Seasons
 *
 * @author Nick Choi
 * @version 2/19/23
 */

import java.util.Scanner;

public class Seasons {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a Season --> ");
        String season = input.nextLine().toLowerCase();
        input.close();
        
        String meteorologicalStart = "";
        String meteorologicalEnd = "";
        String astronomicalStart = "";
        String astronomicalEnd = "";
        
        switch (season) {
            case "fall":
                meteorologicalStart = "September 22";
                meteorologicalEnd = "December 20";
                astronomicalStart = "Autumnal Equinox";
                astronomicalEnd = "Winter Solstice";
                break;
            case "winter":
                meteorologicalStart = "December 20";
                meteorologicalEnd = "March 20";
                astronomicalStart = "Winter Solstice";
                astronomicalEnd = "Vernal Equinox";
                break;
            case "spring":
                meteorologicalStart = "March 20";
                meteorologicalEnd = "June 21";
                astronomicalStart = "Vernal Equinox";
                astronomicalEnd = "Summer Solstice";
                break;
            case "summer":
                meteorologicalStart = "June 21";
                meteorologicalEnd = "September 22";
                astronomicalStart = "Summer Solstice";
                astronomicalEnd = "Autumnal Equinox";
                break;
            default:
                System.out.println("Invalid input. Please enter a valid season.");
                return;
        }
        
        System.out.println(" ");
        System.out.println("Season: " + season.substring(0, 1).toUpperCase() + season.substring(1));
        System.out.println(" Meteorological:");
        System.out.println(" " + meteorologicalStart + " - " + meteorologicalEnd);
        System.out.println(" Astronomical:");
        System.out.println(" " + astronomicalStart + " - " + astronomicalEnd);
    }
}
