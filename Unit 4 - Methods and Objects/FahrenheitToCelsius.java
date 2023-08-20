
/**
 * FahrenheitToCelsius
 *
 * @author Nick Choi
 * @version 3/21/23
 */

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        convertToFahrenheitVoid(fahrenheit);

        double celsius = convertToFahrenheitReturn(fahrenheit);
        System.out.println("\nReturn Method :: ");
        System.out.printf("%.2f degrees Fahrenheit == %.2f degrees Celsius", fahrenheit, celsius);

        sc.close();
    }
    public static void convertToFahrenheitVoid(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Void Method :: ");
        System.out.printf("%.2f degrees Fahrenheit == %.2f degrees Celsius", fahrenheit, celsius);
    }
    public static double convertToFahrenheitReturn(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}