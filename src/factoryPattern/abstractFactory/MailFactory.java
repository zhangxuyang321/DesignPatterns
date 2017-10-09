package factoryPattern.abstractFactory;

import factoryPattern.MailSender;
import factoryPattern.Sender;

public class MailFactory implements AbstractFactory {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
