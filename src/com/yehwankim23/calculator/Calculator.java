package com.yehwankim23.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Calculator extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("view/layout.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("view/style.css").toExternalForm());

        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.setTitle("Calculator");
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("view/icon.png")));

        primaryStage.show();
    }
}