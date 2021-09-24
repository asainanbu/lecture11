import javafx.geometry.Insets;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class RadioButtonDemo extends CheckBoxDemo {
	@Override
	// Override the getPane() method in the super class
	protected BorderPane getPane() {
		BorderPane pane = super.getPane();

		VBox paneForRadioButtons = new VBox(20);
		paneForRadioButtons.setPadding(new Insets(5, 5, 0, 5));
		paneForRadioButtons.setStyle("-fx-border-color: green");
		paneForRadioButtons
				.setStyle("-fx-border-width: 2px; -fx-border-color: green");
		
		// ****创建三个单选按钮
		RadioButton rbRed = new RadioButton("Red");
		RadioButton rbGreen = new RadioButton("Green");
		RadioButton rbBlue = new RadioButton("Blue");
		paneForRadioButtons.getChildren().addAll(rbRed, rbGreen, rbBlue);
		pane.setLeft(paneForRadioButtons);

		// ****创建开关组对象ToggleGroup，把刚才创建的三个单选按钮放入同一个组中
		

		//****多对多, 可以尝试getSource()方法来解决
		

		

		

		return pane;
	}

	/**
	 * The main method is only needed for the IDE with limited JavaFX support.
	 * Not needed for running from the command line.
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
