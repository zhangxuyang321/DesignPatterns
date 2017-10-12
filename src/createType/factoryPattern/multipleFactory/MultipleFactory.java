package createType.factoryPattern.multipleFactory;

import createType.factoryPattern.MailSender;
import createType.factoryPattern.Sender;
import createType.factoryPattern.SmsSender;

public class MultipleFactory {
    public Sender produceMail() {
        return new MailSender();
    }

    public Sender produceSms() {
        return new SmsSender();
    }
}
