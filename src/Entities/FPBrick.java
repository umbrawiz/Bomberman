package Entities;

import javafx.scene.image.Image;

public class FPBrick extends Brick{
    public FlamesPU powerup;

    public FPBrick(int x, int y, Image img, FlamesPU powerup) {
        super(x, y, img);
        this.powerup = powerup;
    }

    public FlamesPU getPowerup() {
        return powerup;
    }
}
