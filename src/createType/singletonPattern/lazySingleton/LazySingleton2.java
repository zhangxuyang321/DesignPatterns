package createType.singletonPattern.lazySingleton;

/**
 * 懒汉式单例(线程安全)
 * 优点: 同LazySingleton,并且是线程安全的
 * 缺点: 每次都要判断锁,效率太低,99%的情况下是不需要同步的
 */
public class LazySingleton2 {
    private static LazySingleton2 instance;

    private LazySingleton2() {
    }

    public static synchronized LazySingleton2 getInstance() {
        if (instance == null) {
            instance = new LazySingleton2();
        }
        return instance;
    }
}
