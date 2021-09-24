
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ShowGridPane2 extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a pane and set its properties
    GridPane pane = new GridPane();
    pane.setAlignment(Pos.CENTER);
    pane.setPadding(new Insets(12, 12, 12, 12));
    pane.setHgap(5.5);
    pane.setVgap(5.5);
    
    // **把节点放入网格布局面板的指定单元格中——（对象，列，行）
    Pane pane1  = new Pane();
    pane1.setStyle("-fx-border-color: blue");
    pane1.getChildren().add(new Label("First Name:"));
    Pane pane2  = new Pane();
    pane2.setStyle("-fx-border-color: blue");
    pane2.getChildren().add(new TextField());
    Pane pane3  = new Pane();
    pane3.getChildren().add(new Label("MI:"));
    pane3.setStyle("-fx-border-color: blue");
    Pane pane4  = new Pane();
    pane4.setStyle("-fx-border-color: blue");
    pane4.getChildren().add(new TextField());
    
    pane.add(pane1, 0, 0);
    pane.add(pane2, 1, 0);
    pane.add(pane3, 0, 1); 
    pane.add(pane4, 1, 1);
    
    
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