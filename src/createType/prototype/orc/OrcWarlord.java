package createType.prototype.orc;

import createType.prototype.Warlord;

public class OrcWarlord extends Warlord {
    @Override
    protected Warlord clone() throws CloneNotSupportedException {
        return new OrcWarlord();
    }

    @Override
    public String toString() {
        return "orc warlord";
    }
}
