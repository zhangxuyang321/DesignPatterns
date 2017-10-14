package structureType.decorator;

public class ClubbedTroll implements Troll{

    private Troll decorator;

    public ClubbedTroll(Troll decorator){
        this.decorator = decorator;
    }

    @Override
    public void attack() {
        decorator.attack();
        System.out.println("The troll swings at you with clue");
    }

    @Override
    public int getAttackPower() {
        return decorator.getAttackPower()+10;
    }

    @Override
    public void fleeBattle() {
        decorator.fleeBattle();
    }
}
