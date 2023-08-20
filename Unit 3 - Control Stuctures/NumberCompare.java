
/**
 * NumberCompare
 *
 * @author Nick Choi
 * @version 2/16/23
 */

import java.util.Scanner;

public class NumberCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  

        System.out.print("Enter First Integer--> ");
        int num1 = sc.nextInt();
  
        System.out.print("Enter Second Integer--> ");
        int num2 = sc.nextInt();
  
           if(num1 > num2) {
               System.out.println(" ");
               System.out.println(num2 + " -- " + num1);
               System.out.println("largest == " + num1);
               System.out.println("smallest == " + num2);
           } else if(num2 > num1) {
               System.out.println(" ");
               System.out.println(num1 + " -- " + num2);
               System.out.println("largest == " + num2);
               System.out.println("smallest == " + num1);
           } else {
               System.out.println(" ");
               System.out.println(num1 + " -- " + num2);
               System.out.println("The numbers are equal.");
           }
    }
}