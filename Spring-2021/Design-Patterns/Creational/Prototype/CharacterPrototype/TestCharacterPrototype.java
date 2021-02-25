package CharacterPrototype;

/**
 * 
 * avoid the inherent cost of creating a new
 * object in the standard way (e.g., using the 'new' keyword)
 * 
 */
public class TestCharacterPrototype {

  /**
   * Program entry point
   * 
   * @param args command line args
   */
  public static void main(String[] args) {
    CharacterFactory_IF factory;
    Mage mage;
    Warlord warlord;
    Beast beast;

    factory = new ElfCharacter_Factory();
    mage = factory.createMage();
    mage.addPlace("San Diego");
    warlord = factory.createWarlord();
    warlord.addPlace("San Diego");
    beast = factory.createBeast();
    beast.addPlace("San Diego");
    System.out.println(mage.toString());
    System.out.println(warlord.toString());
    System.out.println(beast.toString());

    mage = factory.createMage();
    mage.addPlace("Los Angles");
    warlord = factory.createWarlord();
    warlord.addPlace("Los Angles");
    beast = factory.createBeast();
    beast.addPlace("Los Angles");
    System.out.println(mage.toString());
    System.out.println(warlord.toString());
    System.out.println(beast.toString());
    
    System.out.println("======================================");
    factory = new OrcCharacter_Factory();
    mage = factory.createMage();
    mage.addPlace("Los Angles");
    warlord = factory.createWarlord();
    warlord.addPlace("Los Angles");
    beast = factory.createBeast();
    beast.addPlace("Los Angles");
    System.out.println(mage.toString());
    System.out.println(warlord.toString());
    System.out.println(beast.toString());

    mage = factory.createMage();
    mage.addPlace("San Diego");
    warlord = factory.createWarlord();
    warlord.addPlace("San Diego");
    beast = factory.createBeast();
    beast.addPlace("San Diego");
    System.out.println(mage.toString());
    System.out.println(warlord.toString());
    System.out.println(beast.toString());
  }
}
