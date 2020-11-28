import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import Entities.*;
import Sprites.*;


import java.io.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Boo extends Application {

    public static final int WIDTH = 24;
    public static final int HEIGHT = 16;
    private GraphicsContext gc;
    private Canvas canvas;
    private java.util.List<Entity> entities = new ArrayList<>();
    private List<Entity> stillObjects = new ArrayList<>();
    private int[][] maps = new int[HEIGHT][WIDTH];
    Entity bomber = new Bomber(1,1,Sprite.player_right);

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
                render();
                update();
            }
        };
        timer.start();

        createMap();
//
//        for(int i = 0 ; i < maps.length ;i++){
//            for(int j = 0 ; j < maps[i].length ;j++){
//                System.out.print(maps[i][j]);
//            }
//            System.out.println();
//        }


    }

    public void readMapFromFile() throws IOException{
        File map = new File("data/Map/map.txt");
        FileReader fr=new FileReader(map);
        BufferedReader br=new BufferedReader(fr);
        Scanner sc = new Scanner(br);
        while (sc.hasNextLine()){
            for(int i = 0 ; i < HEIGHT ;i++){
                String str = sc.nextLine();
                for(int j = 0 ; j < WIDTH;j++){
                    maps[i][j] = Character.getNumericValue(str.charAt(j));
                }
            }

        }

    }

    public void createMap() throws FileNotFoundException {
        try {
            readMapFromFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[i].length; j++) {
                Entity object = null;
                if(maps[i][j] == 0){
                    object = new Wall(j, i,Sprite.wall);
                }
                else if(maps[i][j] == 1){
                    object = new Grass(j, i,Sprite.grass);
                }
                else if(maps[i][j] == 2){
                    object = new Brick(j, i,Sprite.brick);
                }

                stillObjects.add(object);
            }
        }


    }

    public void update() {
        entities.forEach(Entity::update);
    }

    public void render() {
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        stillObjects.forEach(g -> g.render(gc));
        entities.forEach(g -> g.render(gc));
        bomber.render(gc);
    }
}
