package behaviorType.state;

public class Mammoth {
    private State state;

    public Mammoth() {
        this.state = new PeacefulState(this);
    }

    public void timePass() {
        if (state.getClass().equals(PeacefulState.class)) {
            changeStateTo(new AngryState(this));
        } else {
            changeStateTo(new PeacefulState(this));
        }
    }

    private void changeStateTo(State newState) {
        this.state = newState;
        this.state.onEnterState();
    }

    @Override
    public String toString() {
        return "The mammoth";
    }

    public void observe() {
        this.state.observe();
    }
}
