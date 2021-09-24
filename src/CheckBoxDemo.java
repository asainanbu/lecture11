import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class CheckBoxDemo extends ButtonDemo {
	@Override
	// Override the getPane() method in the super class
	protected BorderPane getPane() {
		BorderPane pane = super.getPane();

		// ****创建字体对象
		Font fontBoldItalic = Font.font("Times New Roman", FontWeight.BOLD,
				FontPosture.ITALIC, 20);
		Font fontBold = Font.font("Times New Roman", FontWeight.BOLD,
				FontPosture.REGULAR, 20);
		Font fontItalic = Font.font("Times New Roman", FontWeight.NORMAL,
				FontPosture.ITALIC, 20);
		Font fontNormal = Font.font("Times New Roman", FontWeight.NORMAL,
				FontPosture.REGULAR, 20);

		text.setFont(fontNormal);

		VBox paneForCheckBoxes = new VBox(20);
		paneForCheckBoxes.setPadding(new Insets(5, 5, 0, 5));
		paneForCheckBoxes.setStyle("-fx-border-color: green");
		
		//****创建复选框对象
		CheckBox chkBold = new CheckBox("Bold");
		CheckBox chkItalic = new CheckBox("Italic");
		paneForCheckBoxes.getChildren().addAll(chkBold, chkItalic);
		pane.setRight(paneForCheckBoxes);

		// *****把处理器对象的地址赋值给handler
		EventHandler<ActionEvent> handler = e -> {
			//****判断复选框是否选中
			if (chkBold.isSelected() && chkItalic.isSelected()) {
				text.setFont(fontBoldItalic); // Both check boxes checked
			} else if (chkBold.isSelected()) {
				text.setFont(fontBold); // The Bold check box checked
			} else if (chkItalic.isSelected()) {
				text.setFont(fontItalic); // The Italic check box checked
			} else {
				text.setFont(fontNormal); // Both check boxes unchecked
			}
		};

		//****多对一
		chkBold.setOnAction(handler);
		chkItalic.setOnAction(handler);

		return pane; // Return a new pane
	}

	/**
	 * The main method is only needed for the IDE with limited JavaFX support.
	 * Not needed for running from the command line.
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
