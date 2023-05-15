package com.example.javafxdz2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Lesson234 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Image image = new Image(new FileInputStream("src/main/java/com/example/javafxdz2/smile.png"));
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(150);
        imageView.setFitWidth(200);

        PixelReader pixelReader = image.getPixelReader();
        for (int i = 0; i < image.getWidth(); i++) {
            for (int j = 0; j < image.getHeight(); j++) {
                Color color = pixelReader.getColor(i,j);
            }
        }

        WritableImage wImage = new WritableImage((int)image.getWidth(), (int)image.getHeight());
        PixelWriter pixelWriter = wImage.getPixelWriter();
        for (int i = 0; i < image.getHeight(); i++){
            for (int j = 0; j < image.getHeight(); j++) {
                pixelWriter.setColor(j, i, Color.ALICEBLUE);
            }
        }
        //ImageIO.write(SwingFXUtils.fromFXImage(wImage, null), "png", new FileOutputStream("test.png"));

        Group root = new Group();
        root.getChildren().add(new ImageView(wImage));
        stage.setScene(new Scene(root, 400, 300));
        stage.show();
    }
}
