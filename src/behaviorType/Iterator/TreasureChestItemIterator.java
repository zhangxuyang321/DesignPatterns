package behaviorType.Iterator;

import java.util.List;

public class TreasureChestItemIterator implements ItemIterator {
    private TreasureChest chest;
    private ItemType type;
    private int idx;

    public TreasureChestItemIterator(TreasureChest treasureChest, ItemType itemType) {
        this.chest = treasureChest;
        this.type = itemType;
        idx = -1;
    }

    @Override
    public boolean hasNext() {
        return findNextIdx() != -1;
    }


    @Override
    public Item next() {
        idx = findNextIdx();
        if (-1 != idx) {
            return chest.getItems().get(idx);
        } else {
            return null;
        }
    }

    private int findNextIdx() {
        List<Item> items = chest.getItems();
        boolean found = false;
        int tempIdx = idx;
        while (!found) {
            tempIdx++;
            if (tempIdx >= items.size()) {
                tempIdx = -1;
                break;
            }

            if (type.equals(ItemType.ANY) || items.get(tempIdx).getType().equals(type)) {
                break;
            }
        }
        return tempIdx;
    }
}
