package Entities;

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

    }

    @Override
    public void render(GraphicsContext gc) {
        super.render(gc);
    }
}
