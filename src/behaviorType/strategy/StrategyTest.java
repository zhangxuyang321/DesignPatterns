package behaviorType.strategy;

public class StrategyTest {
    public static void main(String[] args) {
        System.out.println("绿龙发现了");
        DragonSlayer dragonSlayer = new DragonSlayer(new MeleeStrategy());
        dragonSlayer.goToBattle();

        System.out.println("红龙出现");
        dragonSlayer.changeDragonSlayer(new ProgectileStrategy());
        dragonSlayer.goToBattle();

        System.out.println("黑龙也出来了");

        dragonSlayer.changeDragonSlayer(new SpellStrategy());
        dragonSlayer.goToBattle();

        System.out.println("--------------------------");

        //java8 策略模式
        System.out.println("绿龙发现了");
        dragonSlayer = new DragonSlayer(()-> System.out.println("With your Excalibur you severe the dragon's head!"));
        dragonSlayer.goToBattle();

        System.out.println("红龙出现");
        dragonSlayer.changeDragonSlayer(()-> System.out.println("You shoot the dragon with the magical crossbow and it falls dead on the ground!"));
        dragonSlayer.goToBattle();

        System.out.println("黑龙也出来了");
        dragonSlayer.changeDragonSlayer(()-> System.out.println("You cast the spell of disintegration and the dragon vaporizes in a pile of dust!"));
        dragonSlayer.goToBattle();
    }
}
