
/**
 * Dot
 *
 * @author Nick Choi
 * @version 4/10/23
 */

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class Dot {
    private GraphicsContext gc;
    private int x;
    private int y;
    
    public Dot(GraphicsContext gc, int x, int y) {
        this.gc = gc;
        this.x = x;
        this.y = y;
    }
    public void drawDot() {
        gc.strokeLine(x, y, x, y);
    }
}