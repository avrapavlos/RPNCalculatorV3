import java.util.Stack;

public class Subtracter {
    Stack<Double> stk;

    public Subtracter(Stack<Double> stk) {
        this.stk = new Stack<>();
        this.stk=stk;
    }

    public void operate() {
        stk.push(-(stk.pop()-stk.pop()));
    }
}
