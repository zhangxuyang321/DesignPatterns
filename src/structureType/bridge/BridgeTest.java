package structureType.bridge;

public class BridgeTest {
    public static void main(String[] args) {
        System.out.println("The knight receives an enchanted sword.");

        Sword sword = new Sword(new FlyingEnchantment());
        sword.wield();
        sword.swing();
        sword.unWield();

        System.out.println("The valkyrie receives an enchanted hammer.");

        Hammer hammer = new Hammer(new SoulEatingEnchantment());
        hammer.wield();
        hammer.swing();
        hammer.unWield();
    }
}
