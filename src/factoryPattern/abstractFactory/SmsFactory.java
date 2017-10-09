package factoryPattern.abstractFactory;

import factoryPattern.Sender;
import factoryPattern.SmsSender;

public class SmsFactory implements AbstractFactory {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
