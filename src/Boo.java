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
import java.util.ArrayList;
import java.util.List;

public class Boo extends Application {


    Label time = new Label();
    Font font = Font.loadFont("file:data/Font/text.TTF", 24);
    private GraphicsContext gc;
    private Canvas canvas;
    private final Map map = new Map();
    public static MediaPlayer mediaPlayer;


    public static void main(String[] args) {
        Application.launch(Boo.class);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        GameMenu gameMenu = new GameMenu();
        gameMenu.GameMenu(primaryStage);
    }
}
