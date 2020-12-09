package Entities;


import Map.Map;
import Sprites.Sprite;
import javafx.animation.AnimationTimer;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.File;
import java.net.MalformedURLException;

public class GameLevel {
    Label time = new Label();
    Label score = new Label();
    Label life = new Label();
    Font font = Font.loadFont("file:data/Font/text.TTF", 24);
    private GraphicsContext gc;
    private Canvas canvas;
    private final Map map = new Map();
    public static MediaPlayer mediaPlayer;
    private boolean done = false;
    int check = 1;
    public void GameLevel(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Booo");
        canvas = new Canvas(1200, 800);
        gc = canvas.getGraphicsContext2D();

        Group root = new Group();
        root.getChildren().add(canvas);
        root.getChildren().add(time);
        root.getChildren().add(score);
        root.getChildren().add(life);

        time.setPrefHeight(50);
        time.setTextFill(Color.WHITE);
        time.setFont(font);

        score.setPrefHeight(50);
        score.setTranslateX(500);

        score.setTextFill(Color.WHITE);
        score.setFont(font);


        life.setPrefHeight(50);
        life.setTextFill(Color.WHITE);
        life.setFont(font);
        life.setTranslateX(1000);



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


        primaryStage.setScene(scene);
        primaryStage.show();
        map.grasses.forEach(g -> g.render(gc));
        Balloom balloom1 = new Balloom(21, 2, Sprite.balloom_left1, map, 3);
        Balloom balloom2 = new Balloom(19, 2, Sprite.balloom_right1, map, 4);
        Balloom balloom3 = new Balloom(1, 14, Sprite.balloom_right1, map, 4);
        Balloom balloom4 = new Balloom(15, 11, Sprite.balloom_left1, map, 4);
//        BombsPU pu = new BombsPU(1, 6, Sprite.powerup_bombs, map.bomber);
//        map.powerUps.add(pu);
        map.enemies.add(balloom1);
        map.enemies.add(balloom2);
        map.enemies.add(balloom3);
        map.enemies.add(balloom4);
        Oneal oneal1 = new Oneal(8, 8, Sprite.oneal_right1, map, 4);
        Oneal oneal2 = new Oneal(9, 11, Sprite.oneal_right1, map, 4);
        map.enemies.add(oneal1);
        map.enemies.add(oneal2);
        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long l) {
                    scene.setOnKeyPressed(event -> map.bomber.keyPressed(event, map));
                    render();
                    update();
                    if (map.bomber.dTime == 0 && !done ) {
                        GameOver(primaryStage);
                    }


            }

        };
//        if (map.bomber.dTime == 0 ) {
//
//        }
        timer.start();
        map.createMap("data/Map/map.txt");

    }


    public void GameOver(Stage primaryStage) {
        StackPane stackPane;
        VBox root = new VBox();

        // StackPane
        stackPane = new StackPane();


//        // Thêm Label vào StackPane
//        Label label = new Label("I'm a Label");
//        //label.setStyle("data/fixed_prites/bomb.png");
//        label.setPadding(new Insets(5,5,5,5));
//        stackPane.getChildren().add(label);
        File file0 = new File("data/fixed_sprites/GameOverRx.png");
        String localUrl1 = null;
        try {
            localUrl1 = file0.toURI().toURL().toString();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        Image image1 = new Image(localUrl1);
        ImageView imageView1 = new ImageView(image1);
        Label label = new Label("");

        Label final_score = new Label();
        final_score.setText(map.getScore());
        final_score.setTranslateX(500);
        final_score.setTranslateY(500);


        // Set Image
        label.setGraphic(imageView1);

        stackPane.getChildren().add(label);
        stackPane.getChildren().add(final_score);
        root.getChildren().add(stackPane);

        // Button
        Button button0 = new Button("GAME MENU");
        //Button button1 = new Button("HIGH SCORES ");
        Button button2 = new Button("    EXIT    ");
        // Set Style
//        button1.setStyle("-fx-font: 22 arial; -fx-base: #b6e7c9;");
        button0.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                GameMenu gameMenu = new GameMenu();
                try {
                    gameMenu.GameMenu(primaryStage);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
//        button1.setOnAction(new EventHandler<ActionEvent>() {
//
//            @Override
//            public void handle(ActionEvent event) {
//                System.out.println("High Score");
//            }
//
//        });
        button2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                primaryStage.close();
            }
        });

        root.getChildren().add(button0);
//        root.getChildren().add(button1);
        root.getChildren().add(button2);
        root.setAlignment(Pos.TOP_CENTER);
        VBox.setMargin(stackPane, new Insets(0, 0, 0, 0));
        VBox.setMargin(button0, new Insets(25, 0, 0, 0));
//        VBox.setMargin(button1, new Insets(25, 0, 0, 0));
        VBox.setMargin(button2, new Insets(25, 0, 0, 0));
        Scene scene = new Scene(root, 1200, 800);
        primaryStage.setTitle("Game Menu");
        primaryStage.setScene(scene);
        primaryStage.show();
        done = true;
    }

    public void update( ) {
        map.entities.forEach(Entity::update);
        map.bomber.bombs.forEach(g -> g.update1(gc, map));
        map.bomber.update();
        map.update();
        time.setText("TIME " + map.getTime());
        score.setText("SCORE " + map.Score);
        life.setText("LIFE " + map.bomber.life);
        map.enemies.forEach(Entity::update);
        map.enemies.forEach(g -> g.alive(map));
        map.bomber.alive(map);
        map.enemies.removeIf(i -> !i.isAlive);
        map.powerUps.forEach(PU::update);
        map.powerUps.removeIf(i -> i.obtain());

    }

    public void render() {
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        map.entities.forEach(g -> g.render(gc));
        map.stillObjects.forEach(g -> g.render(gc));
        map.bomber.bombs.forEach(g -> g.render(gc));
        map.bomber.render(gc);
        map.enemies.forEach(g -> g.render(gc));
        map.powerUps.forEach(g -> g.render(gc));
    }
}
