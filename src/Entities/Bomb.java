package Entities;

import Sprites.Sprite;
import javafx.scene.image.Image;


public class Bomb extends Entity{
    public double  timeTillEx = 120;
    public int exTime = 30;
    protected boolean exploded = false;
    public int power = 0;
    public Explosion ex;
    public Bomb(int x, int y, Image img) {
        super( x, y, img);
        passThru = false;
    }
    @Override
    public void update() {
        if (timeTillEx > 0) {
            timeTillEx--;
            if (timeTillEx % 30 == 0){
                test();
            }

        } else {
            if (!exploded) {
                explosion();
            }
        }
    }

    private void test(){
        if(image == Sprite.bomb){
            image = Sprite.bomb1;
        }
        else if(image == Sprite.bomb1) {
            image = Sprite.bomb2;
        }
        else {
            image = Sprite.bomb;
        }
    }
    public void explosion() {
        exploded = true;
//        PassThru = true;
        ex = new Explosion(posX, posY, Sprite.bomb_exploded);
        ex.creatExplosion();

    }

}
