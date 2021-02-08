package Immutable;


public class Test{

    public static void main(String[] args){
        Position p = new Position(10, 15);  // Once created this cannot be changed.

        System.out.println(p.getX());
        System.out.println(p.getY());
        System.out.println(p.getPosition());
    }
}