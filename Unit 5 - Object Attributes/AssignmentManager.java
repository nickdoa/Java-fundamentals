
/**
 * AssignmentManager
 *
 * @author Nick Choi
 * @version 3/20/23
 */

import java.util.*;

public class AssignmentManager {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Assignment a1 = new Assignment();
        Assignment a2;
        Assignment a3;
        
        System.out.println("Enter assignment name:");
        String name = input.nextLine();
        a1.setName(name);
        
        System.out.println("Enter assignment type (daily work, quiz, test):");
        String type = input.nextLine();
        a1.setType(type);
        
        System.out.println("Enter assignment score:");
        int score = input.nextInt();
        a1.setScore(score);
        
        input.nextLine();
        System.out.println("/**************************************/");
        System.out.println("/*       Test Default Constructor     */");
        System.out.println("/*       and Accessor methods         */");
        System.out.println("/**************************************/");
        System.out.println("Type         : " + a1.getType());
        System.out.println("Name         : " + a1.getName());
        System.out.println("Score        : " + a1.getScore());
        System.out.println("Letter Grade : " + a1.getLetterGrade());
        System.out.println();
        
        a2 = new Assignment(type, name, score);
        a3 = new Assignment(type, name, score);
        System.out.println("/**************************************/");
        System.out.println("/*       Test 2nd Constructor         */");
        System.out.println("/*       and Accessor methods         */");
        System.out.println("/**************************************/");
        System.out.println();
        System.out.println("Type         : " + a2.getType());
        System.out.println("Name         : " + a2.getName());
        System.out.println("Score        : " + a2.getScore());
        System.out.println("Letter Grade : " + a2.getLetterGrade());
        System.out.println();
        System.out.println("Type         : " + a3.getType());
        System.out.println("Name         : " + a3.getName());
        System.out.println("Score        : " + a3.getScore());
        System.out.println("Letter Grade : " + a3.getLetterGrade());
        System.out.println();
    
        System.out.println("/**************************************/");
        System.out.println("/*       Test Mutator methods         */");
        System.out.println("/*       and Accessor methods         */");
        System.out.println("/**************************************/");
        System.out.println();
        System.out.println("Type         : " + a2.getType());
        System.out.println("Name         : " + a2.getName());
        System.out.println("Score        : " + a2.getScore());
        System.out.println("Letter Grade : " + a2.getLetterGrade());
        System.out.println();
        System.out.println("Type         : " + a3.getType());
        System.out.println("Name         : " + a3.getName());
        System.out.println("Score        : " + a3.getScore());
        System.out.println("Letter Grade : " + a3.getLetterGrade());
    }
}


