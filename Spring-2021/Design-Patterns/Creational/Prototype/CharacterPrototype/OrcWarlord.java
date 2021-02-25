package CharacterPrototype;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * OrcWarlord
 *
 */
public class OrcWarlord extends Warlord {

  private List<String> attackedPlaces;

  public OrcWarlord() {
    this.attackedPlaces = new ArrayList<String>();
  }
  
    public void addPlace(String p){
        attackedPlaces.add("<Orc:"+p+">");
    }

  @Override
  public OrcWarlord clone() throws CloneNotSupportedException {
      OrcWarlord copyme = (OrcWarlord)super.clone();
      copyme.attackedPlaces = this.attackedPlaces;
    return copyme;
  }

  @Override
  public String toString() {
    return "Orcish warlord attacked " + attackedPlaces;
  }

}
