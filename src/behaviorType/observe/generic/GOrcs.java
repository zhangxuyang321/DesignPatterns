package behaviorType.observe.generic;

import behaviorType.observe.WeatherType;

public class GOrcs implements Race{
    @Override
    public void update(GWeather subject, WeatherType type) {
        switch (type) {
            case SUNNY:
                System.out.println("The sun hurts the orcs' eyes.");
                break;
            case RAINY:
                System.out.println("The orcs are dripping wet.");
                break;
            case WINDY:
                System.out.println("The orc smell almost vanishes in the wind");
                break;
            case COLD:
                System.out.println("The orcs are freezing cold");
                break;
            default:
                break;
        }
    }
}
