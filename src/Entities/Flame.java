package Entities;

import Sprites.Sprite;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class Flame extends Entity {
    public static final int mid = 0;
    public static final int horizontal = 1;
    public static final int vertical = 2;
    public static final int left_last = 3;
    public static final int right_last = 4;
    public static final int up_last = 5;
    public static final int down_last = 6;
    private int type;

    public Flame(int xUnit, int yUnit, Image img, int type) {
        super(xUnit, yUnit, img);
        this.type = type;
    }


    @Override
    public void update() {
        switch (type){
            case 0:{
                if(this.image == Sprite.bomb_exploded){
                    this.image = Sprite.bomb_exploded1;
                }
                else if(this.image == Sprite.bomb_exploded1){
                    this.image = Sprite.bomb_exploded2;
                }
            }

            case 1:{
                if(this.image == Sprite.explosion_horizontal){
                    this.image = Sprite.explosion_horizontal1;
                }
                else if(this.image == Sprite.explosion_horizontal1){
                    this.image = Sprite.explosion_horizontal2;
                }
            }

            case 2:{
                if(this.image == Sprite.explosion_vertical){
                    this.image = Sprite.explosion_vertical1;
                }
                else if(this.image == Sprite.explosion_vertical1){
                    this.image = Sprite.explosion_vertical2;
                }
            }

            case 3:{
                if(this.image == Sprite.explosion_horizontal_left_last){
                    this.image = Sprite.explosion_horizontal_left_last1;
                }
                else if(this.image == Sprite.explosion_horizontal_left_last1){
                    this.image = Sprite.explosion_horizontal_left_last2;
                }
            }

            case 4:{
                if(this.image == Sprite.explosion_horizontal_right_last){
                    this.image = Sprite.explosion_horizontal_right_last1;
                }
                else if(this.image == Sprite.explosion_horizontal_right_last1){
                    this.image = Sprite.explosion_horizontal_right_last2;
                }
            }

            case 5:{
                if(this.image == Sprite.explosion_vertical_top_last){
                    this.image = Sprite.explosion_vertical_top_last1;
                }
                else if(this.image == Sprite.explosion_vertical_top_last1){
                    this.image = Sprite.explosion_vertical_top_last2;
                }
            }

            case 6:{
                if(this.image == Sprite.explosion_vertical_down_last){
                    this.image = Sprite.explosion_vertical_down_last1;
                }
                else if(this.image == Sprite.explosion_vertical_down_last1){
                    this.image = Sprite.explosion_vertical_down_last2;
                }
            }
        }
    }

    @Override
    public void render(GraphicsContext gc) {
        super.render(gc);
    }
}
