package structureType.facade;

import java.util.ArrayList;
import java.util.List;

public class DwarvenGoldmineFacade {
    private List<DwarvesMineWorker> workers;

    public DwarvenGoldmineFacade() {
        workers = new ArrayList<>();
        workers.add(new DwarvenCartOperator());
        workers.add(new DwarvenGoldDigger());
        workers.add(new DwarvenTunnelDigger());
    }

    public void startNewDay() {
        makeActions(workers, DwarvesMineWorker.Action.WAKE_UP, DwarvesMineWorker.Action.GO_TO_MINE);
    }

    public void digOutGold() {
        makeActions(workers, DwarvesMineWorker.Action.WORK);
    }

    public void endDay() {
        makeActions(workers, DwarvesMineWorker.Action.GO_HOME, DwarvesMineWorker.Action.GO_TO_SLEEP);
    }

    public void makeActions(List<DwarvesMineWorker> workers, DwarvesMineWorker.Action... actions) {
        for (DwarvesMineWorker worker : workers) {
            worker.action(actions);
        }
    }

}
