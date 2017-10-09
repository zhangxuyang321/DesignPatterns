package singletonPattern;

public enum EnumSingleton {
    INSTANCE;

    public void whateverMethod() {
        System.out.println("这是枚举 单例");
    }
}
