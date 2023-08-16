package command_pattern;

import command_pattern.command.Command;

//Invoker에는 명령이 들어있다. execute() 메소드 호출함으로써 커맨드 객체에 특정 작업 수행해달라는 요구하게 됨.
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {}

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
