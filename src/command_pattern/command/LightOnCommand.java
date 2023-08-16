package command_pattern.command;

import command_pattern.receiver.Light;

public class LightOnCommand implements Command{
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    //ConcreteCommand는 특정 행동과 리시버를 연결해준다.
    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
