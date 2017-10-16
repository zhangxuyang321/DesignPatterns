package structureType.facade;

public class DwarvenGoldDigger extends DwarvesMineWorker {
    @Override
    public void work() {
        System.out.println(name() + "digs for gold.");
    }

    @Override
    protected String name() {
        return "Dwarf gold digger";
    }
}
