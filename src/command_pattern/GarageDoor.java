package command_pattern;

public class GarageDoor {
    public void up() {
        System.out.println("차고 문이 열렸습니다.");
    }

    public void down() {
        System.out.println("차고 문이 닫혔습니다.");
    }

    public void stop() {
        System.out.println("차고 문이 정지했습니다.");
    }

    public void lightOn() {
        System.out.println("차고 문의 불빛이 켜졌습니다");
    }

    public void lightOff() {
        System.out.println("차고 문의 불빛이 꺼졌습니다");
    }
}
