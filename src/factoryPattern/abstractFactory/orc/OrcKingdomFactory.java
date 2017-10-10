package factoryPattern.abstractFactory.orc;

import factoryPattern.abstractFactory.Army;
import factoryPattern.abstractFactory.Castle;
import factoryPattern.abstractFactory.King;
import factoryPattern.abstractFactory.KingdomFactory;
import factoryPattern.abstractFactory.elf.ElfArmy;
import factoryPattern.abstractFactory.elf.ElfCastle;
import factoryPattern.abstractFactory.elf.ElfKing;

public class OrcKingdomFactory implements KingdomFactory {
    @Override
    public King createKing() {
        return new OrcKing();
    }

    @Override
    public Castle createCastle() {
        return new OrcCastle();
    }

    @Override
    public Army createArmy() {
        return new OrcArmy();
    }
}
