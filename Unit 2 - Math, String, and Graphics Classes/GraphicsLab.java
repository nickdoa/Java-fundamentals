
/**
 * GraphicsLab
 *
 * @author Nick Choi
 * @version 2/13/23
 */

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;
import java.util.Random;

public class GraphicsLab extends Application{

    public static void main(String[] args) {
        launch(args);
    }
 
    @Override 
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Drawing Operations Test");
        Group root = new Group();
        Canvas canvas = new Canvas(1500, 1000);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawShapes(gc);
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
    
    public void drawShapes(GraphicsContext gc){
        gc.setFill(Color.AQUA);
        gc.fillArc(50, 50, 300, 300, 0, 360, ArcType.CHORD);
        
        gc.setFill(Color.LAVENDER);
        gc.fillOval(400, 50, 500, 300);
    
        gc.setFill(Color.RED);
        gc.fillRect(500, 550, 300, 200);
        
        Random rand = new Random();
        int r = rand.nextInt(256);
        int g = rand.nextInt(256);
        int b = rand.nextInt(256);
        gc.setStroke(Color.rgb(r, g, b));
        
        gc.setLineWidth(5);
        gc.strokeLine(1200, 900, 1200, 600);
        gc.strokeLine(1200, 600, 1000, 900);
        gc.strokeLine(1000, 900, 1200, 900);

        gc.restore();
    }
}
