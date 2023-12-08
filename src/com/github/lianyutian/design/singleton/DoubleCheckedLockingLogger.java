package com.github.lianyutian.design.singleton;

/**
 * @author liming
 * @version 1.0
 * @since 2023/12/8 14:21
 */
public class DoubleCheckedLockingLogger {
    private static volatile DoubleCheckedLockingLogger instance;

    private DoubleCheckedLockingLogger() {}

    public static DoubleCheckedLockingLogger getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLockingLogger.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLockingLogger();
                }
            }
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("Double-Checked Locking Logger: " + message);
    }
}
