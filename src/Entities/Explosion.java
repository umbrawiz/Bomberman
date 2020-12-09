package Entities;

import Map.Map;
import Sprites.Sprite;
import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.List;

public class Explosion extends Entity {
    protected int distance;
    protected Map map;
    List<Flame> flames = new ArrayList<>();

    public Explosion(int xUnit, int yUnit, Image img, Map map, int power) {
        super(xUnit, yUnit, img);
        this.map = map;
        this.distance = power;
    }

    public void createExplosion(Map map) {
        flames.add(new Flame(pointX, pointY, image, 0));
        int xr = pointX + 1;
        int xl = pointX - 1;
        int yu = pointY - 1;
        int yd = pointY + 1;
        boolean left = check(xl, pointY);
        boolean right = check(xr, pointY);
        boolean up = check(pointX, yu);
        boolean down = check(pointX, yd);

        if (!right) {
            meetB(xr, pointY);
        }
        if (!left) {
            meetB(xl, pointY);
        }
        if (!up) {
            meetB(pointX, yu);
        }
        if (!down) {
            meetB(pointX, yd);
        }

        for (int j = 0; j < distance; j++) {

            if (right) {
                Flame fl = new Flame(xr, pointY, Sprite.explosion_horizontal, 1);
                flames.add(fl);
                map.maps[pointY][xr].Exploding();
                xr += 1;
                right = check(xr, pointY);
                if (!right) {
                    meetB(xr, pointY);
                }
            }


            if (left) {
                flames.add(new Flame(xl, pointY, Sprite.explosion_horizontal, 1));
                map.maps[pointY][xl].Exploding();
                xl -= 1;
                left = check(xl, pointY);
                if (!left) {
                    meetB(xl, pointY);
                }

            }
            if (up) {
                flames.add(new Flame(pointX, yu, Sprite.explosion_vertical, 2));
                map.maps[yu][pointX].Exploding();
                yu -= 1;
                up = check(pointX, yu);
                if (!up) {
                    meetB(pointX, yu);
                }
            }
            if (down) {
                flames.add(new Flame(pointX, yd, Sprite.explosion_vertical, 2));
                map.maps[yd][pointX].Exploding();
                yd += 1;
                down = check(pointX, yd);
                if (!down) {
                    meetB(pointX, yd);
                }
            }
        }
        if (left) {
            flames.add(new Flame(xl, pointY, Sprite.explosion_horizontal_left_last, 3));
            map.maps[pointY][xl].Exploding();
            if(map.maps[pointY][xl].getType() == 2){
                for(int i = 0 ; i < map.walls.size();i++){
                    if(map.walls.get(i).pointX == xl && map.walls.get(i).pointY == pointY){

                        map.walls.get(i).tograss();
                    }
                }
            }
        }
        if (right) {
            flames.add(new Flame(xr, pointY, Sprite.explosion_horizontal_right_last, 4));
            map.maps[pointY][xr].Exploding();
            if(map.maps[pointY][xr].getType() == 2){
                for(int i = 0 ; i < map.walls.size();i++){
                    if(map.walls.get(i).pointX == xr && map.walls.get(i).pointY == pointY){

                        map.walls.get(i).tograss();
                    }
                }
            }
        }
        if (up) {
            flames.add(new Flame(pointX, yu, Sprite.explosion_vertical_top_last, 5));
            map.maps[yu][pointX].Exploding();
            if(map.maps[yu][pointX].getType() == 2){
                for(int i = 0 ; i < map.walls.size();i++){
                    if(map.walls.get(i).pointX == pointX && map.walls.get(i).pointY == yu){
                        map.walls.get(i).tograss();
                    }
                }
            }
        }
        if (down) {
            flames.add(new Flame(pointX, yd, Sprite.explosion_vertical_down_last, 6));
            map.maps[yd][pointX].Exploding();
            if(map.maps[yd][pointX].getType() == 2){
                for(int i = 0 ; i < map.walls.size();i++){
                    if(map.walls.get(i).pointX == pointX && map.walls.get(i).pointY == yd){
                        map.walls.get(i).tograss();
                    }
                }
            }
        }

    }

    public boolean check(int x, int y) {
        for (int i = 0; i < map.walls.size(); i++) {
            if (x == map.walls.get(i).pointX && y == map.walls.get(i).pointY) {
                return false;
            }
        }
        return true;
    }

    public void meetB(int x, int y) {
        if (map.maps[y][x].getType() == 2) {
            for (int i = 0; i < map.walls.size(); i++) {
                if (map.walls.get(i).pointX == x && map.walls.get(i).pointY == y) {
                    Entity obj = map.walls.get(i);
                    Brick current_brick = (Brick)obj;
                    current_brick.broken = true;
                    map.walls.remove(obj);
                    map.stillObjects.remove(obj);
                    Entity newGrass = new Grass(x, y, Sprite.grass);
                    map.stillObjects.add(newGrass);
                }
            }
        } else if (map.maps[y][x].getType() == 5) {
            for (int i = 0; i < map.walls.size(); i++) {
                if (map.walls.get(i).pointX == x && map.walls.get(i).pointY == y) {
                    Entity obj = map.walls.get(i);
                    Entity newGrass = new Grass(x, y, Sprite.grass);
                    map.stillObjects.add(newGrass);
                    FPBrick current_brick = (FPBrick) obj;
                    current_brick.broken = true;
                    FlamesPU newPU = current_brick.getPowerup();
                    map.powerUps.add(newPU);
                    map.walls.remove(obj);
                    map.stillObjects.remove(obj);
                }
            }
        }
        else if(map.maps[y][x].getType() == 4){
            for (int i = 0; i < map.walls.size(); i++) {
                if (map.walls.get(i).pointX == x && map.walls.get(i).pointY == y) {
                    Entity obj = map.walls.get(i);
                    Entity newGrass = new Grass(x, y, Sprite.grass);
                    map.stillObjects.add(newGrass);
                    BPBrick current_brick = (BPBrick)obj;
                    current_brick.broken = true;
                    BombsPU newPU = current_brick.getPowerup();
                    map.powerUps.add(newPU);
                    map.walls.remove(obj);
                    map.stillObjects.remove(obj);


                }
            }
        }else if(map.maps[y][x].getType() == 6){
            for (int i = 0; i < map.walls.size(); i++) {
                if (map.walls.get(i).pointX == x && map.walls.get(i).pointY == y) {

                    Entity obj = map.walls.get(i);;
                    PortalBrick current_brick = (PortalBrick) obj;
                    Portal newPort = current_brick.getPortal();
                    current_brick.broken = true;
                    map.stillObjects.add(newPort);
                    map.bricks.add(newPort);
                    map.walls.add(newPort);
                    map.walls.remove(obj);
                    map.stillObjects.remove(obj);


                }
            }
        }
    }

    @Override
    public void render(GraphicsContext gc) {
        super.render(gc);

    }

    @Override
    public void update() {

    }
}
