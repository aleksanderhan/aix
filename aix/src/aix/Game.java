package aix;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;

public class Game extends Application {
	
	public static void main(String[] args) {
        launch(args);
    }

	@Override
	public void start(Stage stage) throws Exception {
		World world = new World(3, 3);
        world.addAnt(1, 1);
        
        stage.setTitle("aix");
        
        Group root = new Group();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        
        Canvas canvas = new Canvas();
        root.getChildren().add(canvas);
        
        GraphicsContext gc = canvas.getGraphicsContext2D();
        
        new AnimationTimer()
        {
            public void handle(long currentNanoTime)
            {


            }
        }.start();
        
        stage.show();
                 
	}
	
}
