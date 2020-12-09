package Entities;

import Sprites.Sprite;
import javafx.scene.image.Image;

public class PortalBrick extends Brick{
    public Portal portal;

    public PortalBrick(int x, int y, Image img, Portal portal) {
        super(x, y, img);
        this.portal = portal;
    }


    public Portal getPortal() {
        return portal;
    }
}
