package com.example.javafxdz;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.animation.FadeTransition;

import java.io.FileInputStream;

public class FadeTransitionra extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Pane pane = new Pane();
        Image image = new Image(new FileInputStream("src/main/java/com/example/javafxdz/guitar.jpg"));
        ImageView imageView = new ImageView(image);
        pane.getChildren().add(imageView);

        FadeTransition ft = new FadeTransition(Duration.millis(3000), imageView);
        ft.setFromValue(1.0);
        ft.setToValue(0);
        ft.setCycleCount(5);
        ft.setAutoReverse(true);
        ft.play();

        Scene scene = new Scene(pane, 400, 600);
        stage.setScene(scene);
        stage.show();
    }
}
