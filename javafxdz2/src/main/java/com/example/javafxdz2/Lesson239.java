package com.example.javafxdz2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
//import javafx.scene.media.Media;

public class Lesson239 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Media media = new Media("");

        Group group = new Group();
        primaryStage.setScene(new Scene(group, 400, 300));
        primaryStage.show();
    }
}
