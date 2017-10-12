package createType.factoryPattern.abstractFactory.elf;

import createType.factoryPattern.abstractFactory.Army;

public class ElfArmy implements Army{
    @Override
    public String getDescription() {
        return "this is Elf Army";
    }
}
