package com.example.javafxdz2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Lesson230 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        HBox hBox = new HBox();
        hBox.getChildren().addAll(new Button("one"), new Button("two"));
        hBox.setSpacing(5);
        hBox.setPadding(new Insets(5));

        Group root = new Group();
        root.getChildren().addAll(hBox);
        stage.setScene((new Scene(root,400, 300)));
        stage.show();
    }
}
