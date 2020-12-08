package Entities;

import javafx.scene.image.Image;

public abstract class PU extends Entity{

    public PU(int xUnit, int yUnit, Image img) {
        super(xUnit, yUnit, img);
    }

    public abstract void obtain();

    @Override
    public void update() {

    }
}
