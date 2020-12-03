package Entities;

import Sprites.Sprite;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import Map.*;

public class Bomber extends Entity{
    private int movement_speed = 10;
    private Status current_status;
    public List<Bomb> bombs = new ArrayList<>();

    public Bomber(int x, int y, Image img) {
        super( x, y, img);
        this.current_status = Status.Left;
    }

    enum Status{
        Up,Up1,Up2,Down,Down1,Down2,Left,Left1,Left2,Right,Right1,Right2;
    }

    public void keyPressed(javafx.scene.input.KeyEvent e, Map map) {

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
            if (collision(map, 2)) {
                return;
            }
            this.posX -= movement_speed;
            this.pointX = this.posX/SIZE;
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
            if (collision(map, 1)) {
                return;
            }
            this.posX += movement_speed;
            this.pointX = this.posX/SIZE;
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
            if (collision(map, 3)) {
                return;
            }
            this.posY -= movement_speed;
            this.pointY = this.posY/SIZE;
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
            if (collision(map, 4)) {
                return;
            }
            this.posY += movement_speed;
            this.pointY = this.posY/SIZE;
        }



        if (key == KeyCode.SPACE) {
            bombs.add(new Bomb(posX/50, posY/50, Sprite.bomb));
        }

    }

    public boolean collision(Map map, int a){
//        System.out.println(posX + "\t" +posY);
        switch (a) {
            case 1: //right
                for (int i=0; i<map.walls.size(); i++) {
                    if (posX + 40 == map.walls.get(i).posX && posY >= map.walls.get(i).posY && posY < map.walls.get(i).posY + 50) {
                        return true;
                    }
                }
                break;
            case 2: //left
                for (int i=0; i<map.walls.size(); i++) {
                    if (posX - 50 == map.walls.get(i).posX && posY >= map.walls.get(i).posY && posY < map.walls.get(i).posY + 50) {
                        return true;
                    }
                }
                break;
            case 3: // up
                for (int i=0; i<map.walls.size(); i++) {
                    if (posY - 50 == map.walls.get(i).posY && posX >= map.walls.get(i).posX && posX < map.walls.get(i).posX + 50) {
                        return true;
                    }
                }
                break;
            case 4: //down
                for (int i=0; i<map.walls.size(); i++) {
                    if (posY + 50 == map.walls.get(i).posY && posX >= map.walls.get(i).posX && posX < map.walls.get(i).posX + 50) {
                        return true;
                    }
                }
                break;
            default:
                return false;
        }
        return false;
    }

    @Override
    public void update() {
        if (bombs.size() != 0) {
            bombs.removeIf(i -> i.exploded);
        }

    }
}
