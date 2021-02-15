package FactoryMethod;

/**
 * This way if anything needs to be changed it can all be done in here
 */

public class EnemyShipFactory {

    public EnemyShip makeEnemyShip(String newShipType) {
        EnemyShip newShip = null;
        final String UFO = "U";
        final String ROCKET = "R";
        final String BIG = "B";

        if (newShipType.equals(UFO)) {
            return new UFOEnemyShip();

        } else if (newShipType.equals(ROCKET)) {
            return new RocketEnemyShip();

        }else if (newShipType.equals(BIG)) {
            return new BigUFOEnemyShip();
        }else{
            return null;
        }
    }
}