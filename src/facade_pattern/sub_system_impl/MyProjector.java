package facade_pattern.sub_system_impl;

import facade_pattern.sub_system.Projector;

public class MyProjector implements Projector {
    @Override
    public void on() {
        System.out.println("마이 프로젝터가 켜졌습니다.");
    }

    @Override
    public void off() {
        System.out.println("마이 프로젝트가 꺼졌습니다.");
    }

    @Override
    public void tvMode() {
        System.out.println("마이 프로젝터 화면 비율을 티비 모드로 설정합니다.");
    }

    @Override
    public void wideScreenMode() {
        System.out.println("마이 프로젝터 화면 비율을 와이드 모드로 설정합니다.");
    }
}
