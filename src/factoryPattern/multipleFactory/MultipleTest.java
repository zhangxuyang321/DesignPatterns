package factoryPattern.multipleFactory;

public class MultipleTest {
    public static void main(String[] args) {
        MultipleFactory multipleFactory = new MultipleFactory();
        multipleFactory.produceMail().send();
    }
}
