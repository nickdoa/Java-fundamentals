
/**
 * Methods
 *
 * @author Nick Choi
 * @version 3/24/23
 */

import java.lang.Math;

public class Methods {
    /** @return the square of num
    * @param num the number to be squared
    */
    //  square Method
    public int square(int num) {
        return num * num;
    }
    
    /** @return the sum of num1, num2, and num3
    * @param num1 first number in the sum
    * @param num2 second number in the sum
    * @param num3 third number in the sum
    */
    //  sumThree Method
    public int sumThree(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    
    /** @return the average of num1 and num2
    * @param num1 first number in average
    * @param num2 second number in average
    */
    //  average Method
    public double average(int num1, int num2) {
        return (num1 + num2) / 2.0;
    }

    /** @return the smaller value between num1 and num2
    * @param num1 first number in minimum comparison
    * @param num2 second number in minimum comparison
    */
    //  smaller Method
    public int smaller(int num1, int num2) {
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }  
    
    /** @return an integer random number in the range of [1..range] inclusive
    * @param range the upper bounds of generated random number
    */
    //  randomInt Method
    public int randomInt(int max) {
        return (int) (Math.random() * max) + 1;
    }
    
    /** Determines if num is odd or even. If num is even returns the string "even";
    * otherwise it returns the string "odd"
    * @return the string "even" or the string "odd"
    * @param num number used in comparison
    */
    //  evenOdd Method
    public String evenOdd(int num) {
        if (num % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

    /** Determines the letter grade for grade
    * @return a string value of "A", "B", "C", or "F"
    * @param grade the grade that needs to be converted into a letter grade
    */
    //  getLetterGrade Method
    public char getLetterGrade(int grade) {
        if (grade >= 90) {
            return 'A';
        } else if (grade >= 80) {
            return 'B';
        } else if (grade >= 75) {
            return 'C';
        } else if (grade >= 70) {
            return 'D';
        } else {
            return 'F';
        }
    }

    /** Prints the parameter name followed by the phrase
    * " have a nice day!"
    * @param name the name to be displayed
    */
    //  greeting Method
    public void greeting(String name) {
        System.out.println(name + " have a nice day!");
    }

    /** @return the first letter from parameter str
    * @param str string used to extract first letter from
    */
    // firstLetter Method
    public String firstLetter(String word) {
        return word.substring(0, 1);
    }
    
    /** @return the last letter from parameter str
    * @param str string used to extract last letter from
    */
    //  lastLetter Method
    public String lastLetter(String word) {
        return word.substring(word.length() - 1);
    }
    
    /** @return a substring of str that has first letter removed
    * @param str string used to extract first letter from
    */
    //  removeFirst Methodd
    public String removeFirst(String word) {
        return word.substring(1);
    }
    
    /** @return a substring of str that has last letter removed
    * @param str string used to extract last letter from
    */
    //  removeLast Method
    public String removeLast(String word) {
        return word.substring(0, word.length() - 1);
    }
    
    /** @return a string with str1, str2, and str3 merged together
    * @param str1 first string to be merged
    * @param str2 second string to be merged
    * @param str3 third string to be merged
    */
    //  merge Method
    public String merge(String word1, String word2, String word3) {
        return word1 + word2 + word3;
    }
    
    /** @return a string that is the first letter of parameter
    * str repeated three times.
    * @param str string used to extract first letter from
    */
    //  repeatFirst Method
    public String repeatFirst(String word) {
        String firstLetter = word.substring(0, 1);
        return firstLetter + firstLetter + firstLetter;
    }
    
    /** @return a string that is the last letter of parameter
    * str repeated three times.
    * @param str string used to extract last letter from
    */
    //  repeatLast Method
    public String repeatLast(String word) {
        String lastLetter = word.substring(word.length() - 1);
        return lastLetter + lastLetter + lastLetter;
    }
}
