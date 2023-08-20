
/**
 * Flashlight
 *
 * @author Nick Choi
 * @version 2/7/23
 */

public class Flashlight {
    public static void main(String[] args) {
        String str = "flashlight";
        // index      0123456789
        
        String light = str.substring(5);
        System.out.println("Part 1");
        System.out.println("=================");
        System.out.println(str.substring(0, 5));
        System.out.println(str.substring(5));
        System.out.println(str.substring(2, 5));
        System.out.println(str.substring(0, 2) + str.substring(6, 10));
        System.out.println(str.substring(0, 3) + str.substring(7, 8));
        System.out.println(str.substring(0, 1) + str.substring(6, 7) + str.substring(9, 10));
        System.out.println(str.substring(8, 9) + str.substring(6, 9));
        System.out.println(str.substring(7, 8) + str.substring(2, 4));
        System.out.println(str.substring(0, 1) + str.substring(2, 3) + str.substring(3, 4) + str.substring(9, 10));
        System.out.println(str.substring(3, 5) + str.substring(2, 3) + str.substring(0, 1) + str.substring(9, 10));
        
        System.out.println(" ");
        System.out.println("Part 2");
        System.out.println("=================");
        System.out.println(light + "s");
        System.out.println(light + "er");
        System.out.println(light + "ning");
        System.out.println("en" + light + "ened");
        
    }
}

