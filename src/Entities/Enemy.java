package Entities;

import javafx.scene.image.Image;

public abstract class Enemy extends Entity {
    public Enemy(int x, int y, Image img) {
        super(x, y, img);
    }

    public abstract boolean checkCol();
    @Override
    public void update() {

    }
}
