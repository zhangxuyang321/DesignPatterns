package behaviorType.visitor;

public class Commander extends Unit {
    public Commander(Unit... children) {
        super(children);
    }

    @Override
    public void accept(UnitVisitor unitVisitor) {
        unitVisitor.visitCommander(this);
        super.accept(unitVisitor);
    }

    @Override
    public String toString() {
        return "Commander";
    }
}
