package Map;

public class Tile {
    int type;
    public boolean exploding ;

     Tile(int type, boolean exploding){
        this.type = type;
        this.exploding = false;
    }

    public int getType() {
        return type;
    }

    public void Exploding(){
        exploding = true;
    }

    public void notExploding(){
        exploding = false;
    }


}
