package com.example.javafxdz;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.FileNotFoundException;


public class Colorz extends Application {
    @Override
    public void start(Stage stage) throws FileNotFoundException {
        Pane pane = new Pane();
        Text text = new Text("ABCDEFGH");
        Color color = new Color(1.0, 0.5, 01, 1.0);
        text.setX(200);
        text.setY(200);
        text.setFill(color);
        pane.getChildren().add(text);

        Scene scene = new Scene(pane, 400, 400);
        stage.setScene(scene);
        stage.show();
    }
}
