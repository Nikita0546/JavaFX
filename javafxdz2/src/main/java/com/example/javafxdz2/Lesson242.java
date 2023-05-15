package com.example.javafxdz2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Cylinder;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

public class Lesson242 extends Application {

    private  PerspectiveCamera camera;
    private final double cameraModifier = 50.0;
    private final double cameraQuantity = 10.0;
    private final double sceneWidth = 600;
    private final double SceneWidth = 600;
    private double mouseXold = 0;
    private double mouseYold = 0;
    private final double cameraYlimit = 15;
    private final double rotateModifier = 25;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        PerspectiveCamera camera = new PerspectiveCamera(true);
        camera.setNearClip(0.1);
        camera.setFarClip(50000.0);
        camera.setTranslateZ(-1000);

        Cylinder cylinder = new Cylinder(50, 100);
        PhongMaterial blueMaterial = new PhongMaterial();
        blueMaterial.setDiffuseColor(Color.DARKBLUE);
        blueMaterial.setSpecularColor(Color.BLUE);
        cylinder.setMaterial(blueMaterial);

        cylinder.setRotationAxis(Rotate.X_AXIS);
        cylinder.setRotate(45);

        Group group = new Group();
        group.getChildren().addAll(cylinder);
        Scene scene = new Scene(group, 400, 300);
        scene.setFill(Color.BLACK);
        scene.setCamera(camera);

//        scene.setOnMouseClicked(event -> {
//            Node picked = event.getPickResult().getIntersectedNode();
//            if (null != picked) {
//                double scalar = 2;
//                if (picked.getScaleX() > 1)
//                    scalar = 1;
//                picked.setScaleX(scalar);
//                picked.setScaleY(scalar);
//                picked.setScaleZ(scalar);
//            }
//        });

        scene.setOnKeyPressed(event -> {
            double change = cameraQuantity;
            if (event.isShiftDown()) {
                change = cameraModifier;
            }
            KeyCode keyCode = event.getCode();
            if (keyCode == KeyCode.W){
                camera.setTranslateZ(camera.getTranslateZ() + change);
            }
            if (keyCode == KeyCode.S) {
                camera.setTranslateZ(camera.getTranslateZ() - change);
            }
            if (keyCode == KeyCode.A){
                camera.setTranslateX(camera.getTranslateX() - change);
            }
            if (keyCode == KeyCode.D){
                camera.setTranslateX(camera.getTranslateX() + change);
            }
        });

        Rotate xRotate = new Rotate(0,0,0,0, Rotate.X_AXIS);
        Rotate yRotate = new Rotate(0,0,0,0, Rotate.Y_AXIS);
        camera.getTransforms().addAll(xRotate,yRotate);
        scene.addEventHandler(MouseEvent.ANY, event ->{
            if (event.getEventType() == MouseEvent.MOUSE_PRESSED ||
                    event.getEventType() == MouseEvent.MOUSE_DRAGGED) {
                double mouseXnew = event.getSceneX();
                double mouseYnew = event.getSceneY();
                if (event.getEventType() == MouseEvent.MOUSE_DRAGGED) {
                    double pitchRotate = xRotate.getAngle() + (mouseYnew - mouseYold) / rotateModifier;
                    pitchRotate = pitchRotate > cameraYlimit ? cameraYlimit : pitchRotate;
                    pitchRotate = pitchRotate < -cameraYlimit ? -cameraYlimit : pitchRotate;
                    xRotate.setAngle(pitchRotate);
                    double yawRotate = yRotate.getAngle()-(mouseXnew - mouseXold) / rotateModifier;
                    yRotate.setAngle(yawRotate);
                }
            }
        });


        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
