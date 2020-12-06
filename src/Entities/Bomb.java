package Entities;

import Map.Map;
import Sprites.Sprite;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;


public class Bomb extends Entity {
    public double timeTillEx = 120;
    public int exTime = 60;
    public int power = 1;
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
                update();
            }

        } else {
            this.posX = -50;
            this.posY = -50;
            if (!exploded) {
                Explosion ex = explosion();
                if (exTime > 0) {
                    exTime--;
                    if (exTime % 20 == 0) {
                        ex.flames.forEach(Flame::update);
                    }
                    ex.flames.forEach(g -> g.render(gc));
                } else {
                    exploded = true;
                }

            }
        }
    }


    public Explosion explosion() {
//        PassThru = true;
        ex = new Explosion(pointX, pointY, Sprite.bomb_exploded, map, power);
        ex.createExplosion();
        return ex;

    }

    @Override
    public void update() {
        if (image == Sprite.bomb) {
            image = Sprite.bomb1;
        } else if (image == Sprite.bomb1) {
            image = Sprite.bomb2;
        } else {
            image = Sprite.bomb;
        }
    }
}
