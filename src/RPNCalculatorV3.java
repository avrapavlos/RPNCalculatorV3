import java.util.Stack;

public class RPNCalculatorV3 {
    static Stack<Double> stk;
    static CalculatorGui gui;
    static Operand op;
    static Adder add;
    static ResultPresenter rp;
    static Subtracter sub;
    static Divider div;
    static Multiplier mult;

    public static void main(String[] args) {
        System.out.println("RPNCalcGUIIJV2");
        stk=new Stack<>();
        op=new Operand(stk);
        add=new Adder(stk);
        rp=new ResultPresenter(stk);
        sub=new Subtracter(stk);
        div=new Divider(stk);
        mult=new Multiplier(stk);
        gui=new CalculatorGui("RPNCalculatorV3.0", op, add, sub, mult, div);
    }
}