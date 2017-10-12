package createType.prototype;

public abstract class Prototype implements Cloneable {
    @Override
    protected abstract Object clone() throws CloneNotSupportedException;
}
