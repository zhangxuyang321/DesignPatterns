package createType.factoryPattern.abstractFactory;

import createType.factoryPattern.abstractFactory.elf.ElfKingdomFactory;
import createType.factoryPattern.abstractFactory.orc.OrcKingdomFactory;

public class AbstractFactoryTest {

    private King king;
    private Castle castle;
    private Army army;


    public void createKingdom(KingdomFactory kingdomFactory) {
        setKing(kingdomFactory.createKing());
        setCastle(kingdomFactory.createCastle());
        setArmy(kingdomFactory.createArmy());
    }

    public King getKing() {
        return king;
    }

    public void setKing(King king) {
        this.king = king;
    }

    public Castle getCastle() {
        return castle;
    }

    public void setCastle(Castle castle) {
        this.castle = castle;
    }

    public Army getArmy() {
        return army;
    }

    public void setArmy(Army army) {
        this.army = army;
    }


    public static void main(String[] args) {
        AbstractFactoryTest test = new AbstractFactoryTest();
        System.out.println("精灵王国开始创建");
        test.createKingdom(new ElfKingdomFactory());
        System.out.println(test.getArmy().getDescription());
        System.out.println(test.getCastle().getDescription());
        System.out.println(test.getKing().getDescription());

        System.out.println("-------------------------");

        System.out.println("兽人王国开始创建");
        test.createKingdom(new OrcKingdomFactory());
        System.out.println(test.getArmy().getDescription());
        System.out.println(test.getCastle().getDescription());
        System.out.println(test.getKing().getDescription());
    }
}
