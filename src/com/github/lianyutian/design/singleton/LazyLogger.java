package com.github.lianyutian.design.singleton;

/**
 * @author liming
 * @version 1.0
 * @since 2023/12/8 14:19
 */
public class LazyLogger {
    private static LazyLogger instance;

    private LazyLogger() {
        // 私有构造函数，防止外部直接实例化
    }

    public static LazyLogger getInstance() {
        if (instance == null) {
            instance = new LazyLogger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("Lazy Logger: " + message);
    }
}
