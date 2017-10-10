package factoryPattern.abstractFactory.orc;

import factoryPattern.abstractFactory.Castle;

public class OrcCastle implements Castle {
    @Override
    public String getDescription() {
        return "this is Orc Castle";
    }
}
