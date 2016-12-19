package aix;

import javafx.application.Application;
import javafx.stage.Stage;

public class Game extends Application {
	
	public static void main(String[] args) {
        launch(args);
    }

	@Override
	public void start(Stage stage) throws Exception {
        stage.setTitle("aix");
        stage.show();
        
        World world = new World(20, 20);
        world.addAnt(0, 1);
		world.addAnt(1, 0);

		world.printGrid();
		while (true) {
			world.advance();
			//world.printGrid();	
		}
	}
}
