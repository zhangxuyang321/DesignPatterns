package singletonPattern;

/**
 * 静态内部类单例模式
 * 优点: 同样利用了类加载机制来保证只创建一个实例,不存在线程问题.相对饿汉式而言静态内部类不使用就不会创建实例,从而
 *      实现懒汉式的延迟加载
 * 缺点: 内部类会持有外部类的引用
 */
public class StaticInnerClassSingleton {
    private static class StaticInnerClassSingletonHolder {
        public static StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }

    private StaticInnerClassSingleton() {
    }

    public static StaticInnerClassSingleton getInstance() {
        return StaticInnerClassSingletonHolder.instance;
    }
}
