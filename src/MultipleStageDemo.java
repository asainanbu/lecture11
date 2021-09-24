
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MultipleStageDemo extends Application {
	@Override
	public void start(Stage primaryStage) {
		// �������������Ұ��´����İ�ť�ŵ��ó�����
		Scene scene = new Scene(new Button("OK"), 300, 250);
		primaryStage.setTitle("MyJavaFX"); // ������̨����
		primaryStage.setScene(scene); // ��֮ǰ�����ĳ������õ���̨
		primaryStage.show(); // ��ʾ��̨

		// ����һ���µ���̨
		Stage secondStage = new Stage();

		// ������̨����
		secondStage.setTitle("Second Stage");

		// ����һ������ť�ĳ�����380��100�������ҰѸó������õ�����̨
		Scene secondScene = new Scene(new Button("OK"), 380, 100);
		secondStage.setScene(secondScene);
		
		// ��ʾ�´�������̨
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
