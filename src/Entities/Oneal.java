package Entities;

import Map.Map;
import javafx.scene.image.Image;

import java.util.Random;

public class Oneal extends Balloom{
    Random randS = new Random();
    int[] speed = {2,5};
    public Oneal(int x, int y, Image img, Map map, int current_direction) {
        super(x, y, img, map, current_direction);
    }

    @Override
    public void update() {

        if(isAlive){
            if (step == 0 || !checkColW(map.walls) || !checkColB(map.bomber.bombs)) {
                current_direction = rand.nextInt(4) + 1;
                int opt = randS.nextInt(2)  ;
                this.movement_speed = speed[opt];
                step = 50;
            } else {
                step--;
            }
            switch (current_direction) {
                case Up: {
                    if (checkColW(map.walls) && checkColB(map.bomber.bombs)) {
                        this.posY -= movement_speed;
                        this.pointY = this.posY/SIZE;
                    }
                    break;
                }

                case Down: {
                    if (checkColW(map.walls) && checkColB(map.bomber.bombs)) {
                        this.posY += movement_speed;
                        this.pointY = this.posY/SIZE;
                    }
                    break;
                }

                case Left: {
                    if (checkColW(map.walls) && checkColB(map.bomber.bombs)) {
                        this.posX -= movement_speed;
                        this.pointX = this.posX/SIZE;
                    }
                    break;
                }

                case Right: {
                    if (checkColW(map.walls) && checkColB(map.bomber.bombs)) {
                        this.posX += movement_speed;
                        this.pointX = this.posX/SIZE;
                    }
                    break;
                }
            }
        }
    }
}
