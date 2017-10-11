package builderPattern;

public class BuilderPatternTest {
    public static void main(String[] args) {
        Hero mage = new Hero.Builder(Profession.MAGE, "Riobard")
                    .withHairType(HairType.CURLY)
                    .withHairColor(HairColor.BROWN)
                    .withArmor(Armor.CLOTHES)
                    .withWapon(Weapon.BOW)
                    .build();
    }
}
