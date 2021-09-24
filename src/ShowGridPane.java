
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ShowGridPane extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a pane and set its properties
    GridPane pane = new GridPane();
    pane.setAlignment(Pos.CENTER);
    pane.setPadding(new Insets(12, 12, 12, 12));
    pane.setHgap(5.5);
    pane.setVgap(5.5);
    
    // **把节点放入网格布局面板的指定单元格中——（对象，列，行）
//    pane.add(new Label("First Name:"), 0, 0);
//    pane.add(new TextField(), 1, 0);
//    pane.add(new Label("MI:"), 0, 1); 
//    pane.add(new TextField(), 1, 1);
//    pane.add(new Label("Last Name:"), 0, 2);
//    pane.add(new TextField(), 1, 2);
//    Button btAdd = new Button("Add Name");
//    pane.add(btAdd, 1, 3);
//    GridPane.setHalignment(btAdd, HPos.RIGHT);
    
    // 也可以以行的方式添加节点
    pane.addRow(0, new Label("First Name:"),new TextField());
    pane.addRow(1, new Label("MI:"), new TextField()); 
    pane.addRow(2, new Label("Last Name:"), new TextField());
    
    Button btAdd = new Button("Add Name");
    pane.add(btAdd, 1, 3);
    GridPane.setHalignment(btAdd, HPos.RIGHT);
    
    // Create a scene and place it in the stage
    Scene scene = new Scene(pane);
    primaryStage.setTitle("ShowGridPane"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
    
  }
  
  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
} 