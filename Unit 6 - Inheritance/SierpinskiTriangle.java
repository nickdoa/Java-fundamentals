
/**
 * SierpinskiTriangle
 *
 * @author Nick Choi
 * @version 4/10/23
 */

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class SierpinskiTriangle {
    
    private GraphicsContext gc;
    private int x1, x2, x3;
    private int y1, y2, y3;
    private int currentX;
    private int currentY;
    private Dot dot;
    
    public SierpinskiTriangle(GraphicsContext gc){
        this.gc = gc;
        x1 = 512;
        y1 = 109;
        x2 = 146;
        y2 = 654;
        x3 = 876;
        y3 = 654;
        currentX = 512;
        currentY = 382;
        dot = new Dot(gc, currentX, currentY);
    }
    
    public void drawTriangle(){
        int distX = 0;
        int distY = 0;
        dot.drawDot();
        int randomNum = (int)(Math.random() * 3) + 1;
        if(randomNum == 1){
            distX = currentX - x1;
            distY = currentY - y1;
        }else if(randomNum == 2){
            distX = currentX - x2;
            distY = currentY - y2;
        }else{
            distX = currentX - x3;
            distY = currentY - y3;
        }
        currentX = currentX - distX/2;
        currentY = currentY - distY/2;
        dot = new Dot(gc, currentX, currentY);
    }
}

