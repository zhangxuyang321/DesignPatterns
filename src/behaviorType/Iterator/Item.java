package behaviorType.Iterator;

public class Item {
    private ItemType type;
    private String name;

    public Item(ItemType type, String name) {
        this.setType(type);
        this.name = name;
    }


    public void setType(ItemType type) {
        this.type = type;
    }

    public ItemType getType() {
        return type;
    }

    @Override
    public String toString() {
        return name;
    }
}
