
/**
 * IESTriangleRunner
 *
 * @author Nick Choi
 * @version 4/18/23
 */

import java.util.Scanner;

public class IESTriangleRunner
{
    public static void main(String[] args)
    {
            Scanner scan = new Scanner(System.in);
        IESTriangle tri = new IESTriangle();
    
        System.out.print("Enter Side 1 --> ");
        int side1 = scan.nextInt();
        System.out.print("Enter Side 2 --> ");
        int side2 = scan.nextInt();
        System.out.print("Enter Side 3 --> ");
        int side3 = scan.nextInt();
    
    	tri.setSides(side1,side2,side3);
        
    	System.out.println();
        System.out.println("This triangle is " + tri.getTriangleType());
    
    }
}
