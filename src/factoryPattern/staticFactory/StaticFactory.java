package factoryPattern.staticFactory;

import factoryPattern.MailSender;
import factoryPattern.Sender;
import factoryPattern.SmsSender;

public class StaticFactory {
    public static Sender produceMail() {
        return new MailSender();
    }

    public static Sender produceSms() {
        return new SmsSender();
    }
}
