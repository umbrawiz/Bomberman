package Entities;

import Sprites.Sprite;
import javafx.animation.AnimationTimer;
import javafx.scene.image.Image;

public class Brick extends Entity {
    private int bTime = 1200;
    public boolean broken = false;
    public boolean done = false;

    public Brick(int x, int y, Image img) {
        super(x, y, img);
    }


    public void breakAnimation(){
        broken = true;
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
            done = true;
        }
    }
    @Override
    public void update() {
        if(broken){
            breakAnimation();
        }
    }

}
