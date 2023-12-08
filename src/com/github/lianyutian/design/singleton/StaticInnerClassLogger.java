package com.github.lianyutian.design.singleton;

import sun.plugin2.message.ShowStatusMessage;

/**
 * @author liming
 * @version 1.0
 * @since 2023/12/8 14:24
 */
public class StaticInnerClassLogger {
    private StaticInnerClassLogger() {}

    private static class LoggerHolder {
        private static final StaticInnerClassLogger instance = new StaticInnerClassLogger();
    }

    public static StaticInnerClassLogger getInstance() {
        return LoggerHolder.instance;
    }

    public void log(String message) {
        System.out.println("Static Inner Class Logger: " + message);
    }
}
