package Entities;

import javafx.scene.image.Image;

public class BPBrick extends Brick{
        public BombsPU powerup;

        public BPBrick(int x, int y, Image img, BombsPU powerup) {
            super(x, y, img);
            this.powerup = powerup;
        }
}
