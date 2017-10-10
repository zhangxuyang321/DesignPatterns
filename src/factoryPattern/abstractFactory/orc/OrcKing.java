package factoryPattern.abstractFactory.orc;

import factoryPattern.abstractFactory.King;

public class OrcKing implements King{

    @Override
    public String getDescription() {
        return "this is Orc king";
    }
}
