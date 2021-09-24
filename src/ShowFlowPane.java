
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ShowFlowPane extends Application {
	@Override
	// Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a pane and set its properties
		FlowPane pane = new FlowPane(5, 5);
		pane.setPadding(new Insets(12, 12, 12, 12));
//		pane.setHgap(5);
//		pane.setVgap(5);

		// *****把节点放入流动面板中
		pane.getChildren().addAll(new Label("First Name:"), new TextField(),
				new Label("MI:"));
		
		TextField tfMi = new TextField();
		tfMi.setPrefColumnCount(1);
		// *****继续把节点放入流动面板中
		pane.getChildren().addAll(tfMi, new Label("Last Name:"),
				new TextField());

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 380, 100);
		primaryStage.setTitle("ShowFlowPane"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	/**
	 * The main method is only needed for the IDE with limited JavaFX support.
	 * Not needed for running from the command line.
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
