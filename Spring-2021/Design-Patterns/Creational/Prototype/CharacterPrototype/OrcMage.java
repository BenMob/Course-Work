package CharacterPrototype;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * OrcMage
 *
 */
public class OrcMage extends Mage {

  private List<String> attackedPlaces;

  public OrcMage() {
    this.attackedPlaces = new ArrayList<String>();
  }
  
    public void addPlace(String p){
        attackedPlaces.add("<Orc:"+p+">");
    }

  @Override
  public OrcMage clone() throws CloneNotSupportedException {
      OrcMage copyme = (OrcMage)super.clone();
      copyme.attackedPlaces = this.attackedPlaces;
    return copyme;
  }

  @Override
  public String toString() {
    return "Orcish mage attacked " + attackedPlaces;
  }

}
