package FactoryMethod;

import java.util.Scanner;

public class EnemyShipTesting{

    public static void doStuffEnemy(EnemyShip enemyShip){
        enemyShip.displayEnemyShip();
        enemyShip.followHeroShip();
        enemyShip.enemyShipShoots();
    }

    public static void main(String[] args){
        // EnemyShip ufoEnenmyShip = new UFOEnemyShip();
        // doStuffEnemy(ufoEnenmyShip);
        /**
         * Problem: This is not dynamic
         * we would need to use a bunch of if statements to make it
         * dynamic but we do not want that either.
         *
         * So let's use Factory Method to make it dynamic without using if statements.
         */
        EnemyShipFactory shipFactory = new EnemyShipFactory();  // The Ship Factory
        Scanner input = new Scanner(System.in);
        System.out.print("What type of Ship ? (U / R / B): ");
        EnemyShip theEnemy = null;

        if(input.hasNextLine()){
            String typeOfShip = input.nextLine();
            theEnemy = shipFactory.makeEnemyShip(typeOfShip);
        }

        if(theEnemy != null){
            doStuffEnemy(theEnemy);
        }

    }
}