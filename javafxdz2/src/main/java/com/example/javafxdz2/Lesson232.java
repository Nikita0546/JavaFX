package com.example.javafxdz2;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Lesson232 extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        NumberTextField numberTextField = new NumberTextField();
        //CustomControl customControl = new CustomControl();


        Group root = new Group();
        root.getChildren().addAll(numberTextField);
        stage.setScene(new Scene(root, 500, 500));
        stage.show();
    }
}
