package com.github.lianyutian.design.state.state01;

/**
 * @author liming
 * @version 1.0
 * @since 2023/12/18 15:36
 */
public class LightControllerWithoutStatePattern {
    private boolean isOn = false;
    private boolean isDimmed = false;

    public void turnOn() {
        if (!isOn) {
            System.out.println("Turning on the light");
            isOn = true;
            isDimmed = false;
        } else {
            System.out.println("The light is already on");
        }
    }

    public void turnOff() {
        if (isOn) {
            System.out.println("Turning off the light");
            isOn = false;
            isDimmed = false;
        } else {
            System.out.println("The light is already off");
        }
    }

    public void dim() {
        if (isOn) {
            System.out.println("Dimming the light");
            isDimmed = true;
        } else {
            System.out.println("Cannot dim the light when it's off");
        }
    }
}
