package createType.prototype.elf;

import createType.prototype.Warlord;

public class ElfWarlord extends Warlord {
    @Override
    protected Warlord clone() throws CloneNotSupportedException {
        return new ElfWarlord();
    }

    @Override
    public String toString() {
        return "elf warlord";
    }
}
