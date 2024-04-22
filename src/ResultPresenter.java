import java.util.Stack;

public class ResultPresenter {
    Stack<Double> stk;

    public ResultPresenter(Stack<Double> stk) {
        this.stk=new Stack<>();
        this.stk=stk;
    }

    public void operate(){
        System.out.println(stk.pop());
    }
}
