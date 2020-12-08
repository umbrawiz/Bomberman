package Entities;

import Sprites.Sprite;
import javafx.animation.AnimationTimer;
import javafx.scene.image.Image;

public class Brick extends Entity {
    public int bTime = 120;
    public boolean broken = false;

    public Brick(int x, int y, Image img) {
        super(x, y, img);
    }


    public void breakAnimation(){
        this.image = Sprite.brick_exploded;
        System.out.println("Test");
        if(bTime > 0){
            bTime--;
            if(bTime % 60 == 0){
                if(this.image == Sprite.brick_exploded){
                    this.image = Sprite.brick_exploded1;
                }else if(image == Sprite.brick_exploded1) {
                    this.image = Sprite.brick_exploded2;
                }
            }
        }else {
            broken = false;
        }
    }
    @Override
    public void update() {
        if(broken){
            breakAnimation();
        }
    }

}
