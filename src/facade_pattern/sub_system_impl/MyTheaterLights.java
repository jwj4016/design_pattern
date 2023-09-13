package facade_pattern.sub_system_impl;

import facade_pattern.sub_system.TheaterLights;

public class MyTheaterLights implements TheaterLights {
    @Override
    public void on() {
        System.out.println("극장 불빛이 켜졌습니다.");
    }

    @Override
    public void off() {
        System.out.println("극장 불빛이 꺼졌습니다.");
    }

    @Override
    public void dim(int num) {
        System.out.println("극장 불빛이 '" + num + "'으로 설정 됐습니다.");
    }
}
