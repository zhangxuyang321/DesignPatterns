package behaviorType.observe;

import behaviorType.observe.generic.GHabbits;
import behaviorType.observe.generic.GOrcs;
import behaviorType.observe.generic.GWeather;

public class ObserverTest {
    public static void main(String[] args) {
        Weather weather = new Weather();
        weather.addObserver(new Orcs());
        weather.addObserver(new Habbits());

        weather.timePasses();
        weather.timePasses();
        weather.timePasses();
        weather.timePasses();

        System.out.println("------------------------");

        GWeather gWeather = new GWeather();
        gWeather.addObserver(new GOrcs());
        gWeather.addObserver(new GHabbits());

        gWeather.timePasses();
        gWeather.timePasses();
        gWeather.timePasses();
        gWeather.timePasses();

    }
}
