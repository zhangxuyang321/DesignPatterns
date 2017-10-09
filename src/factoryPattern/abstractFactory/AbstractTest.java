package factoryPattern.abstractFactory;

public class AbstractTest {
    public static void main(String[] args) {
        AbstractFactory factory = new MailFactory();
        factory.produce().send();
    }
}
