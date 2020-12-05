package Map;

import Entities.*;
import Sprites.Sprite;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Map {
    private static final int WIDTH = 24;
    private static final int HEIGHT = 16;
    public static final int WALL = 0;
    public static final int GRASS = 1;
    public static final int BRICK = 2;
    public static final int BLANK = 3;
    public int[][] maps = new int[HEIGHT][WIDTH];
    public List<Entity> entities = new ArrayList<>();
    public List<Entity> stillObjects = new ArrayList<>();
    public List<Entity> walls = new ArrayList<>();
    private int time = 200;
    private int frame = 12000;


    public void readMapFromFile(String path) throws IOException {
        File map = new File(path);
        FileReader fr=new FileReader(map);
        BufferedReader br=new BufferedReader(fr);
        Scanner sc = new Scanner(br);
        while (sc.hasNextLine()){
            for(int i = 0 ; i < HEIGHT ;i++){
                String str = sc.nextLine();
                for(int j = 0 ; j < WIDTH;j++){
                    maps[i][j] = Character.getNumericValue(str.charAt(j));
                }
            }

        }

    }

    public void createMap(String path) throws FileNotFoundException {
        try {
            readMapFromFile(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                Entity object = null;
                if(maps[i][j] == WALL){
                    object = new Wall(j, i, Sprite.wall);
                    walls.add(object);
                }
                else if(maps[i][j] == GRASS){
                    object = new Grass(j, i,Sprite.grass);
                }
                else if(maps[i][j] == BRICK){
                    object = new Brick(j, i,Sprite.brick);
                    walls.add(object);
                }
                else if(maps[i][j] == BLANK){
                    object = new Blank(j, i,Sprite.blank);
                    walls.add(object);
                }

                stillObjects.add(object);
            }
        }
    }

    public static int getWIDTH() {
        return WIDTH;
    }

    public static int getHEIGHT() {
        return HEIGHT;
    }

    public void update(){
        if(frame > 0){
            frame--;
            if(frame %60 == 0){
                time--;
            }
        }
    }

    public String getTime(){
        String res = "" + this.time;
        return res;
    }
}
