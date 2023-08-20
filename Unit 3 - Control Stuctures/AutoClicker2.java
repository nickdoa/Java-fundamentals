
/**
 * AutoClicker 
 *
 * @author Yoonjae Choi
 * @version i forgot lol
 */

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AutoClicker2 {
    public static void main(String[] args) throws Exception {
        Robot robot = new Robot();
        int delay = 10;
        int clickCount = 10000;

        robot.setAutoDelay(delay);
        robot.setAutoWaitForIdle(true);

        robot.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1) {
                    while (e.isShiftDown()) {
                        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                        try {
                            Thread.sleep(delay);
                        } catch (InterruptedException ex) {
                            ex.printStackTrace();
                        }
                    }
                }
            }

            public void mouseReleased(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1) {
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                }
            }
        });
    }
}

