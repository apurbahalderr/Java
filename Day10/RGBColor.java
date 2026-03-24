import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RGBColor implements ActionListener {
    JFrame f;
    JComboBox<Integer> r, g, b;
    JButton btn;
    JPanel panel;

    RGBColor() {
        f = new JFrame("RGB Color");

        Integer values[] = new Integer[256];
        for(int i=0;i<256;i++) values[i]=i;

        r = new JComboBox<>(values);
        g = new JComboBox<>(values);
        b = new JComboBox<>(values);

        r.setBounds(50,50,60,30);
        g.setBounds(150,50,60,30);
        b.setBounds(250,50,60,30);

        btn = new JButton("Show Output");
        btn.setBounds(150,100,120,30);

        panel = new JPanel();
        panel.setBounds(0,150,400,200);

        btn.addActionListener(this);

        f.add(r); f.add(g); f.add(b);
        f.add(btn);
        f.add(panel);

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int red = (int) r.getSelectedItem();
        int green = (int) g.getSelectedItem();
        int blue = (int) b.getSelectedItem();

        panel.setBackground(new Color(red, green, blue));
    }

    public static void main(String[] args) {
        new RGBColor();
    }
}