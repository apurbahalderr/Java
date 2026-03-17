//Design a registration form using Swing with following components on it – Label, Textbox, Text area, Checkbox, Radio button and Button, Image.

package Day10;

import javax.swing.*;
import java.awt.*;

// Design a registration form using Swing with following components on it – Label, Textbox, Text area, Checkbox, Radio button and Button, Image.

class Form extends JFrame {
    public Form() {
        setTitle("Registration Form");
        setSize(1600, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setVisible(true);

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(20);

        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField(20);

        JLabel addressLabel = new JLabel("Address:");
        JTextArea addressArea = new JTextArea(5, 20);

        JCheckBox subscribeCheckBox = new JCheckBox("Subscribe to newsletter");

        JRadioButton maleRadioButton = new JRadioButton();
        maleRadioButton.setText("Male");
        JRadioButton femaleRadioButton = new JRadioButton();
        femaleRadioButton.setText("Female");

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);

        JButton submit = new JButton("SUBMIT");
        ImageIcon imageIcon = new ImageIcon("C:\\JavaLab\\Day10\\ok.jpg");
        JLabel imageLabel = new JLabel(imageIcon);

        add(nameLabel);
        add(nameField);
        add(emailLabel);
        add(emailField);
        add(addressLabel);
        add(addressArea);
        add(subscribeCheckBox);
        add(maleRadioButton);
        add(femaleRadioButton);
        add(submit);
        add(imageLabel);
    }
}

public class RegisterationForm {
    public static void main(String[] args) {
        new Form();
    }
}
