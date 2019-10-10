package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
			GridPane pane = new GridPane();
			Scene scene = new Scene(pane,600,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Label lblHead = new Label("Phone Book");
			Button btnNext = new Button("Next");
			Button btnPrevious = new Button("Previous");
			Button btnAdd = new Button("Add");
			Button btnDelete = new Button("Delete");
			Button btnUpdate = new Button("Update");
			TextField txtSearch = new TextField();
			Button btnSearch = new Button("Search");
			Label lblName = new Label("Name: ");
			TextField txtName = new TextField();
			Label lblNumber = new Label("Phone Number: ");
			TextField txtNumber = new TextField();
			RadioButton radName = new RadioButton("Name");
			RadioButton radNumber = new RadioButton("Number");
			primaryStage.setScene(scene);
			primaryStage.show();
			pane.add(lblHead, 2, 1);
			pane.add(btnNext,1,2);
	        pane.add(btnPrevious, 2, 2);
	        pane.add(txtSearch,1,3);
	        pane.add(radName, 2, 3);
	        pane.add(radNumber, 2, 4);
	        pane.add(btnSearch, 3, 3);
	        pane.add(lblName, 1, 5);
	        pane.add(txtName, 2, 5);
	        pane.add(lblNumber, 1, 6);
	        pane.add(txtNumber, 2, 6);
	        pane.add(btnAdd, 1, 7);
	        pane.add(btnDelete, 2, 7);
	        pane.add(btnUpdate, 3, 7);

	        

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	

	
	public static void main(String[] args) {
		launch(args);

		DB_Access db = new DB_Access();
		
	}
}
