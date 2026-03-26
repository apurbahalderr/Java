import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {

    JTextField t;
    JLabel l;

    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
    JButton add,sub,mul,div,mod,eq,off;

    int num1,num2,result;
    char op;

    Calculator(){

        setTitle("Calculator");
        setSize(420,320);   // exact outer size
        setLayout(null);

        getContentPane().setBackground(new Color(0,204,204)); // blue background

        l = new JLabel("CALCULATOR");
        l.setBounds(80,30,150,25);
        l.setOpaque(true);
        l.setBackground(new Color(0,204,204));
        add(l);

        t = new JTextField();
        t.setBounds(230,30,110,25);
        add(t);

        // Row 1
        b1 = new JButton("1");
        b1.setBounds(80,60,65,30);
        add(b1);

        b2 = new JButton("2");
        b2.setBounds(145,60,65,30);
        add(b2);

        b3 = new JButton("3");
        b3.setBounds(210,60,65,30);
        add(b3);

        add = new JButton("+");
        add.setBounds(275,60,65,30);
        add(add);

        // Row 2
        b4 = new JButton("4");
        b4.setBounds(80,90,65,30);
        add(b4);

        b5 = new JButton("5");
        b5.setBounds(145,90,65,30);
        add(b5);

        b6 = new JButton("6");
        b6.setBounds(210,90,65,30);
        add(b6);

        sub = new JButton("-");
        sub.setBounds(275,90,65,30);
        add(sub);

        // Row 3
        b7 = new JButton("7");
        b7.setBounds(80,120,65,30);
        add(b7);

        b8 = new JButton("8");
        b8.setBounds(145,120,65,30);
        add(b8);

        b9 = new JButton("9");
        b9.setBounds(210,120,65,30);
        add(b9);

        mul = new JButton("*");
        mul.setBounds(275,120,65,30);
        add(mul);

        // Row 4
        div = new JButton("/");
        div.setBounds(80,150,65,30);
        add(div);

        b0 = new JButton("0");
        b0.setBounds(145,150,65,30);
        add(b0);

        mod = new JButton("%");
        mod.setBounds(210,150,65,30);
        add(mod);

        eq = new JButton("=");
        eq.setBounds(275,150,65,30);
        add(eq);

        // OFF button
        off = new JButton("OFF");
        off.setBounds(145,180,130,30);
        add(off);

        // Action listeners
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        mod.addActionListener(this);
        eq.addActionListener(this);
        off.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){

        String s = e.getActionCommand();

        if(s.charAt(0)>='0' && s.charAt(0)<='9'){
            t.setText(t.getText()+s);
        }

        else if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/") || s.equals("%")){
            num1 = Integer.parseInt(t.getText());
            op = s.charAt(0);
            t.setText("");
        }

        else if(s.equals("=")){
            num2 = Integer.parseInt(t.getText());

            switch(op){
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/': result = num1 / num2; break;
                case '%': result = num1 % num2; break;
            }

            t.setText(String.valueOf(result));
        }

        else if(s.equals("OFF")){
            System.exit(0);
        }
    }

    public static void main(String args[]){
        new Calculator();
    }
}