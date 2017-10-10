package factoryPattern.abstractFactory.elf;

import factoryPattern.abstractFactory.Castle;

public class ElfCastle implements Castle {
    @Override
    public String getDescription() {
        return "this is elf Castle";
    }
}
