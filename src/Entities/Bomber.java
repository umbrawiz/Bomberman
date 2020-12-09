package Entities;

import Map.Map;
import Sprites.Sprite;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;

import java.util.ArrayList;
import java.util.List;

public class Bomber extends Entity {
    public List<Bomb> bombs = new ArrayList<>();
    private final int movement_speed = 10;
    private Status current_status;
    public boolean alive = true;
    private int dTime = 90;
    public int bombsPU= 1;
    public int power = 0;

    public Bomber(int x, int y, Image img) {
        super(x, y, img);
        this.current_status = Status.Left;
    }

    public void keyPressed(javafx.scene.input.KeyEvent e, Map map) {
        if (alive) {
            KeyCode key = e.getCode();

            if (key == KeyCode.LEFT) {
                if (current_status == Status.Left) {
                    current_status = Status.Left1;
                    this.image = Sprite.player_left_1;
                } else if (current_status == Status.Left1) {
                    current_status = Status.Left2;
                    this.image = Sprite.player_left_2;
                } else {
                    current_status = Status.Left;
                    this.image = Sprite.player_left;
                }
                if (collisionB(bombs, 2) || collision(map.walls, 2)) {
                    if (smartMovement(map, 2) == 3) {
                        this.posY += 5;
                        this.pointY = this.posY / SIZE;
                        return;
                    } else if (smartMovement(map, 2) == 4) {
                        this.posY -= 5;
                        this.pointY = this.posY / SIZE;
                        return;
                    } else {
                        return;
                    }
                }
                this.posX -= movement_speed;
                this.pointX = this.posX / SIZE;
            }

            if (key == KeyCode.RIGHT) {
                if (current_status == Status.Right) {
                    current_status = Status.Right1;
                    this.image = Sprite.player_right_1;
                } else if (current_status == Status.Right1) {
                    current_status = Status.Right2;
                    this.image = Sprite.player_right_2;
                } else {
                    current_status = Status.Right;
                    this.image = Sprite.player_right;
                }
                if (collisionB(bombs, 1) || collision(map.walls, 1)) {
                    if (smartMovement(map, 1) == 1) {
                        this.posY += 5;
                        this.pointY = this.posY / SIZE;
                        return;
                    } else if (smartMovement(map, 1) == 2) {
                        this.posY -= 5;
                        this.pointY = this.posY / SIZE;
                        return;
                    } else {
                        return;
                    }
                }
                this.posX += movement_speed;
                this.pointX = this.posX / SIZE;
            }

            if (key == KeyCode.UP) {
                if (current_status == Status.Up) {
                    current_status = Status.Up1;
                    this.image = Sprite.player_up_1;
                } else if (current_status == Status.Up1) {
                    current_status = Status.Up2;
                    this.image = Sprite.player_up_2;
                } else {
                    current_status = Status.Up;
                    this.image = Sprite.player_up;
                }
                if (collisionB(bombs, 3) || collision(map.walls, 3)) {
                    if (smartMovement(map, 3) == 5) {
                        this.posX += 5;
                        this.pointX = this.posX / SIZE;
                        return;
                    } else if (smartMovement(map, 3) == 6) {
                        this.posX -= 5;
                        this.pointX = this.posX / SIZE;
                        return;
                    } else {
                        return;
                    }
                }
                this.posY -= movement_speed;
                this.pointY = this.posY / SIZE;
            }

            if (key == KeyCode.DOWN) {
                if (current_status == Status.Down) {
                    current_status = Status.Down1;
                    this.image = Sprite.player_down_1;
                } else if (current_status == Status.Down1) {
                    current_status = Status.Down2;
                    this.image = Sprite.player_down_2;
                } else {
                    current_status = Status.Down;
                    this.image = Sprite.player_down;
                }
                if (collisionB(bombs, 4) || collision(map.walls, 4)) {
                    if (smartMovement(map, 4) == 7) {
                        this.posX += 5;
                        this.pointX = this.posX / SIZE;
                        return;
                    } else if (smartMovement(map, 4) == 8) {
                        this.posX -= 5;
                        this.pointX = this.posX / SIZE;
                        return;
                    } else {
                        return;
                    }
                }
                this.posY += movement_speed;
                this.pointY = this.posY / SIZE;
            }

            if (key == KeyCode.SPACE) {
                if (bombsPU > bombs.size() && checkB(posX / 50, posY / 50)) {
                    bombs.add(new Bomb(posX / 50, posY / 50, Sprite.bomb, map,power));
                }
            }
        }
    }

    public boolean checkB(int a, int b) {
        for (Bomb bomb : bombs) {
            if (a == bomb.pointX && b == bomb.pointY) {
                return false;
            }
        }
        return true;
    }

    public int smartMovement(Map map, int a) {
        switch (a) {
            case 1: //right
                for (int i = 0; i < map.walls.size(); i++) {
                    if (posY - map.walls.get(i).posY >= 30 && posY - map.walls.get(i).posY <= 45) {

                        return 1;
                    } else if (posY - map.walls.get(i).posY >= -45 && posY - map.walls.get(i).posY <= -30) {

                        return 2;
                    }
                }
                break;
            case 2: //left
                for (int i = 0; i < map.walls.size(); i++) {
                    if (posY - map.walls.get(i).posY >= 30 && posY - map.walls.get(i).posY <= 45) {
                        return 3;
                    } else if (posY - map.walls.get(i).posY >= -45 && posY - map.walls.get(i).posY <= -30) {
                        return 4;
                    }
                }
                break;
            case 3: // up
                for (int i = 0; i < map.walls.size(); i++) {
                    if (posX - map.walls.get(i).posX >= 30 && posX - map.walls.get(i).posX <= 45) {
                        return 5;
                    } else if (posX - map.walls.get(i).posX >= -35 && posX - map.walls.get(i).posX <= -25) {
                        return 6;
                    }
                }
                break;
            case 4: //down
                for (int i = 0; i < map.walls.size(); i++) {
                    if (posX - map.walls.get(i).posX >= 30 && posX - map.walls.get(i).posX <= 45) {
                        return 7;
                    } else if (posX - map.walls.get(i).posX >= -35 && posX - map.walls.get(i).posX <= -25) {
                        return 8;
                    }
                }
                break;
            default:
                return -1;
        }
        return -1;
    }

    public boolean collision(List<Entity> list, int a) {
        switch (a) {
            case 1: //right
                for (Entity entity : list) {
                    if (posX + 40 == entity.posX && checkLR(posY, entity.posY)) {
                        return true;
                    }
                }
                break;
            case 2: //left
                for (Entity entity : list) {
                    if (posX - 50 == entity.posX && checkLR(posY, entity.posY)) {
                        return true;
                    }
                }
                break;
            case 3: // up
                for (Entity entity : list) {
                    if (posY - 50 == entity.posY && checkUD(posX, entity.posX)) {
                        return true;
                    }
                }
                break;
            case 4: //down
                for (Entity entity : list) {
                    if (posY + 50 == entity.posY && checkUD(posX, entity.posX)) {
                        return true;
                    }
                }
                break;
            default:
                return false;
        }
        return false;
    }
    public boolean collisionB(List<Bomb> list, int a) {
        switch (a) {
            case 1: //right
                for (Bomb bomb : list) {
                    if (posX + 40 == bomb.posX && checkLR(posY, bomb.posY)) {
                        return true;
                    }
                }
                break;
            case 2: //left
                for (Bomb bomb : list) {
                    if (posX - 50 == bomb.posX && checkLR(posY, bomb.posY)) {
                        return true;
                    }
                }
                break;
            case 3: // up
                for (Bomb bomb : list) {
                    if (posY - 50 == bomb.posY && checkUD(posX, bomb.posX)) {
                        return true;
                    }
                }
                break;
            case 4: //down
                for (Bomb bomb : list) {
                    if (posY + 50 == bomb.posY && checkUD(posX, bomb.posX)) {
                        return true;
                    }
                }
                break;
            default:
                return false;
        }
        return false;
    }

    public boolean checkUD(int a, int b) {
        if (a > b && a < b + 50) {
            return true;
        }
        return a + 40 > b && a + 40 < b + 50;
    }

    public boolean checkLR(int a, int b) {
        if (a >= b && a < b + 50) {
            return true;
        }
        return a + 50 > b && a + 50 < b + 50;
    }

    public void alive(Map map){
        if(map.maps[pointY][pointX].exploding){
            alive = false;
            deadAnimation();
        }
        for(int i = 0 ; i < map.enemies.size();i++){
            if(pointX == map.enemies.get(i).getPointX() && pointY == map.enemies.get(i).getPointY() ){
                alive = false;
                deadAnimation();
            }
        }
    }

    public void deadAnimation(){
        this.image = Sprite.player_dead1;
        if(dTime > 0){
            dTime--;
            if(dTime % 30 == 0){
                update();
            }
        }

    }

    @Override
    public void update() {
        bombs.removeIf(i -> i.exploded);
        if (!alive) {
            if (image == Sprite.player_dead1) {
                image = Sprite.player_dead2;
            } else if (image == Sprite.player_dead2) {
                image = Sprite.player_dead3;
            }
        }

    }

    enum Status {
        Up, Up1, Up2, Down, Down1, Down2, Left, Left1, Left2, Right, Right1, Right2
    }
}
