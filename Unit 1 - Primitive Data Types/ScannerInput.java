
/**
 * ScannerInput
 *
 * @author Nick Choi
 * @version 1/19/23
 */

import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); 
        
        int intOne, intTwo; 
        
        System.out.print("Enter an integer :: ");
        intOne = keyboard.nextInt();
        
        System.out.print("Enter an integer :: ");
        intTwo = keyboard.nextInt();
        System.out.println(" ");
        
        double doubleOne, doubleTwo;
        
        System.out.print("Enter a double :: ");
        doubleOne = keyboard.nextDouble();
        
        System.out.print("Enter a double :: ");
        doubleTwo = keyboard.nextDouble();
        System.out.println(" ");
        
        float floatOne, floatTwo;
        
        System.out.print("Enter a float :: ");
        floatOne = keyboard.nextFloat();
        
        System.out.print("Enter a float :: ");
        floatTwo = keyboard.nextFloat();
        System.out.println(" ");
        
        short shortOne, shortTwo;
        
        System.out.print("Enter a short :: ");
        shortOne = keyboard.nextShort();
        
        System.out.print("Enter a short :: ");
        shortTwo = keyboard.nextShort();
        System.out.println(" ");
        
        byte byteOne, byteTwo;
        
        System.out.print("Enter a byte :: ");
        byteOne = keyboard.nextByte();
        
        System.out.print("Enter a byte :: ");
        byteTwo = keyboard.nextByte();
        System.out.println(" ");
   
        long longOne, longTwo;
        
        System.out.print("Enter a long :: ");
        longOne = keyboard.nextLong();
        
        System.out.print("Enter a long :: ");
        longTwo = keyboard.nextLong();
        System.out.println(" ");
        
        System.out.println("integer one = " + intOne);
        System.out.println("integer two = " + intTwo);
        System.out.println(" ");
        System.out.println("double one = " + doubleOne);
        System.out.println("double two = " + doubleTwo);
        System.out.println(" ");
        System.out.println("float one = " + floatOne);
        System.out.println("float two = " + floatTwo);
        System.out.println(" ");
        System.out.println("short one = " + shortOne);
        System.out.println("short two = " + shortTwo);
        System.out.println(" "); 
        System.out.println("byte one = " + byteOne);
        System.out.println("byte two = " + byteTwo);
        System.out.println(" ");
        System.out.println("long one = " + longOne);
        System.out.println("long two = " + longTwo);
        System.out.println(" ");
        }
}