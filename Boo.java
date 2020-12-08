import Entities.GameMenu;

import javafx.animation.AnimationTimer;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import Entities.*;
import Sprites.*;
import javafx.util.Duration;
import Map.*;

import java.io.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Boo extends Application {

    private GraphicsContext gc;
    private Canvas canvas;
    private Map map = new Map();
    Bomber bomber = new Bomber(1, 1, Sprite.player_right);

    public static void main(String[] args) {
        Application.launch(Boo.class);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        GameMenu a = new GameMenu();
        a.GameMenu(primaryStage);

//        primaryStage.setTitle("Booo");
//        canvas = new Canvas(1200, 800);
//        gc = canvas.getGraphicsContext2D();
//
//        Group root = new Group();
//        root.getChildren().add(canvas);
//
//        Scene scene = new Scene(root);
//
//        primaryStage.setScene(scene);
//        primaryStage.show();
//
//        AnimationTimer timer = new AnimationTimer() {
//            @Override
//            public void handle(long l) {
//                scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
//                    @Override
//                    public void handle(KeyEvent event) {
////                        stillObjects.set(1, new Grass(1,0,Sprite.grass));
//                        bomber.keyPressed(event, map);
//                    }
//                });
//                render();
//                update();
//            }
//        };
//        timer.start();
//        map.createMap("data/Map/map.txt");
    }
//    public void update() {
//        map.entities.forEach(Entity::update);
//        bomber.bombs.forEach(g -> g.update());
//    }
//
//    public void render() {
//        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
//        map.stillObjects.forEach(g -> g.render(gc));
//        map.entities.forEach(g -> g.render(gc));
//        bomber.bombs.forEach(g -> g.render(gc));
//        bomber.render(gc);
//
//    }
}
