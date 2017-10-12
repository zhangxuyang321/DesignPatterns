package createType.factoryPattern.abstractFactory.orc;

import createType.factoryPattern.abstractFactory.Army;

public class OrcArmy implements Army{
    @Override
    public String getDescription() {
        return "this is Orc Army";
    }
}
