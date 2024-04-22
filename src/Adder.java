import java.util.Stack;

public class Adder {
    Stack<Double> stk;

    public Adder(Stack<Double> stk){
        this.stk=new Stack<>();
        this.stk = stk;
    }

    public void operate(){
        stk.push(stk.pop()+stk.pop());
    }
}
