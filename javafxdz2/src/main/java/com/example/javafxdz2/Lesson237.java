package com.example.javafxdz2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Lesson237 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        //Application.setUserAgentStylesheet(getClass().getResource("mycss.css").toExternalForm());

        Button button = new Button("test");
        //button.setId("my-button");
        //button.setStyle("");
        //button.getStyleClass().add("mystyle");

        Group root = new Group();
        Scene scene = new Scene(root, 400, 300);
        scene.getStylesheets().add(getClass().getResource("com/example/javafxdz2/mycss.css").toExternalForm());
        root.getChildren().add(button);
        stage.setScene(scene);
        stage.show();
    }
}