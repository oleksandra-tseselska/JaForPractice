package com.example.jaformpractice.HumanAlienApp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;

public class HumanAlienController {

    @FXML
    private ToggleGroup BeingType;

    @FXML
    private TextArea textArea;

    @FXML
    void onBtnClick(ActionEvent event) {
        RadioButton selectRadioBtn = (RadioButton) BeingType.getSelectedToggle();
        String type = selectRadioBtn.getText();

        textArea.setText(type);
        System.out.println(type.equals("Alien"));

        if (type.equals("Alien")){
            Alien alien = new Alien();
        }else {
            Human human = new Human();
        }

    }

    @FXML
    void onFeedBtnClick(ActionEvent event) {
        if (BeingType.equals("Alien")){
            Alien alien = new Alien();
            textArea.setText(alien.toString());
            int temp = alien.getEatingLimit();
            alien.setEatingLimit(temp - 1);
        }else {
            Human human = new Human();
            textArea.setText(human.toString());
        }

//        if(){
//            textArea.setText("You can't feed them anymore");
//        }
    }

    public boolean isAlienType(String type){
        boolean result;

        if(type.equals("Alien")){
            result = true;
        } else {
            result = false;
        }

        return result;
    }

}
