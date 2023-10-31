package application;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class Controller implements Initializable{
	
	@FXML
	ObservableList<String> optionList = FXCollections.observableArrayList("Option 1", "Option 2");
	ObservableList<String> farmList = FXCollections.observableArrayList("Tractor", "Backhoe");
	@FXML
	public ChoiceBox<String> myChoiceBox;
	@FXML
	public Button selectButton;
	@FXML
	public Button deleteButton;
	@FXML
	public Label myLabel;
	@FXML
	public TextArea messageBox;
	@FXML
	public TextArea farmItems;
	@FXML
	public void optionSelected(ActionEvent event) {
		System.out.println(myChoiceBox.getValue() + " has been selected");
		messageBox.appendText(myChoiceBox.getValue() + " has been selected\n");
	}
	@FXML
	public void optionDeleted(ActionEvent event) {
		System.out.println(myChoiceBox.getValue() + " has been deleted");
		messageBox.appendText(myChoiceBox.getValue() + " has been deleted\n");
	}
	public static void main(String[] args) {
	
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		myChoiceBox.getItems().addAll(optionList);

	}
}
