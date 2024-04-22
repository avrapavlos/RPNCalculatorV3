import java.util.Stack;

public class Divider {
    Stack<Double> stk;

    public Divider(Stack<Double> stk) {
        this.stk=new Stack<>();
        this.stk=stk;
    }

    public void operate(){
        Double temp=stk.pop();
        if(temp!=0){
            stk.push(stk.pop()/temp);
        }else{
            stk.push(temp);
            System.out.println("Division by zero is undefined");
        }
    }
}
