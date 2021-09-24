
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyJavaFX extends Application {
	@Override
	// ��дApplication���е�start����
	public void start(Stage primaryStage) {
		// ����һ����ť�������ŵ�������
		Button btOK = new Button("OK");
		Scene scene = new Scene(btOK, 300, 250);
		
		primaryStage.setScene(scene); // ��֮ǰ�����ĳ���������̨��
		primaryStage.setTitle("MyJavaFX"); // ������̨�ı���
		primaryStage.show(); // ��ʾ��̨
	}

	/**
	 * The main method is only needed for the IDE with limited JavaFX support.
	 * Not needed for running from the command line.
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
