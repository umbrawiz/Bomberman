package Entities;

import Map.Map;
import javafx.scene.image.Image;

import java.util.List;

public abstract class Enemy extends Entity {
    public Map map;
    public boolean isAlive = true;
    public Enemy(int x, int y, Image img, Map map) {
        super(x, y, img);
        this.map = map;
    }

    public abstract boolean checkColW(List<Entity> list);
    public abstract boolean checkColB(List<Bomb> list);
    public abstract void alive(Map map);
    @Override
    public void update() {

    }
}
