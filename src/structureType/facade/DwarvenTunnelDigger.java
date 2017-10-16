package structureType.facade;

public class DwarvenTunnelDigger extends DwarvesMineWorker {
    @Override
    public void work() {
        System.out.println(name() + "creates another promising tunnel.");
    }

    @Override
    protected String name() {
        return "Dwarven tunnel digger";
    }
}
