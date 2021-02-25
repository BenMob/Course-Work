package CharacterPrototype;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * OrcBeast
 *
 */
public class OrcBeast extends Beast {
  
  private List<String> attackedPlaces;

  public OrcBeast() {
    this.attackedPlaces = new ArrayList<String>();
  }
  
    public void addPlace(String p){
        attackedPlaces.add("<Orc:"+p+">");
    }

  @Override
  public OrcBeast clone() throws CloneNotSupportedException {
      OrcBeast copyme = (OrcBeast)super.clone();
      copyme.attackedPlaces = this.attackedPlaces;
    return copyme;
  }

  @Override
  public String toString() {
    return "Orcish wolf attacked " + attackedPlaces;
  }
  

}
