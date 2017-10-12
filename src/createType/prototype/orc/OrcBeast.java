package createType.prototype.orc;

import createType.prototype.Beast;

public class OrcBeast extends Beast{
    @Override
    protected Beast clone() throws CloneNotSupportedException {
        return new OrcBeast();
    }

    @Override
    public String toString() {
        return "Orc eagle";
    }
}
