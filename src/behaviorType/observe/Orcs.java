package behaviorType.observe;

public class Orcs implements WeatherObserver {
    @Override
    public void update(WeatherType type) {
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
