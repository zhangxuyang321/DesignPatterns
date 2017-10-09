package factoryPattern.multipleFactory;

import factoryPattern.MailSender;
import factoryPattern.Sender;
import factoryPattern.SmsSender;

public class MultipleFactory {
    public Sender produceMail() {
        return new MailSender();
    }

    public Sender produceSms() {
        return new SmsSender();
    }
}
