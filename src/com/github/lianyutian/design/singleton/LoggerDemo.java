package com.github.lianyutian.design.singleton;

/**
 * @author liming
 * @version 1.0
 * @since 2023/12/8 14:34
 */
public class LoggerDemo {
    public static void main(String[] args) {
        // 使用懒汉式单例
        LazyLogger lazyLogger = LazyLogger.getInstance();
        lazyLogger.log("Lazy Logger Example");

        // 使用饿汉式单例
        EagerLogger eagerLogger = EagerLogger.getInstance();
        eagerLogger.log("Eager Logger Example");

        // 使用双重检查锁定单例
        DoubleCheckedLockingLogger dclLogger = DoubleCheckedLockingLogger.getInstance();
        dclLogger.log("Double-Checked Locking Logger Example");

        // 使用静态内部类单例
        StaticInnerClassLogger sicLogger = StaticInnerClassLogger.getInstance();
        sicLogger.log("Static Inner Class Logger Example");

        // 使用枚举单例
        EnumLogger enumLogger = EnumLogger.INSTANCE;
        enumLogger.log("Enum Logger Example");
    }
}
