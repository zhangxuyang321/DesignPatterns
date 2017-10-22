package behaviorType.observe;

import java.util.ArrayList;
import java.util.List;

public class Weather {
    private WeatherType type;
    List<WeatherObserver> observers;

    public Weather() {
        observers = new ArrayList<>();
        type = WeatherType.SUNNY;
    }

    public void addObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    public void timePasses() {
        WeatherType[] enumValues = WeatherType.values();
        type = enumValues[(type.ordinal() + 1) % enumValues.length];
        System.out.println("The weather changed to " + type + ".");
        notifyObserver();
    }

    private void notifyObserver() {
        for (WeatherObserver obs : observers) {
            obs.update(type);
        }
    }
}
