package createType.factoryPattern.commonFactory;

import createType.factoryPattern.Sender;

public class CommonTest {
    public static void main(String[] args) {
        CommonFactory commonFactory = new CommonFactory();
        Sender sender = commonFactory.produce(2);
        sender.send();
    }
}
