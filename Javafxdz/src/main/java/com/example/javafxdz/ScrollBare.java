package com.example.javafxdz;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ScrollBare extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        BorderPane borderPane = new BorderPane();
        ScrollBar scrollBareV = new ScrollBar();
        scrollBareV.setOrientation(Orientation.VERTICAL);
        ScrollBar scrollBareH = new ScrollBar();
        Pane pane = new Pane();
        Text text = new Text("Olympic Game");
        text.setX(0);
        text.setY(0);
        pane.getChildren().add(text);

        borderPane.setCenter(pane);
        borderPane.setBottom(scrollBareH);
        borderPane.setRight(scrollBareV);

        text.xProperty().bind(scrollBareH.valueProperty().multiply(2));
        text.yProperty().bind(scrollBareV.valueProperty().multiply(2));

        Scene scene = new Scene(borderPane, 200, 200);
        stage.setScene(scene);
        stage.show();
    }
}
