package facade_pattern.sub_system_impl;

import facade_pattern.sub_system.PopcornPopper;

public class MyPopcornPopper implements PopcornPopper {
    @Override
    public void on() {
        System.out.println("팝콘 기계가 커졌습니다.");
    }

    @Override
    public void off() {
        System.out.println("팝콘 기계가 꺼졌습니다.");
    }

    @Override
    public void pop() {
        System.out.println("팝콘 기계에서 팝콘을 튀기고 있습니다.");
    }
}
