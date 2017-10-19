package structureType.flyweight;

public class PoisonPotion implements Potion {
    @Override
    public void drink() {
        System.out.println("Urgh! This is poisonous");
    }
}
