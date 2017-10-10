package factoryPattern.abstractFactory.elf;

import factoryPattern.abstractFactory.King;

public class ElfKing implements King{

    @Override
    public String getDescription() {
        return "this is Elf king";
    }
}
