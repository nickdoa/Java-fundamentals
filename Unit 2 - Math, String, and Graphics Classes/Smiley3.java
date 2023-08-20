
/**
 * SmileyFace
 *
 * @author Nick Choi
 * @version 2/9/23
 */

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.ArcType;

public class Smiley3 extends Application{

    public static void main(String[] args) {
        launch(args);
    }
 
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Drawing Operations Test");
        Group root = new Group();
        Canvas canvas = new Canvas(500, 500);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawShapes(gc);
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
    
    public void drawShapes(GraphicsContext gc){
        gc.setFill(Color.YELLOW);         // yellow face
        gc.fillOval(200, 200, 200, 200);
        
        gc.setFill(Color.WHITE);          // white eyes
        gc.fillOval(250, 250, 25, 25);
        gc.fillOval(310, 250, 25, 25);
        
        gc.setFill(Color.BLACK);          // black pupils
        gc.fillOval(265, 265, 10, 10);
        gc.fillOval(315, 265, 10, 10);
        
        gc.setFill(Color.BLACK);          // smile; black under layer
        gc.fillArc(225, 300, 150, 100, 180, 180, ArcType.OPEN);
        
        gc.setFill(Color.YELLOW);         // smile; yellow over layer
        gc.fillArc(225, 300, 150, 100, 0, 180, ArcType.OPEN);
        
        gc.setStroke(Color.BLACK);        // tongue--black line
        gc.strokeArc(275, 350, 50, 50, 0, -180, ArcType.OPEN);
        
        gc.setFill(Color.RED);            // red tongue
        gc.fillArc(275, 350, 50, 50, 0, -180, ArcType.OPEN);
        
        gc.setFill(Color.BLACK);          // hat brim
        gc.fillRect(200, 200, 200, 50);
        
        gc.setFill(Color.BLACK);          // hat top
        gc.fillRect(270, 100, 50, 100);
        
        gc.setFill(Color.RED);            // red stuff on hat
        gc.fillRect(280, 75, 25, 25);
    }
}
