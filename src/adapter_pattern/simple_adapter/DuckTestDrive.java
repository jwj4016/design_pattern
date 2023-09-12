package adapter_pattern.simple_adapter;

public class DuckTestDrive {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdatper(turkey);

        System.out.println("칠면조 says");
        turkey.gobble();
        turkey.fly();

        System.out.println("\n오리 says");
        testDuck(duck);

        System.out.println("\n칠면조 adapter says");
        testDuck(turkeyAdapter);

    }

    public static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
