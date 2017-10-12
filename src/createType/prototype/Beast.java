package createType.prototype;

public abstract class Beast extends Prototype {
    @Override
    protected abstract Beast clone() throws CloneNotSupportedException;
}
