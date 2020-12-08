import Entities.*;
import Map.Map;
import Sprites.Sprite;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Boo extends Application {



    Label time = new Label();
    Font font = Font.loadFont("file:data/Font/text.TTF", 24);
    private GraphicsContext gc;
    private Canvas canvas;
    private final Map map = new Map();
    public static MediaPlayer mediaPlayer;

    public List<PU> powerUps = new ArrayList<>();
    public static void main(String[] args) {
        Application.launch(Boo.class);
    }

    @Override
    public void start(Stage primaryStage) {
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

        Media media = new Media(new File("data/Music/main.mp3").toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);
        mediaPlayer.setOnEndOfMedia(new Runnable() {
            public void run() {
                mediaPlayer.seek(Duration.ZERO);
            }
        });
        mediaPlayer.play();


        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Victory");
        alert.setHeaderText("you won");
        alert.setContentText("now quit");
        alert.showAndWait();


        primaryStage.setScene(scene);
        primaryStage.show();
        map.grasses.forEach(g->g.render(gc));
//        Balloom balloom1 = new Balloom(22, 2, Sprite.balloom_left1, map, 3);
        Balloom balloom2 = new Balloom(1, 2, Sprite.balloom_right1, map, 4);
        BombsPU pu = new BombsPU(1, 6, Sprite.powerup_bombs, map.bomber);
        powerUps.add(pu);
//        bl.add(balloom1);
        map.enemies.add(balloom2);

        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long l) {
                scene.setOnKeyPressed(event -> map.bomber.keyPressed(event, map));
                render();
                update();

            }
        };
        timer.start();
        map.createMap("data/Map/map.txt");

    }


    public void update() {
        map.entities.forEach(Entity::update);
        map.bomber.bombs.forEach(g -> g.update1(gc,map));
        map.bomber.update();
        map.update();
        time.setText("TIME " + map.getTime());
        map.enemies.forEach(Entity::update);
        map.enemies.forEach(g->g.alive(map));
        map.bomber.alive(map);
        map.enemies.removeIf(i -> !i.isAlive);
        powerUps.forEach(PU::update);
        powerUps.removeIf(i -> i.obtain());

    }

    public void render() {
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        map.entities.forEach(g -> g.render(gc));
        map.stillObjects.forEach(g -> g.render(gc));
        map.bomber.bombs.forEach(g -> g.render(gc));
        map.bomber.render(gc);
        map.enemies.forEach(g -> g.render(gc));
        powerUps.forEach(g -> g.render(gc));
    }
}
