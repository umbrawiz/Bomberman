<<<<<<< HEAD
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
    public static Image player_up_1;
    public static Image player_up_2;

    public static Image player_down;
    public static Image player_down_1;
    public static Image player_down_2;

    public static Image player_left;
    public static Image player_left_1;
    public static Image player_left_2;

    public static Image player_right;
    public static Image player_right_1;
    public static Image player_right_2;

    public static Image player_dead1;
    public static Image player_dead2;
    public static Image player_dead3;

    /*
	|--------------------------------------------------------------------------
	| enemies sprites
	|--------------------------------------------------------------------------
	 */

    public static Image balloom_dead;

    public static Image balloom_left1;
    public static Image balloom_left2;
    public static Image balloom_left3;

    public static Image balloom_right1;
    public static Image balloom_right2;
    public static Image balloom_right3;

    public static Image oneal_dead;

    public static Image oneal_left1;
    public static Image oneal_left2;
    public static Image oneal_left3;

    public static Image oneal_right1;
    public static Image oneal_right2;
    public static Image oneal_right3;

    public static Image minvo_dead;

    public static Image minvo_left1;
    public static Image minvo_left2;
    public static Image minvo_left3;

    public static Image minvo_right1;
    public static Image minvo_right2;
    public static Image minvo_right3;

    public static Image kondoria_dead;

    public static Image kondoria_left1;
    public static Image kondoria_left2;
    public static Image kondoria_left3;

    public static Image kondoria_right1;
    public static Image kondoria_right2;
    public static Image kondoria_right3;

    public static Image doll_dead;

    public static Image doll_left1;
    public static Image doll_left2;
    public static Image doll_left3;

    public static Image doll_right1;
    public static Image doll_right2;
    public static Image doll_right3;

    public static Image mob_dead1;
    public static Image mob_dead2;
    public static Image mob_dead3;

    /*
	|--------------------------------------------------------------------------
	| powerup sprites
	|--------------------------------------------------------------------------
	 */

    public static Image powerup_bombpass;
    public static Image powerup_bombs;
    public static Image powerup_detonator;
    public static Image powerup_flamepass;
    public static Image powerup_flames;
    public static Image powerup_speed;
    public static Image powerup_wallpass;

    /*
	|--------------------------------------------------------------------------
	| bomb sprites
	|--------------------------------------------------------------------------
	 */

    public static Image bomb;
    public static Image bomb1;
    public static Image bomb2;

    public static Image bomb_exploded;
    public static Image bomb_exploded1;
    public static Image bomb_exploded2;

    public static Image explosion_horizontal;
    public static Image explosion_horizontal1;
    public static Image explosion_horizontal2;

    public static Image explosion_vertical;
    public static Image explosion_vertical1;
    public static Image explosion_vertical2;

    public static Image explosion_horizontal_left_last;
    public static Image explosion_horizontal_left_last1;
    public static Image explosion_horizontal_left_last2;

    public static Image explosion_horizontal_right_last;
    public static Image explosion_horizontal_right_last1;
    public static Image explosion_horizontal_right_last2;

    public static Image explosion_vertical_top_last;
    public static Image explosion_vertical_top_last1;
    public static Image explosion_vertical_top_last2;

    public static Image explosion_vertical_down_last;
    public static Image explosion_vertical_down_last1;
    public static Image explosion_vertical_down_last2;

    public static Image brick_exploded;
    public static Image brick_exploded1;
    public static Image brick_exploded2;
    static {
        try {
            grass = new Image(new FileInputStream("data/sprites/grass.png"));
            wall = new Image(new FileInputStream("data/sprites/wall.png"));
            brick = new Image(new FileInputStream("data/sprites/brick.png"));
            portal = new Image(new FileInputStream("data/sprites/portal.png"));

            player_up = new Image(new FileInputStream("data/sprites/player_up.png"));
            player_up_1 = new Image(new FileInputStream("data/sprites/player_up_1.png"));
            player_up_2 = new Image(new FileInputStream("data/sprites/player_up_2.png"));

            player_down = new Image(new FileInputStream("data/sprites/player_down.png"));
            player_down_1 = new Image(new FileInputStream("data/sprites/player_down_1.png"));
            player_down_2 = new Image(new FileInputStream("data/sprites/player_down_2.png"));

            player_left = new Image(new FileInputStream("data/sprites/player_left.png"));
            player_left_1 = new Image(new FileInputStream("data/sprites/player_left_1.png"));
            player_left_2 = new Image(new FileInputStream("data/sprites/player_left_2.png"));

            player_right = new Image(new FileInputStream("data/sprites/player_right.png"));
            player_right_1 = new Image(new FileInputStream("data/sprites/player_right_1.png"));
            player_right_2 = new Image(new FileInputStream("data/sprites/player_right_2.png"));

            player_dead1 = new Image(new FileInputStream("data/sprites/player_dead1.png"));
            player_dead2 = new Image(new FileInputStream("data/sprites/player_dead2.png"));
            player_dead3 = new Image(new FileInputStream("data/sprites/player_dead3.png"));

            balloom_dead = new Image(new FileInputStream("data/sprites/balloom_dead.png"));

            balloom_left1 = new Image(new FileInputStream("data/sprites/balloom_left1.png"));
            balloom_left2 = new Image(new FileInputStream("data/sprites/balloom_left1.png"));
            balloom_left3 = new Image(new FileInputStream("data/sprites/balloom_left1.png"));

            balloom_right1 = new Image(new FileInputStream("data/sprites/balloom_right1.png"));
            balloom_right2 = new Image(new FileInputStream("data/sprites/balloom_right1.png"));
            balloom_right3 = new Image(new FileInputStream("data/sprites/balloom_right1.png"));

            doll_dead = new Image(new FileInputStream("data/sprites/doll_dead.png"));

            doll_left1 = new Image(new FileInputStream("data/sprites/doll_left1.png"));
            doll_left2 = new Image(new FileInputStream("data/sprites/doll_left1.png"));
            doll_left3 = new Image(new FileInputStream("data/sprites/doll_left1.png"));

            doll_right1 = new Image(new FileInputStream("data/sprites/doll_right1.png"));
            doll_right2 = new Image(new FileInputStream("data/sprites/doll_right1.png"));
            doll_right3 = new Image(new FileInputStream("data/sprites/doll_right1.png"));

            kondoria_dead = new Image(new FileInputStream("data/sprites/kondoria_dead.png"));

            kondoria_left1 = new Image(new FileInputStream("data/sprites/kondoria_left1.png"));
            kondoria_left2 = new Image(new FileInputStream("data/sprites/kondoria_left1.png"));
            kondoria_left3 = new Image(new FileInputStream("data/sprites/kondoria_left1.png"));

            kondoria_right1 = new Image(new FileInputStream("data/sprites/kondoria_right1.png"));
            kondoria_right2 = new Image(new FileInputStream("data/sprites/kondoria_right1.png"));
            kondoria_right3 = new Image(new FileInputStream("data/sprites/kondoria_right1.png"));

            minvo_dead = new Image(new FileInputStream("data/sprites/minvo_dead.png"));

            minvo_left1 = new Image(new FileInputStream("data/sprites/minvo_left1.png"));
            minvo_left2 = new Image(new FileInputStream("data/sprites/minvo_left1.png"));
            minvo_left3 = new Image(new FileInputStream("data/sprites/minvo_left1.png"));

            minvo_right1 = new Image(new FileInputStream("data/sprites/minvo_right1.png"));
            minvo_right2 = new Image(new FileInputStream("data/sprites/minvo_right1.png"));
            minvo_right3 = new Image(new FileInputStream("data/sprites/minvo_right1.png"));

            oneal_dead = new Image(new FileInputStream("data/sprites/oneal_dead.png"));

            oneal_left1 = new Image(new FileInputStream("data/sprites/oneal_left1.png"));
            oneal_left2 = new Image(new FileInputStream("data/sprites/oneal_left1.png"));
            oneal_left3 = new Image(new FileInputStream("data/sprites/oneal_left1.png"));

            oneal_right1 = new Image(new FileInputStream("data/sprites/oneal_right1.png"));
            oneal_right2 = new Image(new FileInputStream("data/sprites/oneal_right1.png"));
            oneal_right3 = new Image(new FileInputStream("data/sprites/oneal_right1.png"));

            mob_dead1 = new Image(new FileInputStream("data/sprites/mob_dead1.png"));
            mob_dead2 = new Image(new FileInputStream("data/sprites/mob_dead2.png"));
            mob_dead3 = new Image(new FileInputStream("data/sprites/mob_dead3.png"));

            powerup_bombpass = new Image(new FileInputStream("data/sprites/powerup_bombpass.png"));
            powerup_bombs= new Image(new FileInputStream("data/sprites/powerup_bombs.png"));
            powerup_detonator= new Image(new FileInputStream("data/sprites/powerup_detonator.png"));
            powerup_flamepass= new Image(new FileInputStream("data/sprites/powerup_flamepass.png"));
            powerup_flames= new Image(new FileInputStream("data/sprites/powerup_flames.png"));
            powerup_speed= new Image(new FileInputStream("data/sprites/powerup_speed.png"));
            powerup_wallpass= new Image(new FileInputStream("data/sprites/powerup_wallpass.png"));

            bomb = new Image(new FileInputStream("data/sprites/bomb.png"));
            bomb1= new Image(new FileInputStream("data/sprites/bomb_1.png"));
            bomb2= new Image(new FileInputStream("data/sprites/bomb_2.png"));

            bomb_exploded= new Image(new FileInputStream("data/sprites/bomb_exploded.png"));
            bomb_exploded1= new Image(new FileInputStream("data/sprites/bomb_exploded1.png"));
            bomb_exploded2= new Image(new FileInputStream("data/sprites/bomb_exploded2.png"));

            brick_exploded= new Image(new FileInputStream("data/sprites/brick_exploded.png"));
            brick_exploded1= new Image(new FileInputStream("data/sprites/brick_exploded1.png"));
            brick_exploded2= new Image(new FileInputStream("data/sprites/brick_exploded2.png"));

            explosion_horizontal= new Image(new FileInputStream("data/sprites/explosion_horizontal.png"));
            explosion_horizontal1= new Image(new FileInputStream("data/sprites/explosion_horizontal1.png"));
            explosion_horizontal2= new Image(new FileInputStream("data/sprites/explosion_horizontal2.png"));
            explosion_horizontal_left_last= new Image(new FileInputStream("data/sprites/explosion_horizontal_left_last.png"));
            explosion_horizontal_left_last1= new Image(new FileInputStream("data/sprites/explosion_horizontal_left_last1.png"));
            explosion_horizontal_left_last2= new Image(new FileInputStream("data/sprites/explosion_horizontal_left_last2.png"));
            explosion_horizontal_right_last= new Image(new FileInputStream("data/sprites/explosion_horizontal_right_last.png"));
            explosion_horizontal_right_last1= new Image(new FileInputStream("data/sprites/explosion_horizontal_right_last1.png"));
            explosion_horizontal_right_last2= new Image(new FileInputStream("data/sprites/explosion_horizontal_right_last2.png"));

            explosion_vertical= new Image(new FileInputStream("data/sprites/explosion_vertical.png"));
            explosion_vertical1= new Image(new FileInputStream("data/sprites/explosion_vertical1.png"));
            explosion_vertical2= new Image(new FileInputStream("data/sprites/explosion_vertical2.png"));
            explosion_vertical_down_last= new Image(new FileInputStream("data/sprites/explosion_vertical_down_last.png"));
            explosion_vertical_down_last1= new Image(new FileInputStream("data/sprites/explosion_vertical_down_last1.png"));
            explosion_vertical_down_last2= new Image(new FileInputStream("data/sprites/explosion_vertical_down_last2.png"));
            explosion_vertical_top_last= new Image(new FileInputStream("data/sprites/explosion_vertical_top_last.png"));
            explosion_vertical_top_last1= new Image(new FileInputStream("data/sprites/explosion_vertical_top_last1.png"));
            explosion_vertical_top_last2= new Image(new FileInputStream("data/sprites/explosion_vertical_top_last2.png"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


=======
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
    public static Image player_up_1;
    public static Image player_up_2;

    public static Image player_down;
    public static Image player_down_1;
    public static Image player_down_2;

    public static Image player_left;
    public static Image player_left_1;
    public static Image player_left_2;

    public static Image player_right;
    public static Image player_right_1;
    public static Image player_right_2;

    public static Image player_dead1;
    public static Image player_dead2;
    public static Image player_dead3;

    /*
	|--------------------------------------------------------------------------
	| enemies sprites
	|--------------------------------------------------------------------------
	 */

    public static Image balloom_dead;

    public static Image balloom_left1;
    public static Image balloom_left2;
    public static Image balloom_left3;

    public static Image balloom_right1;
    public static Image balloom_right2;
    public static Image balloom_right3;

    public static Image oneal_dead;

    public static Image oneal_left1;
    public static Image oneal_left2;
    public static Image oneal_left3;

    public static Image oneal_right1;
    public static Image oneal_right2;
    public static Image oneal_right3;

    public static Image minvo_dead;

    public static Image minvo_left1;
    public static Image minvo_left2;
    public static Image minvo_left3;

    public static Image minvo_right1;
    public static Image minvo_right2;
    public static Image minvo_right3;

    public static Image kondoria_dead;

    public static Image kondoria_left1;
    public static Image kondoria_left2;
    public static Image kondoria_left3;

    public static Image kondoria_right1;
    public static Image kondoria_right2;
    public static Image kondoria_right3;

    public static Image doll_dead;

    public static Image doll_left1;
    public static Image doll_left2;
    public static Image doll_left3;

    public static Image doll_right1;
    public static Image doll_right2;
    public static Image doll_right3;

    public static Image mob_dead1;
    public static Image mob_dead2;
    public static Image mob_dead3;

    /*
	|--------------------------------------------------------------------------
	| powerup sprites
	|--------------------------------------------------------------------------
	 */

    public static Image powerup_bombpass;
    public static Image powerup_bombs;
    public static Image powerup_detonator;
    public static Image powerup_flamepass;
    public static Image powerup_flames;
    public static Image powerup_speed;
    public static Image powerup_wallpass;

    /*
	|--------------------------------------------------------------------------
	| bomb sprites
	|--------------------------------------------------------------------------
	 */

    public static Image bomb;
    public static Image bomb1;
    public static Image bomb2;

    public static Image bomb_exploded;
    public static Image bomb_exploded1;
    public static Image bomb_exploded2;

    public static Image explosion_horizontal;
    public static Image explosion_horizontal1;
    public static Image explosion_horizontal2;

    public static Image explosion_vertical;
    public static Image explosion_vertical1;
    public static Image explosion_vertical2;

    public static Image explosion_horizontal_left_last;
    public static Image explosion_horizontal_left_last1;
    public static Image explosion_horizontal_left_last2;

    public static Image explosion_horizontal_right_last;
    public static Image explosion_horizontal_right_last1;
    public static Image explosion_horizontal_right_last2;

    public static Image explosion_vertical_top_last;
    public static Image explosion_vertical_top_last1;
    public static Image explosion_vertical_top_last2;

    public static Image explosion_vertical_down_last;
    public static Image explosion_vertical_down_last1;
    public static Image explosion_vertical_down_last2;

    public static Image brick_exploded;
    public static Image brick_exploded1;
    public static Image brick_exploded2;
    static {
        try {
            grass = new Image(new FileInputStream("data/sprites/grass.png"));
            wall = new Image(new FileInputStream("data/sprites/wall.png"));
            brick = new Image(new FileInputStream("data/sprites/brick.png"));
            portal = new Image(new FileInputStream("data/sprites/portal.png"));

            player_up = new Image(new FileInputStream("data/sprites/player_up.png"));
            player_up_1 = new Image(new FileInputStream("data/sprites/player_up_1.png"));
            player_up_2 = new Image(new FileInputStream("data/sprites/player_up_2.png"));

            player_down = new Image(new FileInputStream("data/sprites/player_down.png"));
            player_down_1 = new Image(new FileInputStream("data/sprites/player_down_1.png"));
            player_down_2 = new Image(new FileInputStream("data/sprites/player_down_2.png"));

            player_left = new Image(new FileInputStream("data/sprites/player_left.png"));
            player_left_1 = new Image(new FileInputStream("data/sprites/player_left_1.png"));
            player_left_2 = new Image(new FileInputStream("data/sprites/player_left_2.png"));

            player_right = new Image(new FileInputStream("data/sprites/player_right.png"));
            player_right_1 = new Image(new FileInputStream("data/sprites/player_right_1.png"));
            player_right_2 = new Image(new FileInputStream("data/sprites/player_right_2.png"));

            player_dead1 = new Image(new FileInputStream("data/sprites/player_dead1.png"));
            player_dead2 = new Image(new FileInputStream("data/sprites/player_dead2.png"));
            player_dead3 = new Image(new FileInputStream("data/sprites/player_dead3.png"));

            balloom_dead = new Image(new FileInputStream("data/sprites/balloom_dead.png"));

            balloom_left1 = new Image(new FileInputStream("data/sprites/balloom_left1.png"));
            balloom_left2 = new Image(new FileInputStream("data/sprites/balloom_left1.png"));
            balloom_left3 = new Image(new FileInputStream("data/sprites/balloom_left1.png"));

            balloom_right1 = new Image(new FileInputStream("data/sprites/balloom_right1.png"));
            balloom_right2 = new Image(new FileInputStream("data/sprites/balloom_right1.png"));
            balloom_right3 = new Image(new FileInputStream("data/sprites/balloom_right1.png"));

            doll_dead = new Image(new FileInputStream("data/sprites/doll_dead.png"));

            doll_left1 = new Image(new FileInputStream("data/sprites/doll_left1.png"));
            doll_left2 = new Image(new FileInputStream("data/sprites/doll_left1.png"));
            doll_left3 = new Image(new FileInputStream("data/sprites/doll_left1.png"));

            doll_right1 = new Image(new FileInputStream("data/sprites/doll_right1.png"));
            doll_right2 = new Image(new FileInputStream("data/sprites/doll_right1.png"));
            doll_right3 = new Image(new FileInputStream("data/sprites/doll_right1.png"));

            kondoria_dead = new Image(new FileInputStream("data/sprites/kondoria_dead.png"));

            kondoria_left1 = new Image(new FileInputStream("data/sprites/kondoria_left1.png"));
            kondoria_left2 = new Image(new FileInputStream("data/sprites/kondoria_left1.png"));
            kondoria_left3 = new Image(new FileInputStream("data/sprites/kondoria_left1.png"));

            kondoria_right1 = new Image(new FileInputStream("data/sprites/kondoria_right1.png"));
            kondoria_right2 = new Image(new FileInputStream("data/sprites/kondoria_right1.png"));
            kondoria_right3 = new Image(new FileInputStream("data/sprites/kondoria_right1.png"));

            minvo_dead = new Image(new FileInputStream("data/sprites/minvo_dead.png"));

            minvo_left1 = new Image(new FileInputStream("data/sprites/minvo_left1.png"));
            minvo_left2 = new Image(new FileInputStream("data/sprites/minvo_left1.png"));
            minvo_left3 = new Image(new FileInputStream("data/sprites/minvo_left1.png"));

            minvo_right1 = new Image(new FileInputStream("data/sprites/minvo_right1.png"));
            minvo_right2 = new Image(new FileInputStream("data/sprites/minvo_right1.png"));
            minvo_right3 = new Image(new FileInputStream("data/sprites/minvo_right1.png"));

            oneal_dead = new Image(new FileInputStream("data/sprites/oneal_dead.png"));

            oneal_left1 = new Image(new FileInputStream("data/sprites/oneal_left1.png"));
            oneal_left2 = new Image(new FileInputStream("data/sprites/oneal_left1.png"));
            oneal_left3 = new Image(new FileInputStream("data/sprites/oneal_left1.png"));

            oneal_right1 = new Image(new FileInputStream("data/sprites/oneal_right1.png"));
            oneal_right2 = new Image(new FileInputStream("data/sprites/oneal_right1.png"));
            oneal_right3 = new Image(new FileInputStream("data/sprites/oneal_right1.png"));

            mob_dead1 = new Image(new FileInputStream("data/sprites/mob_dead1.png"));
            mob_dead2 = new Image(new FileInputStream("data/sprites/mob_dead2.png"));
            mob_dead3 = new Image(new FileInputStream("data/sprites/mob_dead3.png"));

            powerup_bombpass = new Image(new FileInputStream("data/sprites/powerup_bombpass.png"));
            powerup_bombs= new Image(new FileInputStream("data/sprites/powerup_bombs.png"));
            powerup_detonator= new Image(new FileInputStream("data/sprites/powerup_detonator.png"));
            powerup_flamepass= new Image(new FileInputStream("data/sprites/powerup_flamepass.png"));
            powerup_flames= new Image(new FileInputStream("data/sprites/powerup_flames.png"));
            powerup_speed= new Image(new FileInputStream("data/sprites/powerup_speed.png"));
            powerup_wallpass= new Image(new FileInputStream("data/sprites/powerup_wallpass.png"));

            bomb = new Image(new FileInputStream("data/sprites/bomb.png"));
            bomb1= new Image(new FileInputStream("data/sprites/bomb1.png"));
            bomb2= new Image(new FileInputStream("data/sprites/bomb2.png"));

            bomb_exploded= new Image(new FileInputStream("data/sprites/bomb_exploded.png"));
            bomb_exploded1= new Image(new FileInputStream("data/sprites/bomb_exploded1.png"));
            bomb_exploded2= new Image(new FileInputStream("data/sprites/bomb_exploded2.png"));

            brick_exploded= new Image(new FileInputStream("data/sprites/brick_exploded.png"));
            brick_exploded1= new Image(new FileInputStream("data/sprites/brick_exploded1.png"));
            brick_exploded2= new Image(new FileInputStream("data/sprites/brick_exploded2.png"));

            explosion_horizontal= new Image(new FileInputStream("data/sprites/explosion_horizontal.png"));
            explosion_horizontal1= new Image(new FileInputStream("data/sprites/explosion_horizontal1.png"));
            explosion_horizontal2= new Image(new FileInputStream("data/sprites/explosion_horizontal2.png"));
            explosion_horizontal_left_last= new Image(new FileInputStream("data/sprites/explosion_horizontal_left_last.png"));
            explosion_horizontal_left_last1= new Image(new FileInputStream("data/sprites/explosion_horizontal_left_last1.png"));
            explosion_horizontal_left_last2= new Image(new FileInputStream("data/sprites/explosion_horizontal_left_last2.png"));
            explosion_horizontal_right_last= new Image(new FileInputStream("data/sprites/explosion_horizontal_right_last.png"));
            explosion_horizontal_right_last1= new Image(new FileInputStream("data/sprites/explosion_horizontal_right_last1.png"));
            explosion_horizontal_right_last2= new Image(new FileInputStream("data/sprites/explosion_horizontal_right_last2.png"));

            explosion_vertical= new Image(new FileInputStream("data/sprites/explosion_vertical.png"));
            explosion_vertical1= new Image(new FileInputStream("data/sprites/explosion_vertical1.png"));
            explosion_vertical2= new Image(new FileInputStream("data/sprites/explosion_vertical2.png"));
            explosion_vertical_down_last= new Image(new FileInputStream("data/sprites/explosion_vertical_down_last.png"));
            explosion_vertical_down_last1= new Image(new FileInputStream("data/sprites/explosion_vertical_down_last1.png"));
            explosion_vertical_down_last2= new Image(new FileInputStream("data/sprites/explosion_vertical_down_last2.png"));
            explosion_vertical_top_last= new Image(new FileInputStream("data/sprites/explosion_vertical_top_last.png"));
            explosion_vertical_top_last1= new Image(new FileInputStream("data/sprites/explosion_vertical_top_last1.png"));
            explosion_vertical_top_last2= new Image(new FileInputStream("data/sprites/explosion_vertical_top_last2.png"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


>>>>>>> 61892184ffee9775f7e8c5a6e9d153f4616d549a
}