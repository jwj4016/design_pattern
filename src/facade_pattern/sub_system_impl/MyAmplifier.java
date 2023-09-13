package facade_pattern.sub_system_impl;

import facade_pattern.sub_system.Amplifier;
import facade_pattern.sub_system.StreamingPlayer;
import facade_pattern.sub_system.Tuner;

public class MyAmplifier implements Amplifier {
    StreamingPlayer streamingPlayer;
    Tuner tuner;

    @Override
    public void on() {
        System.out.println("마이 앰프가 켜졌습니다.");
    }

    @Override
    public void off() {
        System.out.println("마이 앰프가 꺼졌습니다.");
    }

    @Override
    public void setStreamingPlayer(StreamingPlayer streamingPlayer) {
        this.streamingPlayer = streamingPlayer;
        System.out.println(streamingPlayer.getClass().getName()+" 스트리밍 플레이어가 설정되었습니다.");
    }

    @Override
    public void setStereoSound() {
        System.out.println("스테레오 사운드가 설정됐습니다.");
    }

    @Override
    public void setSurroundSound() {
        System.out.println("서라운드 사운드가 설정됐습니다.");
    }

    @Override
    public void setTuner() {
        System.out.println("튜너가 설정됐습니다.");
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("볼륨이 " + volume + "으로 설정 됐습니다.");
    }
}
