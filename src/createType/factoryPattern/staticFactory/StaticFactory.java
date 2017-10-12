package createType.factoryPattern.staticFactory;

import createType.factoryPattern.MailSender;
import createType.factoryPattern.Sender;
import createType.factoryPattern.SmsSender;

public class StaticFactory {
    public static Sender produceMail() {
        return new MailSender();
    }

    public static Sender produceSms() {
        return new SmsSender();
    }
}
