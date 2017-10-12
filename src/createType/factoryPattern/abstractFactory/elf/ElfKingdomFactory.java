package createType.factoryPattern.abstractFactory.elf;

import createType.factoryPattern.abstractFactory.Army;
import createType.factoryPattern.abstractFactory.Castle;
import createType.factoryPattern.abstractFactory.King;
import createType.factoryPattern.abstractFactory.KingdomFactory;

public class ElfKingdomFactory implements KingdomFactory {
    @Override
    public King createKing() {
        return new ElfKing();
    }

    @Override
    public Castle createCastle() {
        return new ElfCastle();
    }

    @Override
    public Army createArmy() {
        return new ElfArmy();
    }
}
