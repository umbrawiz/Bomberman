import Entities.Balloom;
import Entities.Bomber;
import Entities.Entity;
import Map.Map;
import Sprites.Sprite;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class Boo extends Application {

    Bomber bomber = new Bomber(1, 2, Sprite.player_right);

    Label time = new Label();
    Font font = Font.loadFont("file:data/Font/text.TTF", 24);
    private GraphicsContext gc;
    private Canvas canvas;
    private Map map = new Map();
    public List<Entity> bl = new ArrayList<>();

    public static void main(String[] args) { Application.launch(Boo.class); }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Booo");
        canvas = new Canvas(1200, 800);
        gc = canvas.getGraphicsContext2D();

        Group root = new Group();
        root.getChildren().add(canvas);
        root.getChildren().add(time);
        time.setPrefHeight(50);
        time.setTextFill(Color.WHITE);
        time.setFont(font);

        Scene scene = new Scene(root);


        primaryStage.setScene(scene);
        primaryStage.show();

        Balloom balloom1 = new Balloom(22,2,Sprite.balloom_left1,3);
        Balloom balloom2 = new Balloom(1,13,Sprite.balloom_right1,4);

        bl.add(balloom1);
        bl.add(balloom2);

        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long l) {
                scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
                    @Override
                    public void handle(KeyEvent event) {
//                        stillObjects.set(1, new Grass(1,0,Sprite.grass));
                        bomber.keyPressed(event, map);
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
        map.entities.forEach(Entity::update);
        bomber.bombs.forEach(g -> g.update1(gc));
        bomber.update();
        map.update();
        time.setText("TIME " + map.getTime());
        bl.forEach(g->g.update());

    }

    public void render() {
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        map.stillObjects.forEach(g -> g.render(gc));
        map.entities.forEach(g -> g.render(gc));
        bomber.bombs.forEach(g -> g.render(gc));
        bomber.render(gc);
        bl.forEach(g->g.render(gc));

    }
}
