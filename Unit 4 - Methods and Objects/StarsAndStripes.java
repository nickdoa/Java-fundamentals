

/**
 * StarsAndStripes
 *
 * @author Nick Choi
 * @version 3/23/23
 */

public class StarsAndStripes {
    private void printTwentyStars() {
        System.out.println("********************");
    }   
    private void printTwentyDashes() {
        System.out.println("--------------------");
    }
    public void printTwoBlankLines() {
        System.out.println("\n\n");
    }
    public void printASmallBox() {
        printTwentyDashes();
        printTwentyStars();
        printTwentyDashes();
        printTwentyStars();
        printTwentyDashes();
        printTwentyStars();
        printTwentyDashes();
    }
    public void printABigBox() {
        printASmallBox();
        printTwoBlankLines();
        printASmallBox();
    }
}