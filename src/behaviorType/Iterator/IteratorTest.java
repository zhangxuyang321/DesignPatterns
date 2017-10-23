package behaviorType.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        TreasureChest chest = new TreasureChest();
        ItemIterator iterator = chest.iterator(ItemType.RING);
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }

        System.out.println("--------------------------------");

        ItemIterator iterator1 = chest.iterator(ItemType.POTION);
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next().toString());
        }

        System.out.println("--------------------------------");

        ItemIterator weaponIterator = chest.iterator(ItemType.WEAPON);
        while (weaponIterator.hasNext()) {
            System.out.println(weaponIterator.next().toString());
        }

        System.out.println("--------------------------------");

        ItemIterator it = chest.iterator(ItemType.ANY);
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }

    }
}