package com.example.javafxdz;

import javafx.application.Application;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Sliderara extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        BorderPane borderPane = new BorderPane();
        Slider sliderH = new Slider();
        Slider sliderV = new Slider();
        sliderH.setMax(100);
        sliderV.setMax(100);
        sliderH.setValue(0);
        sliderV.setValue(0);
        sliderH.setShowTickLabels(true);
        sliderV.setShowTickLabels(true);
        sliderH.setShowTickMarks(true);
        sliderV.setShowTickMarks(true);
        sliderV.setOrientation(Orientation.VERTICAL);

        Pane pane = new Pane();
        Text text = new Text("Olympic Game");
        text.setX(0);
        text.setY(0);
        pane.getChildren().add(text);

       // text.xProperty().bind(sliderH.valueProperty().multiply(4));
       // text.yProperty().bind(sliderV.valueProperty().multiply(4));

        sliderH.valueProperty().addListener(new InvalidationListener() {
            @Override
            public void invalidated(Observable observable) {
                text.setX(sliderH.getValue() * pane.getWidth() / 100);
            }
        });

        sliderV.valueProperty().addListener(new InvalidationListener() {
            @Override
            public void invalidated(Observable observable) {
                text.setY((sliderV.getMax() - sliderV.getValue()) * pane.getHeight() / 100);
            }
        });

        borderPane.setCenter(pane);
        borderPane.setBottom(sliderH);
        borderPane.setRight(sliderV);

        Scene scene = new Scene(borderPane, 400, 400);
        stage.setScene(scene);
        stage.show();
    }
}
