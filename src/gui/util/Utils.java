package gui.util;

import java.io.IOException;
import java.util.function.Consumer;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Utils{
	
	public static Stage currentStage(ActionEvent event) {
		return (Stage) ((Node) event.getSource()).getScene().getWindow();
	}
	
	public synchronized <T> void newWindow(String stageName, String title, Stage parentStage, Consumer<T> init) {
		try {
			FXMLLoader root = new FXMLLoader(getClass().getResource(stageName));
	        Pane pane = root.load();
	        
	        Stage stage = new Stage();
	        stage.setScene(new Scene(pane));
	        stage.setResizable(false);
	        stage.setTitle(title);
	        stage.initOwner(parentStage);
	        stage.initModality(Modality.APPLICATION_MODAL);
	        stage.show();
	        
	        T controller = root.getController();
	        init.accept(controller);
		}
		catch (IOException e) {
			e.getMessage();
		}
	}

	public static Integer tryParseToInt(String str) {
		try {
			return Integer.parseInt(str);
		} catch (NumberFormatException e) {
			return null;
		}
	}
}
