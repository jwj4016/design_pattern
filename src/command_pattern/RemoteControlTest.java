package command_pattern;

import command_pattern.command.GarageDoorOpenCommand;
import command_pattern.command.LightOnCommand;
import command_pattern.receiver.GarageDoor;
import command_pattern.receiver.Light;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();

        //클라이언트는 ConcreteCommand를 생성하고 Receiver를 설정한다.
        Light light = new Light("거실");  //리시버
        LightOnCommand lightOn = new LightOnCommand(light); //ConcreteCommand

        GarageDoor garageDoor = new GarageDoor("벤틀리");
        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(garageDoorOpen);
        remote.buttonWasPressed();
    }
}
