package behaviorType.command;

public class CommandTest {
    public static void main(String[] args) {
        Wizard wizard = new Wizard();
        Goblin goblin = new Goblin();

        goblin.printStatus();

        System.out.println("---------------");

        wizard.castSpell(new ShrinkSpell(), goblin);
        goblin.printStatus();

        System.out.println("---------------");

        wizard.castSpell(new InVisibilitySpell(), goblin);
        goblin.printStatus();

        System.out.println("---------------");

        wizard.undoLastSpell();
        goblin.printStatus();

        System.out.println("---------------");

        wizard.undoLastSpell();
        goblin.printStatus();

        System.out.println("---------------");

        wizard.redoLastSpell();
        goblin.printStatus();

        System.out.println("---------------");

        wizard.redoLastSpell();
        goblin.printStatus();
    }
}
