/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuildHero;

/**
 *
 * @author sfan
 */
public class HeroBuilder {

    private final Profession profession;
    private final String name;
    private HairType hairType;
    private HairColor hairColor;
    private Armor armor;
    private Weapon weapon;

    /**
     * Constructor
     */
    public HeroBuilder(Profession profession, String name) {
      if (profession == null || name == null) {
        throw new IllegalArgumentException("profession and name can not be null");
      }
      this.profession = profession;
      this.name = name;
    }

    public HeroBuilder withHairType(HairType hairType) {
      this.hairType = hairType;
      return this;
    }

    public HeroBuilder withHairColor(HairColor hairColor) {
      this.hairColor = hairColor;
      return this;
    }

    public HeroBuilder withArmor(Armor armor) {
      this.armor = armor;
      return this;
    }

    public HeroBuilder withWeapon(Weapon weapon) {
      this.weapon = weapon;
      return this;
    }

    public Hero build() {
      return new Hero(this);
    }

    /**
     * @return the profession
     */
    public Profession getProfession() {
        return profession;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the hairType
     */
    public HairType getHairType() {
        return hairType;
    }

    /**
     * @return the hairColor
     */
    public HairColor getHairColor() {
        return hairColor;
    }

    /**
     * @return the armor
     */
    public Armor getArmor() {
        return armor;
    }

    /**
     * @return the weapon
     */
    public Weapon getWeapon() {
        return weapon;
    }
  }