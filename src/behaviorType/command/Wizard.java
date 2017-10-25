package behaviorType.command;

import java.util.Deque;
import java.util.LinkedList;

public class Wizard {
    private Deque<Command> undoStack = new LinkedList<>();
    private Deque<Command> redoStack = new LinkedList<>();

    public Wizard() {
    }

    public void castSpell(Command command, Target target) {
        System.out.println(this.toString() + "casts" + command.toString() + "at" + target.toString());
        command.execute(target);
        undoStack.offerLast(command);
    }

    public void undoLastSpell() {
        if (!undoStack.isEmpty()) {
            Command previousSpell = undoStack.pollLast();
            redoStack.offerLast(previousSpell);
            System.out.println(this.toString() + " undoes" + previousSpell);
            previousSpell.unDo();
        }
    }

    public void redoLastSpell() {
        if (!redoStack.isEmpty()) {
            Command previousSpell = redoStack.pollLast();
            undoStack.offerLast(previousSpell);
            System.out.println(this.toString() + "redoes" + previousSpell.toString());
            previousSpell.reDo();
        }
    }

    @Override
    public String toString() {
        return "Wizard";
    }
}
