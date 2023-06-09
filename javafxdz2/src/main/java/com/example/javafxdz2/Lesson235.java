package com.example.javafxdz2;

import javafx.animation.*;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.FileInputStream;

public class Lesson235 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
//        Rectangle rectangle = new Rectangle(0, 0, 50, 50);
//        KeyValue xValue = new KeyValue(rectangle.xProperty(), 100);
//        KeyValue yValue = new KeyValue(rectangle.yProperty(), 100);
//
//        KeyFrame keyFrame = new KeyFrame(Duration.millis(1000), xValue, yValue);
//
//        Timeline timeline = new Timeline();
//        timeline.setCycleCount(Timeline.INDEFINITE);
//        timeline.setAutoReverse(true);
//        timeline.getKeyFrames().addAll(keyFrame);
//        timeline.play();

//        Image image = new Image(new FileInputStream("src/main/java/com/example/javafxdz2/smile.png"));
//        ImageView imageView = new ImageView(image);
//        imageView.setFitHeight(300);
//        imageView.setFitWidth(400);
//
//        FadeTransition fadeOut = new FadeTransition(Duration.millis(1000), imageView);
//        fadeOut.setFromValue(1.0);
//        fadeOut.setToValue(0.0);
//        fadeOut.setCycleCount(Timeline.INDEFINITE);
//        fadeOut.setAutoReverse(true);
//        fadeOut.play();

        Rectangle rectPatch = new Rectangle(0, 0, 40, 40);
        rectPatch.setFill(Color.ORANGE);
//
//        Path path = new Path();
//        path.getElements().add(new MoveTo(2, 20));
//        path.getElements().add(new CubicCurveTo(380, 0, 380, 120, 200, 120));
//        path.getElements().add(new CubicCurveTo(0, 120, 0, 240, 380, 240));
//
//        PathTransition pathTransition = new PathTransition();
//        pathTransition.setDuration(Duration.millis(4000));
//        pathTransition.setPath(path);
//        pathTransition.setNode(rectPatch);
//        pathTransition.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
//        pathTransition.setCycleCount(Timeline.INDEFINITE);
//        pathTransition.setAutoReverse(true);
//        pathTransition.play();

        FadeTransition fadeTransition = new FadeTransition(Duration.millis(2000), rectPatch);
        fadeTransition.setFromValue(1.0f);
        fadeTransition.setToValue(0.3f);
        fadeTransition.setCycleCount(2);
        fadeTransition.setAutoReverse(true);

        TranslateTransition translateTransition = new TranslateTransition(
                Duration.millis(2000), rectPatch
        );
        translateTransition.setFromX(50);
        translateTransition.setToX(350);
        translateTransition.setCycleCount(2);
        translateTransition.setAutoReverse(true);

        RotateTransition rotateTransition = new RotateTransition(
                Duration.millis(3000), rectPatch
        );
        rotateTransition.setByAngle(180f);
        rotateTransition.setCycleCount(4);
        rotateTransition.setAutoReverse(true);

        ScaleTransition scaleTransition = new ScaleTransition(
                Duration.millis(2000), rectPatch
        );
        scaleTransition.setToX(2f);
        scaleTransition.setToY(2f);
        scaleTransition.setCycleCount(2);
        scaleTransition.setAutoReverse(true);

//        ParallelTransition parallelTransition = new ParallelTransition();
//        parallelTransition.getChildren().addAll(
//                fadeTransition,
//                translateTransition,
//                rotateTransition,
//                scaleTransition
//        );
//        parallelTransition.setCycleCount(Timeline.INDEFINITE);
//        parallelTransition.setAutoReverse(true);
//        parallelTransition.play();

        SequentialTransition sequentialTransition = new SequentialTransition();
        sequentialTransition.getChildren().addAll(
                fadeTransition,
                translateTransition,
                rotateTransition,
                scaleTransition
        );
        sequentialTransition.setCycleCount(Timeline.INDEFINITE);
        sequentialTransition.setAutoReverse(true);
        sequentialTransition.play();

        Group root = new Group();
        root.getChildren().add(rectPatch);
        stage.setScene(new Scene(root, 400, 400));
        stage.show();
    }
}
