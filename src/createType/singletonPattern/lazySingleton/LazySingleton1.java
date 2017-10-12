package createType.singletonPattern.lazySingleton;

/**
 * 懒汉式单例(线程不安全)
 * 优点: 编写简单直观,第一次使用时才会创建实例
 * 缺点: 多线程不能正常工作
 */
public class LazySingleton1 {
    private static LazySingleton1 instance;

    private LazySingleton1() {
    }

    public static LazySingleton1 getInstance() {
        if (instance == null) {
            instance = new LazySingleton1();
        }
        return instance;
    }

}
