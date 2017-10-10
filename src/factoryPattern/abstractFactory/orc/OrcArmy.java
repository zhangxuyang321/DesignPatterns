package factoryPattern.abstractFactory.orc;

import factoryPattern.abstractFactory.Army;

public class OrcArmy implements Army{
    @Override
    public String getDescription() {
        return "this is Orc Army";
    }
}
