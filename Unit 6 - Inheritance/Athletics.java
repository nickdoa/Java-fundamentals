
/**
 * Athletics
 *
 * @author Nick Choi
 * @version 4/5/23
 */

public class Athletics {
    public static void main(String[] args) {
        Football cowboys = new Football("Cowboys", 10, 8, 2, 20, 2);
        System.out.println(cowboys.toString());
        System.out.println();
        Baseball rangers = new Baseball("Rangers", 20, 12, 8, 25, 65, 5);
        System.out.println(rangers.toString());
    }
}