package createType.factoryPattern.abstractFactory.orc;

import createType.factoryPattern.abstractFactory.Army;
import createType.factoryPattern.abstractFactory.Castle;
import createType.factoryPattern.abstractFactory.King;
import createType.factoryPattern.abstractFactory.KingdomFactory;

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
