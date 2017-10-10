package factoryPattern.abstractFactory.elf;

import factoryPattern.abstractFactory.Army;

public class ElfArmy implements Army{
    @Override
    public String getDescription() {
        return "this is Elf Army";
    }
}
