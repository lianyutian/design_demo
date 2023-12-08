package com.github.lianyutian.design.singleton;

/**
 * @author liming
 * @version 1.0
 * @since 2023/12/8 14:20
 */
public class EagerLogger {
    private static final EagerLogger instance = new EagerLogger();
    private EagerLogger() {}

    public static EagerLogger getInstance() {
        return instance;
    }

    public void log(String message) {
        System.out.println("Eager Logger: " + message);
    }
}
