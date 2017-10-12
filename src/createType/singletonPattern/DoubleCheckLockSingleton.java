package createType.singletonPattern;

/**
 * 懒汉式双重校验锁机制(常用)
 * 优点: 即实现了延迟加载,又解决了线程并发问题,同时兼顾了执行效率
 * 缺点: 由于指令重排优化的存在导致初始化 DoubleCheckLockSingleton 和 将对象地址值赋值给instance的顺序是不确定的.
 *      在某个线程创建单例对象时,在构造方法被调用之前就位该对象分配了内存空间并将对象的字段设置为默认值.此时
 *      将分配的地址值赋值给了instance字段,然而此时对象可能还没有初始化,若紧接着另外一个线程来调用getInstance,
 *      就会报错
 * 解决:
 *      在JDK1.5及之后版本增加了volatile关键字。volatile的一个语义是禁止指令重排序优化，也就保证了instance
 *      变量被赋值的时候对象已经是初始化过的.
 */
public class DoubleCheckLockSingleton {
//    private static DoubleCheckLockSingleton instance = null;
    private static volatile DoubleCheckLockSingleton instance = null;

    private DoubleCheckLockSingleton() {
    }

    public static DoubleCheckLockSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckLockSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckLockSingleton();
                }
            }
        }
        return instance;
    }
}
