package structureType.decorator;

public class DecoratorTest {
    public static void main(String[] args) {
        Troll troll = new SimpleTroll();
        troll.attack();
        troll.fleeBattle();

        System.out.println("---------------------");

        troll = new ClubbedTroll(troll);
        troll.attack();
        troll.fleeBattle();
    }
}
