package Entities;

import Sprites.Sprite;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class Bomber extends Entity{
    private int movement_speed = 20;
    private Status current_status;
    public List<Bomb> bombs = new ArrayList<>();

    public Bomber(int x, int y, Image img) {
        super( x, y, img);
        this.current_status = Status.Left;
    }

    enum Status{
        Up,Up1,Up2,Down,Down1,Down2,Left,Left1,Left2,Right,Right1,Right2;
    }

    public void keyPressed(javafx.scene.input.KeyEvent e) {

        KeyCode key = e.getCode();

        if (key == KeyCode.LEFT) {
            if(current_status == Status.Left){
                current_status = Status.Left1;
                this.image = Sprite.player_left_1;
            }
            else if (current_status == Status.Left1){
                current_status = Status.Left2;
                this.image = Sprite.player_left_2;
            }
            else{
                current_status = Status.Left;
                this.image = Sprite.player_left;
            }

            this.pointX -= movement_speed;
        }

        if (key == KeyCode.RIGHT) {
            if(current_status == Status.Right){
                current_status = Status.Right1;
                this.image = Sprite.player_right_1;
            }
            else if (current_status == Status.Right1){
                current_status = Status.Right2;
                this.image = Sprite.player_right_2;
            }
            else{
                current_status = Status.Right;
                this.image = Sprite.player_right;
            }
            this.pointX += movement_speed;
        }

        if (key == KeyCode.UP) {
            if(current_status == Status.Up){
                current_status = Status.Up1;
                this.image = Sprite.player_up_1;
            }
            else if (current_status == Status.Up1){
                current_status = Status.Up2;
                this.image = Sprite.player_up_2;
            }
            else{
                current_status = Status.Up;
                this.image = Sprite.player_up;
            }
            this.pointY -= movement_speed;
        }

        if (key == KeyCode.DOWN) {
            if(current_status == Status.Down){
                current_status = Status.Down1;
                this.image = Sprite.player_down_1;
            }
            else if (current_status == Status.Down1){
                current_status = Status.Down2;
                this.image = Sprite.player_down_2;
            }
            else{
                current_status = Status.Down;
                this.image = Sprite.player_down;
            }
            this.pointY += movement_speed;
        }

        if (key == KeyCode.SPACE) {
            bombs.add(new Bomb(pointX/50, pointY/50, Sprite.bomb));
        }

    }

    @Override
    public void update() {
        if (bombs.size() != 0) {
//            if(bombs.get(0).timeTillEx == 0){
//                bombs.get(0).pointX = -50;
//                bombs.get(0).pointY = -50;
//
//            }
//            bombs.removeIf(i -> i.exploded);
        }
    }
}
