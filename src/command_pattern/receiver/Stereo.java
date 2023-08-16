package command_pattern.receiver;

public class Stereo {
    String location;

    public Stereo(String location) {
        this.location = location;
    }
    public void on() {
        System.out.println(location + " 스테레오가 켜졌습니다.");
    }
    public void off() {
        System.out.println(location + " 스테레오가 꺼졌습니다.");
    }
    public void setCd() {
        System.out.println(location + " CD가 세팅됐습니다.");
    }
    public void setDvd() {
        System.out.println(location + "DVD가 세팅됐습니다.");
    }
    public void setRadio() {
        System.out.println(location + "라디오가 세팅됐습니다.");
    }
    public void setVolume(int volume) {
        System.out.println("볼륨이 '" + volume + "'으로 세팅됐습니다.");
    }
}
