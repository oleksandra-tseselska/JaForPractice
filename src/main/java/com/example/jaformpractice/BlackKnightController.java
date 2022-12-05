package com.example.jaformpractice;

import com.example.jaformpractice.exceptions.DeadKnightException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BlackKnightController {

    private static BlackKnight activeBlackKnight;
    @FXML
    private TextField knightName;

    @FXML
    private Text knightNameInfo;

    @FXML
    private Text knightProps;

    @FXML
    void strikeKnight(ActionEvent event) throws DeadKnightException {

            if(activeBlackKnight.isAlive()) {
                activeBlackKnight.strike();
                knightProps.setText(activeBlackKnight.toString());
            } else {
                Alert knightDeadAlert = new Alert(Alert.AlertType.ERROR);
                knightDeadAlert.setContentText("Please stop, "+activeBlackKnight.getName()+ " is dead!");
                knightDeadAlert.show();
//                throw new DeadKnightException("Knight is dead"); this is better
//                thisThrowsException(); this is worse
            }
}

    public static void thisThrowsException(){
                DeadKnightException exception = new DeadKnightException("Knight is dead");
                throw exception;
        }



    @FXML
    void createKnight(ActionEvent event) throws IOException{
        if(knightName.getText().equals("")){
            BlackKnight.createKnight();
        } else {
            BlackKnight.createKnight(knightName.getText());
        }

        activeBlackKnight = BlackKnight.getLatestKnight();

        ((Node)event.getSource()).getScene().getWindow().hide();
        showGameWindow();
    }

    private void showGameWindow() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(BlackKnightApplication.class.getResource("black-knight-player.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();

        stage.setTitle("Black Knight Game");
        stage.setScene(scene);
        stage.show();
    }

//    @FXML
    public void startGame() {
        knightNameInfo.setText("Currently playing with knight "+activeBlackKnight.getName());
        knightProps.setText(activeBlackKnight.toString());
    }

//    @FXML
    public void endGame(ActionEvent event) {
        ((Node)event.getSource()).getScene().getWindow().hide();
    }
}