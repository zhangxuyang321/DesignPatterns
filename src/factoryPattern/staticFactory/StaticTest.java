package factoryPattern.staticFactory;

public class StaticTest {
    public static void main(String[] args) {
        StaticFactory.produceSms().send();
    }
}
