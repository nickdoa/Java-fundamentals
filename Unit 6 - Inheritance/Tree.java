
/**
 * Tree
 *
 * @author Nick Choi
 * @version 4/6/23
 */

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Tree extends Plant {
    public Tree(GraphicsContext gc, int x, int y){
        super(gc, x, y);
        drawTrunk();
    }
    public void drawTrunk(){
        gc.setFill(Color.BROWN);
        gc.fillRect(x+17, y+50, 16, 50);
    }
}


