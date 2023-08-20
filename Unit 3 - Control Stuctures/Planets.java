
/**
 * Planets
 *
 * @author Nick Choi
 * @version 2/21/23
 */

import java.util.Scanner;

public class Planets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double weightOnEarth;
        double weightOnPlanet;
        int choice;
        
        System.out.println("   Planets");
        System.out.println("==============");
        System.out.println("1. Mercury");
        System.out.println("2. Venus");
        System.out.println("3. Mars");
        System.out.println("4. Jupiter");
        System.out.println("5. Saturn");
        System.out.println("6. Uranus");
        System.out.println("7. Neptune");
        System.out.println("8. Pluto");
        
        System.out.print("Select planet (1-8) --> ");
        choice = input.nextInt();
        
        System.out.println(" ");
        System.out.print("Enter your weight on Earth --> ");
        weightOnEarth = input.nextDouble();
        
        switch (choice) {
            case 1:
                weightOnPlanet = weightOnEarth * 0.38;
                System.out.println(" ");
                System.out.printf("Your weight on Mercury is %.1f%n", weightOnPlanet);
                break;
            case 2:
                weightOnPlanet = weightOnEarth * 0.78;
                System.out.println(" ");
                System.out.printf("Your weight on Venus is %.1f%n", weightOnPlanet);
                break;
            case 3:
                weightOnPlanet = weightOnEarth * 0.39;
                System.out.println(" ");
                System.out.printf("Your weight on Mars is %.1f%n", weightOnPlanet);
                break;
            case 4:
                weightOnPlanet = weightOnEarth * 2.65;
                System.out.println(" ");
                System.out.printf("Your weight on Jupiter is %.1f%n", weightOnPlanet);
                break;
            case 5:
                weightOnPlanet = weightOnEarth * 1.17;
                System.out.println(" ");
                System.out.printf("Your weight on Saturn is %.1f%n", weightOnPlanet);
                break;
            case 6:
                weightOnPlanet = weightOnEarth * 1.05;
                System.out.println(" ");
                System.out.printf("Your weight on Uranus is %.1f%n", weightOnPlanet);
                break;
            case 7:
                weightOnPlanet = weightOnEarth * 1.23;
                System.out.println(" ");
                System.out.printf("Your weight on Neptune is %.1f%n", weightOnPlanet);
                break;
            case 8:
                weightOnPlanet = weightOnEarth * 0.05;
                System.out.println(" ");
                System.out.printf("Your weight on Pluto is %.1f%n", weightOnPlanet);
                break;
            default:
                System.out.println(" ");
                System.out.println("Not a planet listed!");
                break;
        }
    }
}

