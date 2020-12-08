package Entities;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class FlamesPU extends PU{

    public FlamesPU(int xUnit, int yUnit, Image img, Bomber bomber) {
        super(xUnit, yUnit, img, bomber);
    }


    @Override
    public void update() {
        if (obtain()) {
            bomber.power++;
            obtained = false;
        }
    }

}
