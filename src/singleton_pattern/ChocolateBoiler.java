package singleton_pattern;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
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
