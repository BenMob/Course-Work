package CharacterPrototype;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * ElfBeast
 *
 */
public class ElfBeast extends Beast {
  
  private List<String> protectedPlaces;

  public ElfBeast() {
    this.protectedPlaces = new ArrayList<String>();
  }

    public void addPlace(String p){
        protectedPlaces.add("<Elf:"+p+">");
    }

  @Override
  public ElfBeast clone() throws CloneNotSupportedException {
      ElfBeast copyme = (ElfBeast)super.clone();
      copyme.protectedPlaces = this.protectedPlaces;
    return copyme;
  }

  @Override
  public String toString() {
    return "Elven eagle protected " + protectedPlaces;
  }

}
