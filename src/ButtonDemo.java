import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

public class ButtonDemo extends Application {
	protected Label text = new Label("JavaFX Programming");

	protected BorderPane getPane() {		
		HBox paneForButtons = new HBox(20);
		//****按钮中可以含有图像
		Button btLeft = new Button("Left", new ImageView("image/left.gif"));
		Button btRight = new Button("Right", new ImageView("image/right.gif"));
		btRight.setContentDisplay(ContentDisplay.RIGHT);

		paneForButtons.getChildren().addAll(btLeft, btRight);
		paneForButtons.setAlignment(Pos.CENTER);
		paneForButtons.setStyle("-fx-border-color: green");

		// 大框架是边界布局，这从方法的返回类型也能看出
		BorderPane pane = new BorderPane();
		pane.setBottom(paneForButtons);

		// ****如果把Pane改成StackPane会怎样？？
		Pane paneForText = new Pane();
		paneForText.getChildren().add(text);
		pane.setCenter(paneForText);

		btLeft.setOnAction(e -> text.setLayoutX(text.getLayoutX() - 10));
		btRight.setOnAction(e -> text.setLayoutX(text.getLayoutX() + 10));

		return pane;
	}

	@Override
	// Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a scene and place it in the stage
		Scene scene = new Scene(getPane(), 450, 200);
		primaryStage.setTitle("ButtonDemo"); // Set the stage title
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
