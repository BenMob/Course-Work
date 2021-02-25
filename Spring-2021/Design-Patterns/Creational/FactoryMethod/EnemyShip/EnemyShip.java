package FactoryMethod;

public abstract class EnemyShip{
    private String name;
    private double amtDamage;

    public String getName(){return this.name;}
    public void setName(String name){this.name = name;}
    public double getDamage(){return this.amtDamage;}
    public void setDamage(double amtDamage){this.amtDamage = amtDamage;}
    public void followHeroShip(){
        System.out.println(this.getName() + " is follwing the hero");
    }
    public void displayEnemyShip(){
        System.out.println(this.getName() + " is on the screen");
    }

    public void enemyShipShoots(){
        System.out.println(this.getName() + " is shooting");
    }

}