import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorList implements ActionListener {
    JFrame f;
    JList<String> list;
    JButton btn;
    JPanel panel;

    ColorList() {
        f = new JFrame("Color List");

        String colors[] = {"White","Orange","Red","Blue"};
        list = new JList<>(colors);
        list.setBounds(50,50,100,80);

        btn = new JButton("Click");
        btn.setBounds(200,70,100,30);

        panel = new JPanel();
        panel.setBounds(0,150,400,200);

        btn.addActionListener(this);

        f.add(list);
        f.add(btn);
        f.add(panel);

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String color = list.getSelectedValue();

        if(color.equalsIgnoreCase("White"))
            panel.setBackground(Color.WHITE);
        else if(color.equalsIgnoreCase("Orange"))
            panel.setBackground(Color.ORANGE);
        else if(color.equalsIgnoreCase("Red"))
            panel.setBackground(Color.RED);
        else if(color.equalsIgnoreCase("Blue"))
            panel.setBackground(Color.BLUE);
    }

    public static void main(String[] args) {
        new ColorList();
    }
}