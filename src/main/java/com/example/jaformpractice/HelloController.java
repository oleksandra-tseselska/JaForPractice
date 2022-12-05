package com.example.jaformpractice;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.text.Text;

public class HelloController {

    @FXML
    private TextField inputAge;

    @FXML
    private TextField inputFirstName;

    @FXML
    private TextField inputGender;

    @FXML
    private TextField inputLastName;

    @FXML
    private Text labelAge;

    @FXML
    private Text labelFistName;

    @FXML
    private Text labelGender;

    @FXML
    private Text labelLastName;

    @FXML
    void onButtonClick(ActionEvent event) {

        if(inputFirstName.getText().isBlank() || inputLastName.getText().isBlank() || inputAge.getText().isBlank() || inputGender.getText().isBlank()){
            Alert errorAlert = new Alert(Alert.AlertType.ERROR);
            errorAlert.setContentText("All inputs are required");
            errorAlert.show();
        } else {
            Alert infAlert = new Alert(Alert.AlertType.INFORMATION);
            infAlert.setContentText("Name: "+inputFirstName.getText()+" "+inputLastName.getText()+
                    "\nGender: "+inputGender.getText()+"\nAge: "+inputAge.getText());
            infAlert.show();
        }


    }
//    @FXML
//    void onButtonClick(ActionEvent event) {
//        inputText.setText(input.getText());
//        Alert alert = new Alert(Alert.AlertType.INFORMATION);
//        alert.setContentText("Value of text has been changed");
//        alert.show();
//    }
}