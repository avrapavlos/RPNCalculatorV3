import java.awt.*;
import java.awt.event.*;
import java.awt.Button;
public class CalculatorGui extends Frame{
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonPlus, buttonMinus, buttonMul, buttonDiv, buttonBackspace, buttonEnter, buttonRP;
    TextField display;
    Operand op;
    Adder add;
    Subtracter sub;
    Multiplier mul;
    Divider div;
    public CalculatorGui(String title, Operand op, Adder add, Subtracter sub, Multiplier mul, Divider div){
        super(title);
        this.add = add;
        this.sub = sub;
        this.mul = mul;
        this.div = div;
        this.op=op;
        this.setLayout(null);
        this.setFont(new Font("TimesRoman", Font.PLAIN, 14));
        this.setBackground(Color.RED);

        this.setSize(300, 400);
        this.setLocation(40, 50);
        this.display=new TextField();
        this.display.setEditable(false);
        this.display.setBounds(13, 55, 257, 30);
        this.add(this.display);
        this.display.setText("0");


        button0=new Button("0");
        button0.setBounds(64, 265, 35, 28);
        button0.setFont(new Font("TimesRoman", Font.PLAIN, 14));
        button0.setBackground(Color.gray);
        button0.setForeground(Color.RED);
        button0.addActionListener(new Button0Handler(op));
        button1=new Button("1");
        button1.setBounds(24, 235, 35, 28);
        button1.setFont(new Font("TimesRoman", Font.PLAIN, 14));
        button1.setBackground(Color.gray);
        button1.setForeground(Color.RED);
        button1.addActionListener(new Button1Handler(op));
        button2=new Button("2");
        button2.setBounds(64, 235, 35, 28);
        button2.setFont(new Font("TimesRoman", Font.PLAIN, 14));
        button2.setBackground(Color.gray);
        button2.setForeground(Color.RED);
        button2.addActionListener(new Button2Handler(op));
        button3=new Button("3");
        button3.setBounds(104, 235, 35, 28);
        button3.setFont(new Font("TimesRoman", Font.PLAIN, 14));
        button3.setBackground(Color.gray);
        button3.setForeground(Color.RED);
        button3.addActionListener(new Button3Handler(op));
        button4=new Button("4");
        button4.setBounds(24, 205, 35, 28);
        button4.setFont(new Font("TimesRoman", Font.PLAIN, 14));
        button4.setBackground(Color.gray);
        button4.setForeground(Color.RED);
        button4.addActionListener(new Button4Handler(op));
        button5=new Button("5");
        button5.setBounds(64, 205, 35, 28);
        button5.setFont(new Font("TimesRoman", Font.PLAIN, 14));
        button5.setBackground(Color.gray);
        button5.setForeground(Color.RED);
        button5.addActionListener(new Button5Handler(op));
        button6=new Button("6");
        button6.setBounds(104, 205, 35, 28);
        button6.setFont(new Font("TimesRoman", Font.PLAIN, 14));
        button6.setBackground(Color.gray);
        button6.setForeground(Color.RED);
        button6.addActionListener(new Button6Handler(op));
        button7=new Button("7");
        button7.setBounds(24, 175, 35, 28);
        button7.setFont(new Font("TimesRoman", Font.PLAIN, 14));
        button7.setBackground(Color.gray);
        button7.setForeground(Color.RED);
        button7.addActionListener(new Button7Handler(op));
        button8=new Button("8");
        button8.setBounds(64, 175, 35, 28);
        button8.setFont(new Font("TimesRoman", Font.PLAIN, 14));
        button8.setBackground(Color.gray);
        button8.setForeground(Color.RED);
        button8.addActionListener(new Button8Handler(op));
        button9=new Button("9");
        button9.setBounds(104, 175, 35, 28);
        button9.setFont(new Font("TimesRoman", Font.PLAIN, 14));
        button9.setBackground(Color.gray);
        button9.setForeground(Color.RED);
        button9.addActionListener(new Button9Handler(op));
        buttonPlus=new Button("+");
        buttonPlus.setBounds(144, 265, 35, 28);
        buttonPlus.setFont(new Font("TimesRoman", Font.PLAIN, 14));
        buttonPlus.setBackground(Color.gray);
        buttonPlus.setForeground(Color.RED);
        buttonPlus.addActionListener(new ButtonPlusHandler(add));
        buttonMinus=new Button("-");
        buttonMinus.setBounds(144, 235, 35, 28);
        buttonMinus.setFont(new Font("TimesRoman", Font.PLAIN, 14));
        buttonMinus.setBackground(Color.gray);
        buttonMinus.setForeground(Color.RED);
        buttonMinus.addActionListener(new ButtonMinusHandler(sub));
        buttonMul=new Button("*");
        buttonMul.setBounds(144, 205, 35, 28);
        buttonMul.setFont(new Font("TimesRoman", Font.PLAIN, 14));
        buttonMul.setBackground(Color.gray);
        buttonMul.setForeground(Color.RED);
        buttonMul.addActionListener(new ButtonMultHandler(mul));
        buttonDiv=new Button("/");
        buttonDiv.setBounds(144, 175, 35, 28);
        buttonDiv.setFont(new Font("TimesRoman", Font.PLAIN, 14));
        buttonDiv.setBackground(Color.gray);
        buttonDiv.setForeground(Color.RED);
        buttonDiv.addActionListener(new ButtonDivHandler(div));
        buttonBackspace=new Button("Backspace");
        buttonBackspace.setBounds(184, 175, 83, 28);
        buttonBackspace.setFont(new Font("TimesRoman", Font.PLAIN, 14));
        buttonBackspace.setBackground(Color.gray);
        buttonBackspace.setForeground(Color.RED);
        buttonBackspace.addActionListener(new ButtonBackspaceHandler(op));
        buttonEnter=new Button("ENTER");
        buttonEnter.setBounds(184, 235, 50, 28);
        buttonEnter.setFont(new Font("TimesRoman", Font.PLAIN, 14));
        buttonEnter.setBackground(Color.gray);
        buttonEnter.setForeground(Color.RED);
        buttonEnter.addActionListener(new ButtonEnterHandler(op));
        buttonRP=new Button("=");
        buttonRP.setBounds(184, 265, 35, 28);
        buttonRP.setFont(new Font("TimesRoman", Font.PLAIN, 14));
        buttonRP.setBackground(Color.gray);
        buttonRP.setForeground(Color.RED);
        buttonRP.addActionListener(new ButtonResultPresenterHandler(op, display));


        this.add(button0);
        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(button4);
        this.add(button5);
        this.add(button6);
        this.add(button7);
        this.add(button8);
        this.add(button9);
        this.add(buttonPlus);
        this.add(buttonMinus);
        this.add(buttonMul);
        this.add(buttonDiv);
        this.add(buttonBackspace);
        this.add(buttonEnter);
        this.add(buttonRP);

        this.setVisible(true);
        this.setResizable(false);
        this.addWindowListener(new CloseWindowAndExit());
    }
}

class CloseWindowAndExit extends WindowAdapter {

    public void windowClosing(WindowEvent closeWindowAndExit) {
        System.exit(0);
    }
}

class Button0Handler implements ActionListener{
    Operand op;
    public Button0Handler(Operand op) {this.op=op;}
    public void actionPerformed(ActionEvent e) {
        op.addDigit('0');
    }
}

class Button1Handler implements ActionListener{
    Operand op;
    public Button1Handler(Operand op) {this.op=op;}
    public void actionPerformed(ActionEvent e) {
        op.addDigit('1');
    }
}

class Button2Handler implements ActionListener{
    Operand op;
    public Button2Handler(Operand op) {this.op=op;}
    public void actionPerformed(ActionEvent e) {
        op.addDigit('2');
    }
}

class Button3Handler implements ActionListener{
    Operand op;
    public Button3Handler(Operand op) {this.op=op;}
    public void actionPerformed(ActionEvent e) {
        op.addDigit('3');
    }
}

class Button4Handler implements ActionListener{
    Operand op;
    public Button4Handler(Operand op) {this.op=op;}
    public void actionPerformed(ActionEvent e) {
        op.addDigit('4');
    }
}

class Button5Handler implements ActionListener{
    Operand op;
    public Button5Handler(Operand op) {this.op=op;}
    public void actionPerformed(ActionEvent e) {
        op.addDigit('5');
    }
}

class Button6Handler implements ActionListener{
    Operand op;
    public Button6Handler(Operand op) {this.op=op;}

    public void actionPerformed(ActionEvent e) {
        op.addDigit('6');
    }
}

class Button7Handler implements ActionListener{
    Operand op;
    public Button7Handler(Operand op) {this.op=op;}

    public void actionPerformed(ActionEvent e) {
        op.addDigit('7');
    }
}

class Button8Handler implements ActionListener{
    Operand op;
    public Button8Handler(Operand op) {this.op=op;}

    public void actionPerformed(ActionEvent e) {
        op.addDigit('8');
    }
}

class Button9Handler implements ActionListener{
    Operand op;
    public Button9Handler(Operand op) {this.op=op;}

    public void actionPerformed(ActionEvent e) {
        op.addDigit('9');
    }
}

class ButtonEnterHandler implements ActionListener{
    Operand op;
    public ButtonEnterHandler(Operand op) {this.op=op;}
    public void actionPerformed(ActionEvent e) {
        op.complete();
    }
}

class ButtonBackspaceHandler implements ActionListener{
    Operand op;
    public ButtonBackspaceHandler(Operand op) {this.op=op;}
    public void actionPerformed(ActionEvent e) {
        op.deleteLastDigit();
    }
}

class ButtonResultPresenterHandler implements ActionListener{
    Operand op;
    TextField display;
    public ButtonResultPresenterHandler(Operand op, TextField display) {
        this.op=op;
        this.display=display;
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println(op.stk.peek());
        display.setText(op.stk.pop().toString());
    }
}

class ButtonPlusHandler implements ActionListener{
    Adder add;
    public ButtonPlusHandler(Adder add) {this.add=add;}
    public void actionPerformed(ActionEvent e) {
        add.operate();
    }
}

class ButtonMinusHandler implements ActionListener{
    Subtracter sub;
    public ButtonMinusHandler(Subtracter sub) {this.sub=sub;}
    public void actionPerformed(ActionEvent e) {
        sub.operate();
    }
}

class ButtonMultHandler implements ActionListener{
    Multiplier mult;
    public ButtonMultHandler(Multiplier mult) {this.mult=mult;}
    public void actionPerformed(ActionEvent e) {
        mult.operate();
    }
}

class ButtonDivHandler implements ActionListener{
    Divider div;
    public ButtonDivHandler(Divider div) {this.div=div;}
    public void actionPerformed(ActionEvent e) {
        div.operate();
    }
}