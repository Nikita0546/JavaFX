package com.example.javafxdz2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Lesson231 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        TextField button = new TextField();

        Group root = new Group();
        root.getChildren().add(button);
        stage.setScene((new Scene(root,400, 300)));
        stage.show();
    }
}
