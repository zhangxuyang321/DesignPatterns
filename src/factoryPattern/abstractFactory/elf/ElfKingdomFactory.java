package factoryPattern.abstractFactory.elf;

import factoryPattern.abstractFactory.Army;
import factoryPattern.abstractFactory.Castle;
import factoryPattern.abstractFactory.King;
import factoryPattern.abstractFactory.KingdomFactory;

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
