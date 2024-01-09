package com.github.lianyutian.design.state.state02;

/**
 * @author liming
 * @version 1.0
 * @since 2023/12/18 15:39
 */
public class DimState implements State {
    @Override
    public void turnOn() {
        System.out.println("Turning on the light");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the light");
    }

    @Override
    public void dim() {
        System.out.println("Dimming the light further");
    }
}
