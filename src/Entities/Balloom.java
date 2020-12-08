package Entities;


import java.util.List;
import java.util.Random;

import Map.Map;
import javafx.scene.image.Image;

public class Balloom extends Enemy {
    private final static int Up = 1;
    private final static int Down = 2;
    private final static int Left = 3;
    private final static int Right = 4;
    private int current_direction;
    private final Random rand = new Random();
    private int movement_speed = 2;
    private int step = 0;
    public Balloom(int x, int y, Image img, Map map, int current_direction) {
        super(x, y, img, map);
        this.current_direction = current_direction;
    }

    @Override
    public boolean checkColW(List<Entity> list) {
        if (list.size() == 0) {
            return true;
        }
        switch (current_direction) {
            case Up:{
                for (Entity entity : list) {
                    if(posY - 50 == entity.posY && checkUD(posX, entity.posX)) {
                        return false;
                    }
//                    if (posY < map.walls.get(i).posY) {
//                        return true;
//                    }
                }
                return true;
            }
            case Down:{
                for (Entity entity : list) {
//                    if (posX == map.walls.get(i).posX) {
//                        continue;
//                    }
                    if(posY + 50 == entity.posY && checkUD(posX, entity.posX)) {
                        return false;
                    }
//                    if (posY < map.walls.get(i).posY) {
//                        return true;
//                    }
                }
                return true;
            }
            case Left:{
                for (Entity entity : list) {
//                    if (posY != map.walls.get(i).posY) {
//                        continue;
//                    }
                    if (posX - 50 == entity.posX && checkLR(posY, entity.posY)) {
                        return false;
                    }
                }
                return true;
            }
            case Right:{
                for (Entity entity : list) {
//                    if (posY != map.walls.get(i).posY) {
//                        continue;
//                    }
                    if (posX + 50 == entity.posX && checkLR(posY, entity.posY)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return true;
    }

    @Override
    public boolean checkColB(List<Bomb> list) {
        if (list.size() == 0) {
            return true;
        }
        switch (current_direction) {
            case Up:{
                for (Entity entity : list) {
                    if(posY - 50 == entity.posY && checkUD(posX, entity.posX)) {
                        return false;
                    }
//                    if (posY < map.walls.get(i).posY) {
//                        return true;
//                    }
                }
                return true;
            }
            case Down:{
                for (Entity entity : list) {
//                    if (posX == map.walls.get(i).posX) {
//                        continue;
//                    }
                    if(posY + 50 == entity.posY && checkUD(posX, entity.posX)) {
                        return false;
                    }
//                    if (posY < map.walls.get(i).posY) {
//                        return true;
//                    }
                }
                return true;
            }
            case Left:{
                for (Entity entity : list) {
//                    if (posY != map.walls.get(i).posY) {
//                        continue;
//                    }
                    if (posX - 50 == entity.posX && checkLR(posY, entity.posY)) {
                        return false;
                    }
                }
                return true;
            }
            case Right:{
                for (Entity entity : list) {
//                    if (posY != map.walls.get(i).posY) {
//                        continue;
//                    }
                    if (posX + 50 == entity.posX && checkLR(posY, entity.posY)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return true;
    }

    public boolean checkUD(int a, int b) {
        if (a >= b && a < b + 50) {
            return true;
        }
        return a + 50 > b && a + 50 < b + 50;
    }

    public boolean checkLR(int a, int b) {
        if (a >= b && a < b + 50) {
            return true;
        }
        return a + 50 > b && a + 50 < b + 50;
    }

    @Override
    public void update() {
        if (step == 0 || !checkColW(map.walls) || !checkColB(map.bomber.bombs)) {
            current_direction = rand.nextInt(4) + 1;
            step = 50;
        } else {
            step--;
        }
        switch (current_direction) {
            case Up: {
                if (checkColW(map.walls) && checkColB(map.bomber.bombs)) {
                    this.posY -= movement_speed;
                }
                break;
            }

            case Down: {
                if (checkColW(map.walls) && checkColB(map.bomber.bombs)) {
                    this.posY += movement_speed;
                }
                break;
            }

            case Left: {
                if (checkColW(map.walls) && checkColB(map.bomber.bombs)) {
                    this.posX -= movement_speed;
                }
                break;
            }

            case Right: {
                if (checkColW(map.walls) && checkColB(map.bomber.bombs)) {
                    this.posX += movement_speed;
                }
                break;
            }
        }

    }
}
