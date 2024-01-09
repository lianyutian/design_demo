package com.github.lianyutian.design.state.state02;

/**
 * @author liming
 * @version 1.0
 * @since 2023/12/18 15:40
 */
public class StatePatternDemo {
    public static void main(String[] args) {
        LightController lightController = new LightController();

        // 初始状态为关闭
        lightController.turnOn();  // 输出: Turning on the light

        // 状态转换为开启
        lightController.dim();     // 输出: Dimming the light further

        // 状态转换为调光
        lightController.turnOff(); // 输出: Turning off the light

        // 状态转换为关闭
        lightController.turnOn();  // 输出: Turning on the light
    }
}
