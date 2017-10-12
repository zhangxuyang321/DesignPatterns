package createType.prototype.elf;

import createType.prototype.Mage;

public class ElfMage extends Mage{
    @Override
    protected Mage clone() throws CloneNotSupportedException {
        return new ElfMage();
    }

    @Override
    public String toString() {
        return "elf mage";
    }
}
