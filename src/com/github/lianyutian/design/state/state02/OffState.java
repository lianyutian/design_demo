package com.github.lianyutian.design.state.state02;

/**
 * @author liming
 * @version 1.0
 * @since 2023/12/18 15:39
 */
public class OffState implements State {
    @Override
    public void turnOn() {
        System.out.println("Turning on the light");
    }

    @Override
    public void turnOff() {
        System.out.println("The light is already off");
    }

    @Override
    public void dim() {
        System.out.println("Cannot dim the light when it's off");
    }
}
