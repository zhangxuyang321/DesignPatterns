package structureType.proxy;

public class ProxyTest {
    public static void main(String[] args) {
        WizardTowerProxy proxy = new WizardTowerProxy(new IvoryTower());
        proxy.enter(new Wizard("张三"));
        proxy.enter(new Wizard("李四"));
        proxy.enter(new Wizard("王五"));
        proxy.enter(new Wizard("赵六"));
    }
}
