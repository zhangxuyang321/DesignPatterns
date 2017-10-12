package createType.factoryPattern.abstractFactory.orc;

import createType.factoryPattern.abstractFactory.Castle;

public class OrcCastle implements Castle {
    @Override
    public String getDescription() {
        return "this is Orc Castle";
    }
}
