package com.github.lianyutian.design.state.state02;

/**
 * @author liming
 * @version 1.0
 * @since 2023/12/18 15:37
 */
public class OnState implements State {
    public void turnOn() {
        System.out.println("The light is already on");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the light");
    }

    @Override
    public void dim() {
        System.out.println("Dimming the light");
    }
}
