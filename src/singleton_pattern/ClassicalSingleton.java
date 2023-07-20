package singleton_pattern;

public class ClassicalSingleton {
    //ClassicalSingleton 클래스의 하나뿐인 인스턴스 저장하는 정적 변수.
    private static ClassicalSingleton uniqueInstance;

    //생성자가 private이기 때문에 해당 클래스 내에서만 클래스 인스턴스 생성 가능.
    private ClassicalSingleton(){}

    public static ClassicalSingleton getInstance() {
        //uniqueInstance가 null이면 아직 인스턴스가 생성되지 않았음.
        if (uniqueInstance == null) {
            //인스턴스가 필요한 상황이 오기 전까지 인스턴스를 생성하지 않을 수 있다. lazyinstantiation.
            uniqueInstance = new ClassicalSingleton();
        }
        return uniqueInstance;
    }
}
