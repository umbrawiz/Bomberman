package Entities;

import Sprites.Sprite;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.List;

public class Explosion extends Bomb{
    List<Flame> flames = new ArrayList<>();
    public Explosion(int xUnit, int yUnit, Image img) {
        super(xUnit, yUnit, img);

    }

    public void creatExplosion() {
<<<<<<< HEAD
        int x = posX + 50;
        while(power != 0) {
            flames.add(new Flame(x, posY, Sprite.explosion_horizontal));
            x += 50;
        }
        flames.add(new Flame(x, posY, Sprite.explosion_horizontal_right_last));
=======
        int x = pointX + 50;
        while(power != 0) {
            flames.add(new Flame(x, pointY, Sprite.explosion_horizontal));
            x += 50;
        }
        flames.add(new Flame(x, pointY, Sprite.explosion_horizontal_right_last));
>>>>>>> ca59877ae64840d8654510e2c3f7801210a22a17
    }

    @Override
    public void render(GraphicsContext gc) {
        super.render(gc);

    }

    @Override
    public void update() {

    }
}
