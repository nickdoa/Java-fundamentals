
/**
 * AutoClicker 
 *
 * @author Yoonjae Choi
 * @version i forgot lol
 */

import java.awt.Robot;
import java.awt.event.InputEvent;

public class AutoClicker {
    public static void main(String[] args) throws Exception {

        Robot robot = new Robot();

        int delay = 10;

        int clickCount = 10000;

        for (int i = 0; i < clickCount; i++) {
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(delay);
        }
    }
}

