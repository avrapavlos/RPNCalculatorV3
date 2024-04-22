import java.util.Stack;

public class Multiplier {
    Stack<Double> stk;

    public Multiplier(Stack<Double> stk) {
        this.stk=new Stack<>();
        this.stk=stk;
    }

    public void operate(){
        stk.push(stk.pop()*stk.pop());
    }
}
