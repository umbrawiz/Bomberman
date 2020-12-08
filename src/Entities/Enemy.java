package Entities;

import Map.Map;
import javafx.scene.image.Image;

import java.util.List;

public abstract class Enemy extends Entity {
    public Map map;
    public Enemy(int x, int y, Image img, Map map) {
        super(x, y, img);
        this.map = map;
    }

    public abstract boolean checkColW(List<Entity> list);
    public abstract boolean checkColB(List<Bomb> list);

    @Override
    public void update() {

    }
}
