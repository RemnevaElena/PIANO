package com.company;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("view/view.fxml"));
        primaryStage.setTitle("pianoApp");
        primaryStage.setScene(new Scene(root, 750, 450));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}