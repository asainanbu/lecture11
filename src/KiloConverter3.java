
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class KiloConverter3 extends Application {
	private final int WINDOW_LENGTH = 550;
	private final int WINIDOW_HEIGHT = 130;

	private Label msgLabel;
	private TextField distanceTf;
	private Button calcBtn;
	
	private VBox vPane;
	private HBox hPane;

	@Override
	public void start(Stage primaryStage) throws Exception {
		//***************创建标签、文本框、按钮等组件**************
		// 创建标签
		msgLabel = new Label("Enter a distance in kilometers");
		
		// 创建文本框
		distanceTf = new TextField();
		
		// 创建按钮
		calcBtn = new Button("Calculate");
		
		//*******************HBox的创建*******************
		// 创建HBox, HBox中组件之间的水平间距为15
		hPane = new HBox(15);
		
		// HBox中组件水平垂直居中显示
		hPane.setAlignment(Pos.CENTER);
		
		// 把标签和文本框添加到HBox中
		hPane.getChildren().addAll(msgLabel, distanceTf);

		//***************VBox的创建****************
		// 创建垂直布局面板,VBox中组件的垂直间距为15
		vPane = new VBox(15);
		
		// VBox中的组件水平垂直居中
		vPane.setAlignment(Pos.CENTER);
		
		// 把HBox面板和按钮放入VBox中
		vPane.getChildren().addAll(hPane, calcBtn);
		
		calcBtn.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent arg0) {
				double kilos = Double.valueOf(distanceTf.getText());
				double miles = kilos / 1.609;
				Alert msgBox = new Alert(Alert.AlertType.INFORMATION, String.valueOf(miles));
				msgBox.show();
			}
		});
		
		//****************场景和舞台的创建***************
		// 创建场景 
		Scene scene = new Scene(vPane, this.WINDOW_LENGTH, this.WINIDOW_HEIGHT);
		
		// 把创建的场景放入舞台
		primaryStage.setScene(scene);
		
		// 设置舞台标题
		primaryStage.setTitle("Kilometer Converter");
				
		// 显示舞台
		primaryStage.show();
	}
	
	// 创建对应的事件处理类
//	private class OKButtonListener implements EventHandler<ActionEvent>{
//		@Override
//		public void handle(ActionEvent arg0) {
//			double kilos = Double.valueOf(distanceTf.getText());
//			double miles = kilos / 1.609;
//			Alert msgBox = new Alert(Alert.AlertType.INFORMATION, String.valueOf(miles));
//			msgBox.show();
//		}
//	}
	
	public static void main(String[] args) {
		// 运行Java FX应用程序
		launch(args);
	}
}
