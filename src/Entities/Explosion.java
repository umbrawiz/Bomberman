package Entities;

import Map.Map;
import Sprites.Sprite;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.List;

public class Explosion extends Entity {
    protected int distance;
    protected Map map;
    List<Flame> flames = new ArrayList<>();

    public Explosion(int xUnit, int yUnit, Image img, Map map, int power) {
        super(xUnit, yUnit, img);
        this.map = map;
        this.distance = power;
    }

    public void createExplosion(Map map) {
        flames.add(new Flame(pointX, pointY, image, 0));
        int xr = pointX + 1;
        int xl = pointX - 1;
        int yu = pointY - 1;
        int yd = pointY + 1;
        boolean left = check(xl, pointY);
        boolean right = check(xr, pointY);
        boolean up = check(pointX, yu);
        boolean down = check(pointX, yd);

        for (int i = 0; i < distance; i++) {
            if (right) {
                flames.add(new Flame(xr, pointY, Sprite.explosion_horizontal, 1));
                map.maps[pointY][xr].Exploding();
                xr += 1;
                right = check(xr, pointY);
            }
            if (left) {
                flames.add(new Flame(xl, pointY, Sprite.explosion_horizontal, 1));
                map.maps[pointY][xl].Exploding();
                xl -= 1;
                left = check(xl, pointY);
            }
            if (up) {
                flames.add(new Flame(pointX, yu, Sprite.explosion_vertical, 2));
                map.maps[yu][pointX].Exploding();
                yu -= 1;
                up = check(pointX, yu);
            }
            if (down) {
                flames.add(new Flame(pointX, yd, Sprite.explosion_vertical, 2));
                map.maps[yd][pointX].Exploding();
                yd += 1;
                down = check(pointX, yd);
            }
        }
        if (left) {
            flames.add(new Flame(xl, pointY, Sprite.explosion_horizontal_left_last, 3));
            map.maps[pointY][xl].Exploding();
        }
        if (right) {
            flames.add(new Flame(xr, pointY, Sprite.explosion_horizontal_right_last, 4));
            map.maps[pointY][xr].Exploding();
        }
        if (up) {
            flames.add(new Flame(pointX, yu, Sprite.explosion_vertical_top_last, 5));
            map.maps[yu][pointX].Exploding();
        }
        if (down) {
            flames.add(new Flame(pointX, yd, Sprite.explosion_vertical_down_last, 6));
            map.maps[yd][pointX].Exploding();
        }

    }

    public boolean check(int x, int y) {
        for (int i = 0; i < map.walls.size(); i++) {
            if (x == map.walls.get(i).pointX && y == map.walls.get(i).pointY) {
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
