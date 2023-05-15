package com.example.javafxdz2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Line line = new Line(0, 0, 100, 100);
        line.setStroke(Color.GREEN);
        line.setStrokeWidth(10);

        Group root = new Group();
        Scene scene = new Scene(root, 400, 400);
        root.getChildren().add(line);

        stage.setTitle("Hello world!");
        stage.setScene(scene);
        stage.show();
    }
}