package com.example.javafxdz;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.layout.*;

public class setOnMouseDraggedra extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Pane pane = new Pane();
        Text text = new Text("list of beautifuul");
        text.setX(200);
        text.setY(200);
         pane.getChildren().add(text);
         text.setOnMouseDragged(new EventHandler<MouseEvent>() {
             @Override
             public void handle(MouseEvent mouseEvent) {
                 text.setX(mouseEvent.getX());
                 text.setY(mouseEvent.getY());
             }
         });

        Scene scene = new Scene(pane, 400, 400);
        stage.setScene(scene);
        stage.show();
    }
}
