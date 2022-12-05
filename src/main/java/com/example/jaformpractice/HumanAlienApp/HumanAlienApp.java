package com.example.jaformpractice.HumanAlienApp;

import com.example.jaformpractice.HelloApplication;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HumanAlienApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("human-alien-being.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Human Alien App");
        stage.setScene(scene);
        stage.show();
    }
}
