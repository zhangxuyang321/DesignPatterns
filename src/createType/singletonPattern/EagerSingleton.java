package createType.singletonPattern;

/**
 * 饿汉式单例(常用)
 * 优点: 最简单的实现方式,而且天生线程安全
 * 缺点: 类加载的时候实例就会被创建,即使是这个单例没有被用到,内存会被浪费
 */
public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
