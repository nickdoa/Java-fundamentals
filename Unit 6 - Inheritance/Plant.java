
/**
 * Plant
 *
 * @author Nick Choi
 * @version 4/6/23
 */

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class Plant {
    protected GraphicsContext gc;
    protected int x, y;

    public Plant(GraphicsContext gc, int x, int y){
        this.gc = gc;
        this.x = x;
        this.y = y;
        drawTreeTop();
    }
    public void drawTreeTop(){
        double[] xPoints = {x, x+25, x+50};
        double[] yPoints = {y+75, y, y+75};
        gc.setFill(Color.GREEN);
        gc.fillPolygon(xPoints, yPoints, 3);
    }
}