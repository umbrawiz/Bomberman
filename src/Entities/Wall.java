package Entities;

import javafx.scene.image.Image;

public class Wall extends Entity {
    public Wall(int x, int y, Image img) {
        super(x, y, img);
        passThru = false;
    }

    @Override
    public void update() {

    }
}
