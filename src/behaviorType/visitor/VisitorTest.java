package behaviorType.visitor;

public class VisitorTest {
    public static void main(String[] args) {
        Commander commander = new Commander(new Sergeant(new Soldier(), new Soldier(), new Soldier(),
                new Sergeant(new Soldier(), new Soldier(), new Soldier())));
        commander.accept(new SoldierVisitor());
        commander.accept(new SergeatVisitor());
        commander.accept(new CommanderVisitor());
    }
}
