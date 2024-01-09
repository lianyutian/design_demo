package com.github.lianyutian.design.state.state02;

/**
 * @author liming
 * @version 1.0
 * @since 2023/12/18 15:40
 */
public class LightController {
    private State currentState;

    public LightController() {
        // 初始状态为关闭
        currentState = new OffState();
    }

    public void turnOn() {
        currentState.turnOn();
        if (currentState instanceof OffState) {
            // 状态转换为开启
            currentState = new OnState();
        }
    }

    public void turnOff() {
        currentState.turnOff();
        if (currentState instanceof OnState || currentState instanceof DimState) {
            // 状态转换为关闭
            currentState = new OffState();
        }
    }

    public void dim() {
        currentState.dim();
        if (currentState instanceof OnState) {
            // 状态转换为调光
            currentState = new DimState();
        }
    }
}
