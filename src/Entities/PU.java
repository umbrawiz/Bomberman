package Entities;

import javafx.scene.image.Image;

public class PU extends Entity{
    public Bomber bomber;
    public boolean obtained = false;
    public PU(int xUnit, int yUnit, Image img, Bomber bomber) {
        super(xUnit, yUnit, img);
        this.bomber = bomber;
    }

    public boolean obtain() {
        if (bomber.pointY == pointY && bomber.pointX == pointX) {
            obtained = true;
            return true;
        }
        return false;
    };

    @Override
    public void update() {

    }


}
