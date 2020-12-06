package Entities;


import java.util.Random;
import javafx.scene.image.Image;

public class Balloom extends Enemy{
    private final static int Up = 1;
    private final static int Down = 2;
    private final static int Left = 3;
    private final static int Right = 4;
    private int current_direction;
    private int movement_speed = 2;
    private Random rand = new Random();

    public Balloom(int x, int y, Image img , int current_direction) {
        super(x, y, img);
        this.current_direction = current_direction;
    }

    @Override
    public boolean checkCol() {
        return true;
    }

    @Override
    public void update() {
        current_direction = rand.nextInt(4) + 1;

        switch (current_direction){
            case Up:{
                if(checkCol()){
                    this.posY -= movement_speed;
                }
            }

            case Down:{
                if(checkCol()){
                    this.posY += movement_speed;
                }
            }

            case Left:{
                if(checkCol()){
                    this.posX -= movement_speed;
                }
            }

            case Right:{
                if(checkCol()){
                    this.posX += movement_speed;
                }
            }
        }
    }
}
