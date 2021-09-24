
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyJavaFX extends Application {
	@Override
	// 重写Application类中的start方法
	public void start(Stage primaryStage) {
		// 创建一个按钮并把它放到场景中
		Button btOK = new Button("OK");
		Scene scene = new Scene(btOK, 300, 250);
		
		primaryStage.setScene(scene); // 把之前创建的场景放入舞台中
		primaryStage.setTitle("MyJavaFX"); // 设置舞台的标题
		primaryStage.show(); // 显示舞台
	}

	/**
	 * The main method is only needed for the IDE with limited JavaFX support.
	 * Not needed for running from the command line.
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
