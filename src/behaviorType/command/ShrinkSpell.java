package behaviorType.command;

public class ShrinkSpell extends Command {

    private Size oldSize;
    private Target target;

    @Override
    public void execute(Target tag) {
        oldSize = tag.getSize();
        tag.setSize(Size.SMALL);
        this.target = tag;
    }

    @Override
    public void unDo() {
        if (oldSize != null && target != null) {
            Size temp = target.getSize();
            target.setSize(oldSize);
            oldSize = temp;
        }
    }

    @Override
    public void reDo() {
        unDo();
    }

    @Override
    public String toString() {
        return "Shrink spell";
    }
}
