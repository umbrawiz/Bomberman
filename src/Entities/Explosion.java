package Entities;

import Map.Map;
import Sprites.Sprite;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.List;

public class Explosion extends Entity{
    protected int distance;
    protected Map map;
    List<Flame> flames = new ArrayList<>();
    public Explosion(int xUnit, int yUnit, Image img, Map map) {
        super(xUnit, yUnit, img);
        this.map = map;
        createExplosion();
    }

    public void createExplosion() {
        flames.add(new Flame(posX, posY, image, 0));
        int xr = posX + 50;
        int xl = posX - 50;
        int yu = posY - 50;
        int yd = posY + 50;
        boolean left = check(xl, posY);
        boolean right = check(xr, posY);
        boolean up = check(posX, yu);
        boolean down = check (posX, yd);

        for (int i=0; i<distance; i++) {
            if (right) {
                flames.add(new Flame(xr, posY, Sprite.explosion_horizontal, 1));
                xr += 50;
                right = check(xr, posY);
            }
            if (left) {
                flames.add(new Flame(xl, posY, Sprite.explosion_horizontal, 1));
                xl -= 50;
                left = check(xl, posY);
            }
            if (up) {
                flames.add(new Flame(posX, yu, Sprite.explosion_vertical, 2));
                yu -= 50;
                up = check(posX, yu);
            }
            if (down) {
                flames.add(new Flame(xr, posY, Sprite.explosion_vertical, 2));
                xr += 50;
                down = check(posX, yd);
            }
        }
        if (left) {
            flames.add(new Flame(xl, posY, Sprite.explosion_horizontal_left_last, 3));
        }
        if (right) {
            flames.add(new Flame(xr, posY, Sprite.explosion_horizontal_right_last, 4));
        }
        if (up) {
            flames.add(new Flame(posX, yu, Sprite.explosion_vertical_top_last, 5));
        }
        if (down) {
            flames.add(new Flame(posX, yd, Sprite.explosion_vertical_down_last, 6));
        }

    }

    public boolean check(int x, int y) {
        for (int i=0; i<map.walls.size(); i++) {
            if (x == map.walls.get(i).posX && y == map.walls.get(i).posY) {
                return false;
            }
        }
        return true;
    }
    @Override
    public void render(GraphicsContext gc) {
        super.render(gc);

    }

    @Override
    public void update() {

    }
}
