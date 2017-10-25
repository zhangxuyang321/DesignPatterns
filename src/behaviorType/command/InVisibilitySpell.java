package behaviorType.command;

public class InVisibilitySpell extends Command {

    private Target target;

    @Override
    public void execute(Target tag) {
        tag.setVisibility(Visibility.INVISIBLE);
        this.target = target;
    }

    @Override
    public void unDo() {
        if (target != null) {
            target.setVisibility(Visibility.VISIBLE);
        }
    }

    @Override
    public void reDo() {
        if (target != null) {
            target.setVisibility(Visibility.INVISIBLE);
        }
    }

    @Override
    public String toString() {
        return "Invisibility spell";
    }
}
