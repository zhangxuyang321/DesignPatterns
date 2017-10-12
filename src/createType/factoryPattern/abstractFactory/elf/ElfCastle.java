package createType.factoryPattern.abstractFactory.elf;

import createType.factoryPattern.abstractFactory.Castle;

public class ElfCastle implements Castle {
    @Override
    public String getDescription() {
        return "this is elf Castle";
    }
}
