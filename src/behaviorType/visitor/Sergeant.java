package behaviorType.visitor;

public class Sergeant extends Unit {
    public Sergeant(Unit... children) {
        super(children);
    }

    @Override
    public void accept(UnitVisitor unitVisitor) {
        unitVisitor.visitSergeant(this);
        super.accept(unitVisitor);
    }

    @Override
    public String toString() {
        return "Sergeant";
    }
}
