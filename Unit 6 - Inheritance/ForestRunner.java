
/**
 * ForestRunner
 *
 * @author Nick Choi
 * @version 4/6/23
 */

import java.util.Random;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ForestRunner extends Application{
    public void start(Stage stage) throws Exception {
        Canvas canvas = new Canvas(500, 500);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        
        Timeline tl = new Timeline(new KeyFrame(Duration.millis(100), e -> run(gc))); 

        tl.setCycleCount(Timeline.INDEFINITE); 

        stage.setScene(new Scene(new StackPane(canvas)));
        stage.show();
        tl.play();
    }
    public void run(GraphicsContext gc){
        Random rand = new Random();
        int x = rand.nextInt(450) + 25;
        int y = rand.nextInt(350) + 150;

        Tree tree = new Tree(gc, x, y);
    }
}