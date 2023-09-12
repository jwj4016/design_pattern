package adapter_pattern.simple_adapter;

public class TurkeyAdatper implements Duck{
    Turkey turkey;

    public TurkeyAdatper(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
