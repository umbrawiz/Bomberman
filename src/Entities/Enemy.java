package Entities;

import Map.Map;
import javafx.scene.image.Image;

public abstract class Enemy extends Entity {
    public Map map;
    public Enemy(int x, int y, Image img, Map map) {
        super(x, y, img);
        this.map = map;
    }

    public abstract boolean checkCol();

    @Override
    public void update() {

    }
}
