package Entities;

import Sprites.Sprite;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;

import java.awt.event.KeyEvent;

public class Bomber extends Entity{
    int movement_speed = 20;
    private Status current_status;
    public Bomber(int x, int y, Image img) {
        super( x, y, img);
    }

    enum Status{
        Up,Down,Left,Right;
    }

    public void keyPressed(javafx.scene.input.KeyEvent e) {

        KeyCode key = e.getCode();

        if (key == KeyCode.LEFT) {
            if(current_status != Status.Left){
                current_status = Status.Left;
                this.image = Sprite.player_left;
            }
            this.pointX -= movement_speed;
        }

        if (key == KeyCode.RIGHT) {
            if(current_status != Status.Right){
                current_status = Status.Right;
                this.image = Sprite.player_right;
            }
            this.pointX += movement_speed;
        }

        if (key == KeyCode.UP) {
            if(current_status != Status.Up){
                current_status = Status.Up;
                this.image = Sprite.player_up;
            }
            this.pointY -= movement_speed;
        }

        if (key == KeyCode.DOWN) {
            if(current_status != Status.Down){
                current_status = Status.Down;
                this.image = Sprite.player_down;
            }
            this.pointY += movement_speed;
        }
    }


    @Override
    public void update() {

    }
}
