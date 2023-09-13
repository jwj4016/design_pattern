package facade_pattern.sub_system_impl;

import facade_pattern.sub_system.StreamingPlayer;

public class MyStreamingPlayer implements StreamingPlayer {

    @Override
    public void on() {
        System.out.println("스트리밍 플레이어가 켜졌습니다.");
    }

    @Override
    public void off() {
        System.out.println("스트리밍 플레이어가 꺼졌습니다.");
    }

    @Override
    public void pause() {
        System.out.println("스트리밍 플레이어가 일시정지됐습니다.");
    }

    @Override
    public void play(String movie) {
        System.out.println("스트리밍 플레이어에서 \"" + movie + "\"를(을) 재생합니다.");
    }

    @Override
    public void setSurroundAudio() {

    }

    @Override
    public void setTwoChannelAudio() {

    }

    @Override
    public void stop() {
        System.out.println("스트리밍 플레이어가 정지됐습니다.");
    }
}
