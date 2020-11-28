package Entities;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;


public abstract class Entity {
    protected int pointX;
    protected int pointY;
    protected int SIZE = 50;

    protected Image image;

    public Entity( int xUnit, int yUnit, Image img) {
        this.pointX = xUnit * SIZE;
        this.pointY = yUnit * SIZE;
        this.image = img;
    }

    public void render(GraphicsContext gc) {
        gc.drawImage(image, pointX, pointY);
    }
    public abstract void update();

}
