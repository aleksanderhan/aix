package aix;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.stage.Stage;

public class Game extends Application {
	
	public static void main(String[] args) {
        launch(args);
    }

	@Override
	public void start(Stage stage) throws Exception {
        stage.setTitle("aix");
        
        Group root = new Group();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        
        Canvas canvas = new Canvas();
        root.getChildren().add(canvas);
        
        stage.show();
        
        
        World world = new World(3, 3);
        world.addAnt(1, 1);

		world.printGrid();
		world.advance();
		world.printGrid();	
	}
}
