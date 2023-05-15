package com.example.javafxdz;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CheckBoxe extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Pane pane = new Pane();
        CheckBox checkBox = new CheckBox("Yes");
        CheckBox checkBox1= new CheckBox("No");
        Text text = new Text();
        pane.getChildren().addAll(checkBox, checkBox1, text);

        checkBox.setLayoutX(20);
        checkBox.setLayoutY(20);
        checkBox1.setLayoutX(20);
        checkBox1.setLayoutY(40);
        text.setX(20);
        text.setY(80);

        EventHandler<ActionEvent> handler = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (checkBox.isSelected() && !checkBox1.isSelected())
                    text.setText("Yes is selected");
                else if (checkBox.isSelected() && checkBox1.isSelected())
                    text.setText("Yes and No are selected");
                else if (!checkBox.isSelected() && checkBox1.isSelected())
                    text.setText("No is selected");
                else text.setText("Nothing is selected");
            }
        };

        checkBox.setOnAction(handler);
        checkBox1.setOnAction(handler);
        Scene scene = new Scene(pane,400,400);
        stage.setScene(scene);
        stage.show();
    }
}
