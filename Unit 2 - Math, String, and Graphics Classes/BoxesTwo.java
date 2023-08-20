/**
 * BoxesTwo
 *
 * @author Nick Choi
 * @version 2/10/23
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.util.Random;

public class BoxesTwo extends Application {
@Override
public void start(Stage stage) {
    Canvas canvas = new Canvas(500, 500);
    GraphicsContext gc = canvas.getGraphicsContext2D();
    Random random = new Random();

    gc.setFill(Color.color(random.nextDouble(), random.nextDouble(), random.nextDouble()));
    gc.fillRect(random.nextInt(400), random.nextInt(400), random.nextInt(80) + 20, random.nextInt(80) + 20);
    
    gc.setFill(Color.color(random.nextDouble(), random.nextDouble(), random.nextDouble()));
    gc.fillRect(random.nextInt(400), random.nextInt(400), random.nextInt(80) + 20, random.nextInt(80) + 20);
    
    gc.setFill(Color.color(random.nextDouble(), random.nextDouble(), random.nextDouble()));
    gc.fillRect(random.nextInt(400), random.nextInt(400), random.nextInt(80) + 20, random.nextInt(80) + 20);
    
    gc.setFill(Color.color(random.nextDouble(), random.nextDouble(), random.nextDouble()));
    gc.fillRect(random.nextInt(400), random.nextInt(400), random.nextInt(80) + 20, random.nextInt(80) + 20);
    
    gc.setFill(Color.color(random.nextDouble(), random.nextDouble(), random.nextDouble()));
    gc.fillRect(random.nextInt(400), random.nextInt(400), random.nextInt(80) + 20, random.nextInt(80) + 20);
    
    gc.setFill(Color.color(random.nextDouble(), random.nextDouble(), random.nextDouble()));
    gc.fillRect(random.nextInt(400), random.nextInt(400), random.nextInt(80) + 20, random.nextInt(80) + 20);
    
    gc.setFill(Color.color(random.nextDouble(), random.nextDouble(), random.nextDouble()));
    gc.fillRect(random.nextInt(400), random.nextInt(400), random.nextInt(80) + 20, random.nextInt(80) + 20);
    
    gc.setFill(Color.color(random.nextDouble(), random.nextDouble(), random.nextDouble()));
    gc.fillRect(random.nextInt(400), random.nextInt(400), random.nextInt(80) + 20, random.nextInt(80) + 20);
    
    Pane pane = new Pane();
    pane.getChildren().add(canvas);

    Scene scene = new Scene(pane, 500, 500);
    stage.setScene(scene);
    stage.show();
        }
public static void main(String[] args) {
    launch(args);
    }
}
