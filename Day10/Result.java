//Write a GUI program in Java with three Labels – Enter the First Number, Enter the Second Number, Result, and three text fields for  - first number, second number and result and four buttons - Add, Sub, multiply and reset as shown below. On clicking of any of these buttons, the corresponding operation should be performed with input1 and input2 and the result should be displayed in the result box.

import javax.swing.*;
import java.awt.*;

class Result extends JFrame {
    public Result() {
        setTitle("Result");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setVisible(true);

        JLabel firstNumberLabel = new JLabel("Enter the First Number:");
        JTextField firstNumberField = new JTextField(20);

        JLabel secondNumberLabel = new JLabel("Enter the Second Number:");
        JTextField secondNumberField = new JTextField(20);

        JLabel resultLabel = new JLabel("Result:");
        JTextField resultField = new JTextField(20);

        JButton addButton = new JButton("Add");
        JButton subButton = new JButton("Sub");
        JButton mulButton = new JButton("Multiply");
        JButton resetButton = new JButton("Reset");

        add(firstNumberLabel);
        add(firstNumberField);
        add(secondNumberLabel);
        add(secondNumberField);
        add(resultLabel);
        add(resultField);
        add(addButton);
        add(subButton);
        add(mulButton);
        add(resetButton);
    }
    
}
