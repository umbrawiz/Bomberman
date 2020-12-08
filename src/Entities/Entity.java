package Entities;

import Sprites.Sprite;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;


public abstract class Entity {
    protected int posX;
    protected int posY;
    protected int pointX;
    protected int pointY;
    protected boolean passThru;
    protected int SIZE = 50;


    protected Image image;

    public Entity(int xUnit, int yUnit, Image img) {
        this.posX = xUnit * SIZE;
        this.posY = yUnit * SIZE;
        this.pointX = xUnit;
        this.pointY = yUnit;
        this.image = img;
    }

    public void tograss(){
        this.image = Sprite.grass;
    }

    public void render(GraphicsContext gc) {
        gc.drawImage(image, posX, posY);
    }

    public int getPointX(){
        return pointX;
    }

    public int getPointY() {
        return pointY;
    }

    public abstract void update();

}
