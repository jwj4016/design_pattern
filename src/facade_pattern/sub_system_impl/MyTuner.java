package facade_pattern.sub_system_impl;

import facade_pattern.sub_system.Tuner;

public class MyTuner implements Tuner {
    @Override
    public void on() {
        System.out.println("튜너가 켜졌습니다.");
    }

    @Override
    public void off() {
        System.out.println("튜너가 꺼졌습니다.");
    }

    @Override
    public void setAm() {

    }

    @Override
    public void setFm() {

    }

    @Override
    public void setFrequency() {

    }
}
