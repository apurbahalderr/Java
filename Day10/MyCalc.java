import javax.swing.*;
import java.awt.event.*;

public class MyCalc implements ActionListener {
    JFrame f;
    JTextField t1, t2, t3;
    JButton add, sub, mul, reset;

    MyCalc() {
        f = new JFrame("My Calc");

        JLabel l1 = new JLabel("Enter First Number:");
        l1.setBounds(50,50,150,30);
        t1 = new JTextField();
        t1.setBounds(200,50,100,30);

        JLabel l2 = new JLabel("Enter Second Number:");
        l2.setBounds(50,100,150,30);
        t2 = new JTextField();
        t2.setBounds(200,100,100,30);

        JLabel l3 = new JLabel("Result:");
        l3.setBounds(50,150,150,30);
        t3 = new JTextField();
        t3.setBounds(200,150,100,30);

        add = new JButton("Add");
        sub = new JButton("Subtract");
        mul = new JButton("Multiply");
        reset = new JButton("Reset");

        add.setBounds(50,200,100,30);
        sub.setBounds(160,200,100,30);
        mul.setBounds(270,200,100,30);
        reset.setBounds(150,250,100,30);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        reset.addActionListener(this);

        f.add(l1); f.add(t1);
        f.add(l2); f.add(t2);
        f.add(l3); f.add(t3);
        f.add(add); f.add(sub); f.add(mul); f.add(reset);

        f.setSize(450,350);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == reset){
            t1.setText("");
            t2.setText("");
            t3.setText("");
            return;
        }

        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());

        if(e.getSource() == add)
            t3.setText(String.valueOf(a + b));
        else if(e.getSource() == sub)
            t3.setText(String.valueOf(a - b));
        else if(e.getSource() == mul)
            t3.setText(String.valueOf(a * b));
    }

    public static void main(String[] args) {
        new MyCalc();
    }
}