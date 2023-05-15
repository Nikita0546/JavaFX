package com.example.javafxdz2;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.stage.Stage;

public class Lesson241 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        ObservableList<PieChart.Data> data = FXCollections.observableArrayList(
                new PieChart.Data("GrapeFruit", 13),
                new PieChart.Data("Oranges", 25),
                new PieChart.Data("Plums", 10),
                new PieChart.Data("Pears", 22),
                new PieChart.Data("Apples", 30));
        PieChart chart = new PieChart(data);
        chart.setTitle("products");

        Group root = new Group();
        root.getChildren().addAll(chart);
        primaryStage.setScene(new Scene(root, 500, 400));
        primaryStage.show();
    }
}
