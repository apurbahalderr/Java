import javax.swing.*;
import java.awt.*;

public class RegistrationForm {
    public static void main(String[] args) {
        JFrame f = new JFrame("Registration Form");

        JLabel name = new JLabel("Name:");
        name.setBounds(50,50,100,30);

        JTextField t1 = new JTextField();
        t1.setBounds(150,50,150,30);

        JLabel address = new JLabel("Address:");
        address.setBounds(50,100,100,30);

        JTextArea ta = new JTextArea();
        ta.setBounds(150,100,150,60);

        JCheckBox cb = new JCheckBox("Accept Terms");
        cb.setBounds(150,170,150,30);

        JRadioButton r1 = new JRadioButton("Male");
        JRadioButton r2 = new JRadioButton("Female");
        r1.setBounds(150,210,70,30);
        r2.setBounds(230,210,100,30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1); bg.add(r2);

        JButton btn = new JButton("Submit");
        btn.setBounds(150,260,100,30);

        f.add(name); f.add(t1);
        f.add(address); f.add(ta);
        f.add(cb);
        f.add(r1); f.add(r2);
        f.add(btn);

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}