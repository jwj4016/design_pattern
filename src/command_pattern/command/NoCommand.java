package command_pattern.command;

public class NoCommand implements Command{

    //아래와 같은 코드를 피하기 위해 NoCommand 클래스 지정.
    //NoCommand는 일종의 null 객체(null object)이다.
    //public void onButtonWasPushed(int slot) {
    //    if(onCommands[slot] != null){
    //        onCommands[slot].execute();
    //    }
    //}

    @Override
    public void execute() {
    }

    @Override
    public void undo() {

    }
}
