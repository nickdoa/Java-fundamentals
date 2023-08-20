
/**
 * FractionCalculator
 *
 * @author Nick Choi
 * @version 2/16/23
 */


import java.util.Scanner;

public class FractionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Fraction Problem (ex: 2/3 + 3/4) --> ");
        String problem = input.nextLine();
        
        int num1 = Integer.parseInt(problem.substring(0, 1));
        int denom1 = Integer.parseInt(problem.substring(2, 3));
        String operator = problem.substring(4, 5);
        int num2 = Integer.parseInt(problem.substring(6, 7));
        int denom2 = Integer.parseInt(problem.substring(8, 9));
        int numAns = 0;
        int denomAns = 0;

        if (operator.equals("+")) {
            numAns = num1 * denom2 + num2 * denom1;
            denomAns = denom1 * denom2;
        } else if (operator.equals("-")) {
            numAns = num1 * denom2 - num2 * denom1;
            denomAns = denom1 * denom2;
        } else if (operator.equals("*")) {
            numAns = num1 * num2;
            denomAns = denom1 * denom2;
        } else if (operator.equals("/")) {
            numAns = num1 * denom2;
            denomAns = denom1 * num2;
        } else {
            System.out.println("Invalid operator.");
            return;
        }
        
        // butterfly method 
        
        int numGCD = findGCD(numAns, denomAns);
        numAns /= numGCD;
        denomAns /= numGCD;

        int denomGCD = findGCD(denomAns, num2);
        num2 /= denomGCD;
        denomAns /= denomGCD;
        
        System.out.println(" ");
        System.out.printf("%d/%d %s %d/%d = %d/%d\n", num1, denom1, operator, num2, denom2, numAns, denomAns);
    }

    public static int findGCD(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        } else {
            return findGCD(num2, num1 % num2);
        }
    }
}

        
      

