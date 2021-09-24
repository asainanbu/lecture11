
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MultipleStageDemo extends Application {
	@Override
	public void start(Stage primaryStage) {
		// 创建场景，并且把新创建的按钮放到该场景中
		Scene scene = new Scene(new Button("OK"), 300, 250);
		primaryStage.setTitle("MyJavaFX"); // 设置舞台标题
		primaryStage.setScene(scene); // 把之前创建的场景放置到舞台
		primaryStage.show(); // 显示舞台

		// 创建一个新的舞台
		Stage secondStage = new Stage();

		// 设置舞台标题
		secondStage.setTitle("Second Stage");

		// 创建一个带按钮的场景（380，100），并且把该场景放置到该舞台
		Scene secondScene = new Scene(new Button("OK"), 380, 100);
		secondStage.setScene(secondScene);
		
		// 显示新创建的舞台
		secondStage.show();

	}

	/**
	 * The main method is only needed for the IDE with limited JavaFX support. Not
	 * needed for running from the command line.
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
