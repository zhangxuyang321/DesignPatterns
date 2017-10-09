package factoryPattern.commonFactory;

import factoryPattern.MailSender;
import factoryPattern.Sender;
import factoryPattern.SmsSender;

public class CommonFactory {
    public Sender produce(int index) {
        switch (index) {
            case 1:
                return new MailSender();
            case 2:
                return new SmsSender();
            default:
                System.out.println("请输入正确参数1或2");
                return null;
        }
    }
}
