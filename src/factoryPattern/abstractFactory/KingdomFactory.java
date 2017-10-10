package factoryPattern.abstractFactory;

public interface KingdomFactory {
    King createKing();

    Castle createCastle();

    Army createArmy();
}
