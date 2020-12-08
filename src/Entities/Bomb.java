package Entities;

import Map.Map;
import Sprites.Sprite;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;


public class Bomb extends Entity {
    public double timeTillEx = 140;
    public int exTime = 39;
    public int power = 2;
    public Map map;
    public Explosion ex;
    protected boolean exploded = false;

    public Bomb(int x, int y, Image img, Map map) {
        super(x, y, img);
        passThru = false;
        this.map = map;
    }

    public void update1(GraphicsContext gc, Map map) {
        if (timeTillEx > 0) {
            timeTillEx--;
            if (timeTillEx % 30 == 0) {
                update();
            }

        } else {
            this.posX = -50;
            this.posY = -50;
            map.maps[pointY][pointX].Exploding();
            if (!exploded) {
                if (exTime > 0) {
                    if (exTime == 39) {
                        ex = explosion(map);
                    }
                    exTime--;
                    if (exTime == 26 || exTime == 13) {
                        ex.flames.forEach(Flame::update);
                    }
                    ex.flames.forEach(g -> g.render(gc));
                } else {
                    exploded = true;
                    map.reset();
                }

            }
        }
    }


    public Explosion explosion(Map map) {
//        PassThru = true;
        ex = new Explosion(pointX, pointY, Sprite.bomb_exploded, map, power);
        ex.createExplosion(map);
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
