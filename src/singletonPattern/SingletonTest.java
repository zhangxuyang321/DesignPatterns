package singletonPattern;

import singletonPattern.lazySingleton.LazySingleton1;
import singletonPattern.lazySingleton.LazySingleton2;

public class SingletonTest {
    public static void main(String[] args) {


        System.out.println(LazySingleton1.getInstance() == LazySingleton1.getInstance());
        System.out.println(LazySingleton2.getInstance() == LazySingleton2.getInstance());
        System.out.println(DoubleCheckLockSingleton.getInstance() == DoubleCheckLockSingleton.getInstance());
        System.out.println(EagerSingleton.getInstance() == EagerSingleton.getInstance());
        System.out.println(StaticInnerClassSingleton.getInstance() == StaticInnerClassSingleton.getInstance());

        EnumSingleton.INSTANCE.whateverMethod();
    }
}
