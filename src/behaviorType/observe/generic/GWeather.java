package behaviorType.observe.generic;

import behaviorType.observe.WeatherType;

public class GWeather extends Observable<GWeather, Race, WeatherType> {
    private WeatherType type;

    public GWeather() {
        type = WeatherType.SUNNY;
    }

    public void timePasses() {
        WeatherType[] values = WeatherType.values();
        type = values[(type.ordinal() + 1) % values.length];
        System.out.println("天气变了");
        notifyObservers(type);
    }
}
