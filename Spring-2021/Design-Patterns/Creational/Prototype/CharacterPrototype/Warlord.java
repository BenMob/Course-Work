package CharacterPrototype;

/**
 * 
 * Warlord
 *
 */
public abstract class Warlord implements CharacterPrototype_IF {

    public abstract void addPlace(String p);
    @Override
  public Object clone() throws CloneNotSupportedException {
      return super.clone();
  }

}
