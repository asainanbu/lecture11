
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class KiloConverter1 extends Application {
	private final int WINDOW_LENGTH = 550;
	private final int WINIDOW_HEIGHT = 130;

	private Label msgLabel;
	private TextField distanceTf;
	private Button calcBtn;
	
	private VBox vPane;
	private HBox hPane;

	@Override
	public void start(Stage primaryStage) throws Exception {
		//***************������ǩ���ı��򡢰�ť�����**************
		// ������ǩ
		msgLabel = new Label("Enter a distance in kilometers");
		
		// �����ı���
		distanceTf = new TextField();
		
		// ������ť
		calcBtn = new Button("Calculate");
		
		//*******************HBox�Ĵ���*******************
		// ����HBox, HBox�����֮���ˮƽ���Ϊ15
		hPane = new HBox(15);
		
		// HBox�����ˮƽ��ֱ������ʾ
		hPane.setAlignment(Pos.CENTER);
		
		// �ѱ�ǩ���ı�����ӵ�HBox��
		hPane.getChildren().addAll(msgLabel, distanceTf);

		//***************VBox�Ĵ���****************
		// ������ֱ�������,VBox������Ĵ�ֱ���Ϊ15
		vPane = new VBox(15);
		
		// VBox�е����ˮƽ��ֱ����
		vPane.setAlignment(Pos.CENTER);
		
		// ��HBox���Ͱ�ť����VBox��
		vPane.getChildren().addAll(hPane, calcBtn);
		
		//****************��������̨�Ĵ���***************
		// �������� 
		Scene scene = new Scene(vPane, this.WINDOW_LENGTH, this.WINIDOW_HEIGHT);
		
		// �Ѵ����ĳ���������̨
		primaryStage.setScene(scene);
		
		// ������̨����
		primaryStage.setTitle("Kilometer Converter");
				
		// ��ʾ��̨
		primaryStage.show();
	}
	
	// ������Ӧ���¼�������

	public static void main(String[] args) {
		// ����Java FXӦ�ó���
		launch(args);
	}
}
