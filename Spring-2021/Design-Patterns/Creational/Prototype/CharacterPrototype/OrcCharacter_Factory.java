package CharacterPrototype;

/**
 * 
 * Concrete factory class.
 * 
 */
public class OrcCharacter_Factory implements CharacterFactory_IF {

  private Mage mage_prototype;
  private Warlord warlord_prototype;
  private Beast beast_prototype;

  /**
   * Constructor
   */
  public OrcCharacter_Factory() {
    this.mage_prototype = new OrcMage();
    this.warlord_prototype = new OrcWarlord();
    this.beast_prototype = new OrcBeast();
  }

  /**
   * Create mage
   */
  public Mage createMage() {
    try {
      return (Mage)mage_prototype.clone();
    } catch (CloneNotSupportedException e) {
      return null;
    }
  }

  /**
   * Create warlord
   */
  public Warlord createWarlord() {
    try {
      return (Warlord)warlord_prototype.clone();
    } catch (CloneNotSupportedException e) {
      return null;
    }
  }

  /**
   * Create beast
   */
  public Beast createBeast() {
    try {
      return (Beast)beast_prototype.clone();
    } catch (CloneNotSupportedException e) {
      return null;
    }
  }

}
