package singletonPattern;

/**
 * 枚举单例
 * 优点: 没有线程安全问题,无偿提供序列化机制.绝对防止多次序列化,即使是在面对复杂的序列化或反射攻击的时候
 * 缺点: jdk1.5提供,主要是不习惯
 */
public enum EnumSingleton {
    INSTANCE;

    public void whateverMethod() {
        System.out.println("这是枚举 单例");
    }
}
