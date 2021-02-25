package CharacterPrototype;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * ElfMage
 *
 */
public class ElfMage extends Mage {

  private List<String> helpedPlaces;
  
  public ElfMage() {
    this.helpedPlaces = new ArrayList<String>();
  }

      public void addPlace(String p){
        helpedPlaces.add("<Elf:"+p+">");
    }


  @Override
  public ElfMage clone() throws CloneNotSupportedException {
      ElfMage copyme = (ElfMage)super.clone();
      copyme.helpedPlaces = this.helpedPlaces;
    return copyme;
  }

  @Override
  public String toString() {
    return "Elven mage helped " + helpedPlaces;
  }

}
