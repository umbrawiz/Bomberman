import javafx.animation.AnimationTimer;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import Entities.*;
import Sprites.*;
import javafx.util.Duration;
<<<<<<< HEAD
import Map.*;
=======
>>>>>>> ca59877ae64840d8654510e2c3f7801210a22a17


import java.io.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Boo extends Application {

    private GraphicsContext gc;
    private Canvas canvas;
    private Map map = new Map();
    Bomber bomber = new Bomber(1,1,Sprite.player_right);


    public static void main(String[] args) {
        Application.launch(Boo.class);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Booo");
        canvas = new Canvas(1200,800);
        gc = canvas.getGraphicsContext2D();

        Group root = new Group();
        root.getChildren().add(canvas);

        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.show();

        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long l) {
                scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
                    @Override
                    public void handle(KeyEvent event) {
//                        stillObjects.set(1, new Grass(1,0,Sprite.grass));
                        bomber.keyPressed(event,map);
                    }
                });
                render();
                update();
            }
        };
        timer.start();
        map.createMap("data/Map/map.txt");

    }



    public void update() {
<<<<<<< HEAD
        map.entities.forEach(Entity::update);
=======
        entities.forEach(Entity::update);
>>>>>>> ca59877ae64840d8654510e2c3f7801210a22a17
        bomber.bombs.forEach(g->g.update());
    }

    public void render() {
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
<<<<<<< HEAD
        map.stillObjects.forEach(g -> g.render(gc));
        map.entities.forEach(g -> g.render(gc));
        bomber.bombs.forEach(g->g.render(gc));
        bomber.render(gc);
=======
        stillObjects.forEach(g -> g.render(gc));
        entities.forEach(g -> g.render(gc));
        bomber.bombs.forEach(g->g.render(gc));
>>>>>>> ca59877ae64840d8654510e2c3f7801210a22a17

    }
}
