package behaviorType.templateMethod;

public class templateTest {
    public static void main(String[] args) {
        HalflingThief thief = new HalflingThief(new HitAndRunMethod());
        thief.steal();

        thief.changeMethod(new SubtleMethod());
        thief.steal();
    }
}
