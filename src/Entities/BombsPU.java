package Entities;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class BombsPU extends PU{

    public BombsPU(int xUnit, int yUnit, Image img, Bomber bomber) {
        super(xUnit, yUnit, img, bomber);
    }


    @Override
    public void update() {
        if (obtain()) {
            bomber.bombsPU ++;
            obtained = false;
        }
    }

}
