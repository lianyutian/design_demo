package com.github.lianyutian.design.singleton;

/**
 * @author liming
 * @version 1.0
 * @since 2023/12/8 14:33
 */
public enum EnumLogger {
    INSTANCE;

    // 枚举可以包含其他成员和方法
    public void log(String message) {
        System.out.println("Enum Logger: " + message);
    }
}
