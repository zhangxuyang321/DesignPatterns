package behaviorType.visitor;

public abstract class Unit {
    private Unit[] children;

    public Unit(Unit... children) {
        this.children = children;
    }

    public void accept(UnitVisitor unitVisitor) {
        for (Unit unit : children) {
            unit.accept(unitVisitor);
        }
    }
}
