package createType.prototype.elf;

import createType.prototype.Beast;

public class ElfBeast extends Beast{
    @Override
    protected Beast clone() throws CloneNotSupportedException {
        return new ElfBeast();
    }

    @Override
    public String toString() {
        return "Elven eagle";
    }
}
