package singleton_pattern;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    //ChocolateBoiler 클래스의 하나뿐인 인스턴스 저장하는 정적 변수.
    private static ChocolateBoiler uniqueInstance;
    //멀티스레딩 환경에서 버그 방지를 위한 방법2.
    //private static ChocolateBoiler uniqueInstance = new ChocolateBoiler();
    //멀티스레딩 환경에서 버그 방지를 위한 방법3.(DCL 사용.)
    //private volatile static ChocolateBoiler uniqueInstance;
    //public static ChocolateBoiler getInstance() {
    //  if(uniqueInstance == null) {                        //인스턴스가 있는지 확인하고 없으면 동기화된 블록으로 들어간다.
    //      synchronized (Singleton.class) {                //처음에만 동기화 된다.
    //          if(uniqueInstance == null){
    //              uniqueInstance = new ChocolateBoiler();
    //          }
    //      }
    //      return uniqueInstance;
    //  }
    //}


    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    //멀티스레딩 환경에서 버그 방지를 위한 방법1.
    //속도가 중요하지 않다면 선택할 수 있는 방법.
    //1. public static synchronized ChocolateBoiler getInstance() {
    public static ChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ChocolateBoiler();
        }
        return uniqueInstance;
    }

    //보일러에 우유와 초콜릿을 넣는다.
    //보일러가 비어있을 때만 재료를 넣는다.
    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    //보일러가 차 있고, 끓여진 상태일 경우에만 다음 단계로 넘어간다.
    public void drain() {
        if (!isEmpty() && isBoiled()) {
            //끓인 재료를 다음 단계로 넘김
            empty = true;
        }
    }

    //보일러가 가득 차 있고 끓이지 않은 상태에서만 재료를 끓인다.
    public void boil() {
        if (!isBoiled() && !isBoiled()) {
            //재료를 끓임
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
