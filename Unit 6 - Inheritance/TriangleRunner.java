
/**
 * TriangleRunner
 *
 * @author Nick Choi
 * @version 4/10/23
 */

import java.util.Random;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.util.Duration;

public class TriangleRunner extends Application{
     
    SierpinskiTriangle st;  
    
    public void start(Stage stage) throws Exception {
        Canvas canvas = new Canvas(1000, 700);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        st = new SierpinskiTriangle(gc);
        Timeline tl = new Timeline(new KeyFrame(Duration.millis(1), e -> run(gc))); 
        tl.setCycleCount(Timeline.INDEFINITE); 
        stage.setScene(new Scene(new StackPane(canvas)));
        stage.show();
        tl.play();
    }
    public void run(GraphicsContext gc){
        st.drawTriangle();
    }
}

