import java.util.Stack;
import java.lang.StringBuffer;

public class Operand implements OperandIf{
    Stack<Double> stk=new Stack<>();
    static StringBuffer number=new StringBuffer();
    static Adder add;
    static Subtracter sub;
    static ResultPresenter rp;
    static Divider div;
    static Multiplier mul;

    public Operand(Stack<Double> stk){
        this.stk=stk;
    }

    public void addDigit(char num){
            number.append(num);
    }

    public void complete(){
        stk.push(Double.parseDouble(number.toString()));
        System.out.println(stk);
        number.setLength(0);
    }

    public void deleteLastDigit(){
        number.deleteCharAt(number.length()-1);
    }

    public void reset(){
        number.delete(0,number.length());
    }
}
