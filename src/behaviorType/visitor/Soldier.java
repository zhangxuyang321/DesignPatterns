package behaviorType.visitor;

public class Soldier extends Unit {
    public Soldier(Unit... children) {
        super(children);
    }

    @Override
    public void accept(UnitVisitor unitVisitor) {
        unitVisitor.visitSoldier(this);
        super.accept(unitVisitor);
    }

    @Override
    public String toString() {
        return "Soldier";
    }
}
