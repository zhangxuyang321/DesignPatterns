package structureType.facade;

import createType.builderPattern.Weapon;

public abstract class DwarvesMineWorker {
    public void goToSleep() {
        System.out.println(name() + "goes to sleep.");
    }

    public void wakeUp() {
        System.out.println(name() + "wakes up.");
    }

    public void goHome() {
        System.out.println(name() + "goes home.");
    }

    public void goToMine() {
        System.out.println(name() + "goes to the mine");
    }

    public void action(Action action) {
        switch (action) {
            case GO_TO_SLEEP:
                goToSleep();
                break;
            case WAKE_UP:
                wakeUp();
                break;
            case GO_HOME:
                goHome();
                break;
            case GO_TO_MINE:
                goToMine();
                break;
            case WORK:
                work();
                break;
            default:
                System.out.println("Undefined action");
                break;
        }
    }

    public void action(Action... actions) {
        for (Action action : actions) {
            action(action);
        }
    }

    public abstract void work();

    protected abstract String name();

    static enum Action {
        GO_TO_SLEEP, WAKE_UP, GO_HOME, GO_TO_MINE, WORK
    }
}
