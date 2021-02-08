package Immutable;


public class Position{
    private int x = 0;
    private int y = 0;

    /**
     * All values are created in the constructor and they cannot be changed.
     * They may only be read.
     * @param x
     */
    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public String getPosition(){
        return "x: " + this.x + "\ty:" + this.y;
    }
}