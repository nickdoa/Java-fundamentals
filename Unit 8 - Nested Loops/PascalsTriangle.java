

/**
 * PascalsTriangle
 *
 * @author Nick Choi
 * @version 5/4/23
 */

import java.util.Scanner;
 
public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String response = "y";
        
        while (response.equals("y")) {
            System.out.print("Enter a number: ");
            int num = input.nextInt();
            input.nextLine();
            System.out.println();
            
            printTriangle(num);
            System.out.print("Do you want to enter more data? (y/n) ");
            response = input.nextLine();
        }
        input.close();
        
    }
    
    public static void printTriangle(int num) {
        
        for (int i = 0; i <= num - 1; i++) {
            
            for (int j = 0; j <= num - i; j++) {
                System.out.print(" ");
            }
            
            if (i == 0) {
                System.out.print("1");
            } else if (i == 1) {
                System.out.print("1  1");
            } else {
                System.out.print("1 ");
               
                int previousTermValue = 1;
                
                for (int j = 2; j <=i + 1; j++) {
                    int currentTermValue = previousTermValue * (i - (j-2))/((j - 2) + 1);
                    System.out.print(" " + currentTermValue + " ");
                    previousTermValue = currentTermValue;
                }
            }
            
            System.out.println();
        }
        
        System.out.println("\n\n");
    }
}

