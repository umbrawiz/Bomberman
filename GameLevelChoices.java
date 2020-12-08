package Entities;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.File;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.util.Date;
import java.util.Scanner;

public class GameLevelChoices {
    public void GameLevelChoices(Stage primaryStage) throws Exception {
        StackPane stackPane;
        VBox root = new VBox();

        // StackPane
        stackPane = new StackPane();


//        // Thêm Label vào StackPane
//        Label label = new Label("I'm a Label");
//        //label.setStyle("data/fixed_prites/bomb.png");
//        label.setPadding(new Insets(5,5,5,5));
//        stackPane.getChildren().add(label);
//        File file0 = new File("data/fixed_sprites/MenuPicR.png");
//        String localUrl1 = file0.toURI().toURL().toString();
//        Image image1 = new Image(localUrl1);
//        ImageView imageView1 = new ImageView(image1);
//        Label label = new Label("");
//
//        // Set Image
//        label.setGraphic(imageView1);
//
//        stackPane.getChildren().add(label);
//        root.getChildren().add(stackPane);

        // Button
        Button button0 = new Button("LEVEL 1");
        Button button1 = new Button("LEVEL 2");
        Button button2 = new Button("LEVEL 3");
        Button button3 = new Button("LEVEL 4");
        Button button4 = new Button("LEVEL 5");
        Button button5 = new Button("BACK");
        // Set Style
//        button1.setStyle("-fx-font: 22 arial; -fx-base: #b6e7c9;");
        button0.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                GameLevel gameLevel = new GameLevel();
                try {
                    gameLevel.GameLevel(primaryStage);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        button1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                GameLevel gameLevel = new GameLevel();
                try {
                    gameLevel.GameLevel(primaryStage);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        });
        button2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                GameLevel gameLevel = new GameLevel();
                try {
                    gameLevel.GameLevel(primaryStage);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        });
        button3.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                GameLevel gameLevel = new GameLevel();
                try {
                    gameLevel.GameLevel(primaryStage);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        });
        button4.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                GameLevel gameLevel = new GameLevel();
                try {
                    gameLevel.GameLevel(primaryStage);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        });

        button5.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                GameMenu gameMenux = new GameMenu();
                try {
                    gameMenux.GameMenu(primaryStage);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        root.getChildren().add(button0);
        root.getChildren().add(button1);
        root.getChildren().add(button2);
        root.getChildren().add(button3);
        root.getChildren().add(button4);
        root.getChildren().add(button5);

        root.setAlignment(Pos.TOP_CENTER);
        VBox.setMargin(stackPane, new Insets(0, 0, 0, 0));
        VBox.setMargin(button0, new Insets(25, 0, 0, 0));
        VBox.setMargin(button1, new Insets(25, 0, 0, 0));
        VBox.setMargin(button2, new Insets(25, 0, 0, 0));
        VBox.setMargin(button3, new Insets(25, 0, 0, 0));
        VBox.setMargin(button4, new Insets(25, 0, 0, 0));
        VBox.setMargin(button5, new Insets(25, 0, 0, 0));


        Scene scene = new Scene(root, 1200, 800);
        primaryStage.setTitle("Game Level Choices");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
