package task_5;

public class Number {
    int number;

    public Number(int number) {
        this.number = number;
    }

    public int calculateModuleOfNumber() {
        return Math.abs(number);
    }
}
