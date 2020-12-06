package Entities;

import Map.Map;
import Sprites.Sprite;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;


public class Bomb extends Entity {
    public double timeTillEx = 120;
    public int exTime = 30;
    public int power = 0;
    public Explosion ex;
    public Map map;
    protected boolean exploded = false;

    public Bomb(int x, int y, Image img, Map map) {
        super(x, y, img);
        passThru = false;
        this.map = map;
    }

    public void update1(GraphicsContext gc) {
        if (timeTillEx > 0) {
            timeTillEx--;
            if (timeTillEx % 30 == 0) {
                test();
            }

        } else {
            if (!exploded) {
                explosion(gc);
            }
        }
    }

    private void test() {
        if (image == Sprite.bomb) {
            image = Sprite.bomb1;
        } else if (image == Sprite.bomb1) {
            image = Sprite.bomb2;
        } else {
            image = Sprite.bomb;
        }
    }

    public void explosion(GraphicsContext gc) {
        exploded = true;
//        PassThru = true;
        ex = new Explosion(pointX, pointY, Sprite.bomb_exploded, map);
        ex.createExplosion(gc);

    }

    @Override
    public void update() {

    }
}
