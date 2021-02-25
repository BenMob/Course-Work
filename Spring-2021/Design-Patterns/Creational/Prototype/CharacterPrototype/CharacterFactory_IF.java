package CharacterPrototype;

/**
 * 
 * Interface for the factory class.
 * 
 */
public interface CharacterFactory_IF {

  Mage createMage();

  Warlord createWarlord();

  Beast createBeast();

}
