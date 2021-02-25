package CharacterPrototype;

/**
 * 
 * Concrete factory class.
 * 
 */
public class ElfCharacter_Factory implements CharacterFactory_IF {

  private Mage mage_prototype;
  private Warlord warlord_prototype;
  private Beast beast_prototype;

  /**
   * Constructor
   */
  public ElfCharacter_Factory() {
    this.mage_prototype = new ElfMage();
    this.warlord_prototype = new ElfWarlord();
    this.beast_prototype = new ElfBeast();
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
