
/**
 * DiceRunner
 *
 * @author Nick Choi
 * @version 3/23/23
 */

public class DiceRunner {
    public static void main(String[] args) {
	System.out.println("Dice Roller");
	System.out.println("Each number represents a roll on a six sided die.");

	Dice test = new Dice();

	test.printRolls();
    }
}
