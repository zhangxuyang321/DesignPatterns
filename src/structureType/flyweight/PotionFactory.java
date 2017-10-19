package structureType.flyweight;

import java.util.EnumMap;
import java.util.Map;

public class PotionFactory {
    private final Map<PotionType, Potion> map;

    public PotionFactory() {
        map = new EnumMap<PotionType, Potion>(PotionType.class);
    }

    Potion createPotion(PotionType potionType) {
        Potion potion = map.get(potionType);
        if (null == potion) {
            switch (potionType) {
                case POISON:
                    potion = new PoisonPotion();
                    map.put(potionType, potion);
                    break;
                case HEALING:
                    potion = new HealingPotion();
                    map.put(potionType, potion);
                    break;
                case STRENGTH:
                    potion = new StrengthPotion();
                    map.put(potionType, potion);
                    break;
                case HOLY_WATER:
                    potion = new HolyWaterPotion();
                    map.put(potionType, potion);
                    break;
                case INVISIBILITY:
                    potion = new InvisibilityPotion();
                    map.put(potionType, potion);
                    break;
                default:
                    break;
            }
        }
        return potion;
    }
}
