package facade_pattern.sub_system_impl;

import facade_pattern.sub_system.Screen;

public class MyScreen implements Screen {
    @Override
    public void up() {
        System.out.println("스크린이 올라갑니다.");
    }

    @Override
    public void down() {
        System.out.println("스크린이 내려갑니다.");
    }
}
