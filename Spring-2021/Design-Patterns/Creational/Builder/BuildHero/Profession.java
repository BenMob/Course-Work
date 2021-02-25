package BuildHero;

/**
 * 
 * Profession enumeration
 *
 */
public enum Profession {

  WARRIOR, THIEF, MAGE, PRIEST;

  @Override
  public String toString() {
    return name().toLowerCase();
  }
}
