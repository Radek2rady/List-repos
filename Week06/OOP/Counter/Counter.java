package OOP.Counter;

public class Counter {
    public int value;
    public int initValue;

    public Counter() {
        int initValue = 0;
    }

    public Counter(int nr) {
       value = nr;
       initValue = nr;
    }

    public void add(int number) {
        value += number;
    }

    public void add() {
        value++;
    }

    public int get() {
        return value;
    }

    public void reset() {
        value = initValue;
    }
}
