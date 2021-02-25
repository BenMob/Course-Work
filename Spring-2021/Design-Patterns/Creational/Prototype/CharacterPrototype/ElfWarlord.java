package CharacterPrototype;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * ElfWarlord
 *
 */
public class ElfWarlord extends Warlord {

  private List<String> cleanedPlaces;
  
  public ElfWarlord() {
    this.cleanedPlaces = new ArrayList<String>();
  }

      public void addPlace(String p){
        cleanedPlaces.add("<Elf:"+p+">");
    }

  @Override
  public ElfWarlord clone() throws CloneNotSupportedException {
      ElfWarlord copyme = (ElfWarlord)super.clone();
      copyme.cleanedPlaces = this.cleanedPlaces;
    return copyme;
  }

  @Override
  public String toString() {
    return "Elven warlord cleaned " + cleanedPlaces;
  }

}
