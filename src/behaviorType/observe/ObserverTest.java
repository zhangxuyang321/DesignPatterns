package behaviorType.observe;

public class ObserverTest {
    public static void main(String[] args) {
        Weather weather = new Weather();
        weather.addObserver(new Orcs());
        weather.addObserver(new Habbits());

        weather.timePasses();
        weather.timePasses();
        weather.timePasses();
        weather.timePasses();

    }
}
