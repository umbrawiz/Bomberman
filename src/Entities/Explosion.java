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
        int x = posX + 50;
        while(power != 0) {
            flames.add(new Flame(x, posY, Sprite.explosion_horizontal));
            x += 50;
        }
        flames.add(new Flame(x, posY, Sprite.explosion_horizontal_right_last));
    }

    @Override
    public void render(GraphicsContext gc) {
        super.render(gc);

    }

    @Override
    public void update() {

    }
}
