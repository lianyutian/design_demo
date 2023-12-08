package com.github.lianyutian.design.singleton;

/**
 * @author liming
 * @version 1.0
 * @since 2023/12/8 14:24
 */
public class OuterClass {
    static {
        System.out.println("OuterClass is loaded");
    }

    // 静态内部类
    private static class InnerClass {
        static {
            System.out.println("InnerClass is loaded");
        }

        private static final OuterClass INSTANCE = new OuterClass();
    }

    public static OuterClass getInstance() {
        return InnerClass.INSTANCE;
    }

    public static void main(String[] args) {
        System.out.println("Before accessing InnerClass");
        OuterClass outerInstance = getInstance();
        System.out.println("After accessing InnerClass");
    }
}
