package createType.prototype.orc;

import createType.prototype.Mage;

public class OrcMage extends Mage{
    @Override
    protected Mage clone() throws CloneNotSupportedException {
        return new OrcMage();
    }

    @Override
    public String toString() {
        return "orc mage";
    }
}
