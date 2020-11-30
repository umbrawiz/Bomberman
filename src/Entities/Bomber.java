package Entities;

import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;

import java.awt.event.KeyEvent;

public class Bomber extends Entity{
    int movement_speed = 20;
    public Bomber(int x, int y, Image img) {
        super( x, y, img);
    }

    enum Status{
        Up,Down,Left,Right;
    }

    public void keyPressed(javafx.scene.input.KeyEvent e) {

        KeyCode key = e.getCode();

        if (key == KeyCode.LEFT) {
            this.pointX -= movement_speed;
        }

        if (key == KeyCode.RIGHT) {
            this.pointX += movement_speed;
        }

        if (key == KeyCode.UP) {
            this.pointY -= movement_speed;
        }

        if (key == KeyCode.DOWN) {
            this.pointY += movement_speed;
        }
    }


    @Override
    public void update() {

    }
}
