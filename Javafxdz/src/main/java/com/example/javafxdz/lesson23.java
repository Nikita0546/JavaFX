package com.example.javafxdz;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;

public class lesson23 extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        BorderPane pane = new BorderPane();
        TextArea textArea = new TextArea();
        ScrollPane scrollPane = new ScrollPane(textArea);
        Image image = new Image(new FileInputStream("src/main/java/com/example/javafxdz/guitar.jpg"));
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(200);
        imageView.setFitHeight(150);
        Label l1 = new Label("Java", imageView);
        l1.setContentDisplay(ContentDisplay.TOP);

        pane.setLeft(l1);
        pane.setCenter(textArea);

        Scene scene = new Scene(pane, 400, 400);
        stage.setScene(scene);
        stage.show();
    }
}
