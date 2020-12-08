package Map;

import Entities.*;
import Sprites.Sprite;
import com.sun.corba.se.impl.interceptors.PICurrent;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Map {
    public static final int WALL = 0;
    public static final int GRASS = 1;
    public static final int BRICK = 2;
    public static final int BLANK = 3;
    public static final int BombsPU = 4;
    private static final int WIDTH = 24;
    private static final int HEIGHT = 16;
    public Tile[][] maps = new Tile[HEIGHT][WIDTH];
    public List<Entity> grasses = new ArrayList<>();
    public List<Entity> entities = new ArrayList<>();
    public List<Entity> stillObjects = new ArrayList<>();
    public List<Entity> walls = new ArrayList<>();
    public List<Entity> bricks = new ArrayList<>();
    public List<Enemy> enemies = new ArrayList<>();
    private int time = 200;
    private int frame = 12000;
    public Bomber bomber = new Bomber(1, 2, Sprite.player_right);

    public void readMapFromFile(String path) throws IOException {
        File map = new File(path);
        FileReader fr = new FileReader(map);
        BufferedReader br = new BufferedReader(fr);
        Scanner sc = new Scanner(br);
        while (sc.hasNextLine()) {
            for (int i = 0; i < HEIGHT; i++) {
                String str = sc.nextLine();
                for (int j = 0; j < WIDTH; j++) {
                    maps[i][j] = new Tile(Character.getNumericValue(str.charAt(j)),false);
                }
            }

        }

    }

    public void createMap(String path) {
        try {
            readMapFromFile(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                Entity object = null;
                object = new Grass(j,i,Sprite.grass);
                grasses.add(object);
            }
        }

        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                Entity object = null;
                if (maps[i][j].getType() == WALL) {
                    object = new Wall(j, i, Sprite.wall);
                    walls.add(object);
                } else if (maps[i][j].getType() == GRASS) {
                    object = new Grass(j, i, Sprite.grass);
                } else if (maps[i][j].getType() == BRICK) {
                    object = new Brick(j, i, Sprite.brick);
                    walls.add(object);
                    bricks.add(object);
                } else if (maps[i][j].getType() == BLANK) {
                    object = new Blank(j, i, Sprite.blank);
                    walls.add(object);
                }else if (maps[i][j].getType() == BombsPU) {
                    BombsPU pu = new BombsPU(j,i,Sprite.powerup_bombs,bomber);
                    object = new BPBrick(j, i, Sprite.brick,pu);
                    walls.add(object);
                    bricks.add(object);
                }

                stillObjects.add(object);
            }
        }
    }

    public void update() {
        if (frame > 0) {
            frame--;
            if (frame % 60 == 0) {
                time--;
            }
        }
    }

    public void reset(){
        for (int i = 0 ; i < maps.length;i++){
            for (int j = 0 ; j < maps[i].length;j++){
                maps[i][j].notExploding();
            }
        }
    }

    public String getTime() {
        return "" + this.time;
    }
}
