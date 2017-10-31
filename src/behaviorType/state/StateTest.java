package behaviorType.state;

public class StateTest {
    public static void main(String[] args) {
        Mammoth mammoth = new Mammoth();
        mammoth.observe();
        mammoth.timePass();
        mammoth.observe();
        mammoth.timePass();
        mammoth.observe();
    }
}
