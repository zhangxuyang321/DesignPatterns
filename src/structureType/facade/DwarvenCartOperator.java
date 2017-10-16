package structureType.facade;

public class DwarvenCartOperator extends DwarvesMineWorker{
    @Override
    public void work() {
        System.out.println(name() + "moves gold chunks out of the mine.");
    }

    @Override
    protected String name() {
        return "Dwarf cart operator";
    }
}
