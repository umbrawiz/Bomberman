package Sprites;

import javafx.scene.image.Image;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Sprite{

    /*
	|--------------------------------------------------------------------------
	| Board sprites
	|--------------------------------------------------------------------------
	 */
    public static Image grass;
    public static Image wall;
    public static Image brick;
    public static Image portal;
    	/*
	|--------------------------------------------------------------------------
	| Bomber Sprites
	|--------------------------------------------------------------------------
	 */

    public static Image player_up;
    public static Image player_down;
    public static Image player_left;
    public static Image player_right;

    public static Image player_up_1;
    public static Image player_up_2;

    public static Image player_down_1;
    public static Image player_down_2;

    public static Image player_left_1;
    public static Image player_left_2;

    public static Image player_right_1;
    public static Image player_right_2;

    public static Image player_dead1;
    public static Image player_dead2;
    public static Image player_dead3;


    static {
        try {
            grass = new Image(new FileInputStream("data/sprites/grass.png"));
            wall = new Image(new FileInputStream("data/sprites/wall.png"));
            brick = new Image(new FileInputStream("data/sprites/brick.png"));
            portal = new Image(new FileInputStream("data/sprites/portal.png"));

            player_up = new Image(new FileInputStream("data/sprites/player_up.png"));
            player_down = new Image(new FileInputStream("data/sprites/player_down.png"));
            player_left = new Image(new FileInputStream("data/sprites/player_left.png"));
            player_right = new Image(new FileInputStream("data/sprites/player_right.png"));

            player_up_1 = new Image(new FileInputStream("data/sprites/player_left.png"));
            player_up_2 = new Image(new FileInputStream("data/sprites/player_right.png"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


}