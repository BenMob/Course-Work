package CharacterPrototype;

import java.util.List;

/**
 * 
 * Beast
 *
 */
public abstract class Beast implements CharacterPrototype_IF {
    public abstract void addPlace(String p);

    @Override
  public Object clone() throws CloneNotSupportedException {
      return super.clone();
  }
}
