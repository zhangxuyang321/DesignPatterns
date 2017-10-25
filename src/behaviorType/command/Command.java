package behaviorType.command;

public abstract class Command {
    public abstract void execute(Target tag);

    public abstract void unDo();

    public abstract void reDo();

    @Override
    public abstract String toString();
}
