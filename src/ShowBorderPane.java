
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ShowBorderPane extends Application {
	@Override
	// Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a border pane
		BorderPane pane = new BorderPane();

		// ****把节点放入边界布局指定的区域
		pane.setTop(new CustomPane("Top"));
		pane.setRight(new CustomPane("Right"));
		pane.setBottom(new CustomPane("Bottom"));
		pane.setLeft(new CustomPane("Left"));
		pane.setCenter(new CustomPane("Center"));

//		pane.setTop(new Button("Top"));
//		pane.setRight(new Button("Right"));
//		pane.setBottom(new Button("Bottom"));
//		pane.setLeft(new Button("Left"));
//		pane.setCenter(new Button("Center"));
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("ShowBorderPane"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
	
	public static void main(String[] args){
		launch(args);
	}
}

// Define a custom pane to hold a label in the center of the pane
class CustomPane extends StackPane {
	public CustomPane(String title) {
		getChildren().add(new Button(title));
		setStyle("-fx-border-color: red");
		setPadding(new Insets(12, 12, 12, 12));
	}
}

