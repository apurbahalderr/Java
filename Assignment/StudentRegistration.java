import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class StudentRegistration extends JFrame implements ActionListener {

    JTextField email, username;
    JPasswordField password, confirmPassword;
    JButton submit;

    StudentRegistration() {

        setTitle("Registration Page");
        setSize(500,500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Background Color
        getContentPane().setBackground(new Color(180,220,170));

        // Panel (White Box)
        JPanel panel = new JPanel();
        panel.setBounds(50,50,380,350);
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);
        add(panel);

        JLabel title = new JLabel("Registration Page");
        title.setBounds(120,20,200,30);
        title.setFont(new Font("Arial",Font.BOLD,16));
        panel.add(title);

        JLabel l1 = new JLabel("Enter Email");
        l1.setBounds(40,80,120,25);
        panel.add(l1);

        email = new JTextField();
        email.setBounds(170,80,150,25);
        panel.add(email);

        JLabel l2 = new JLabel("Enter Username");
        l2.setBounds(40,120,120,25);
        panel.add(l2);

        username = new JTextField();
        username.setBounds(170,120,150,25);
        panel.add(username);

        JLabel l3 = new JLabel("Enter Password");
        l3.setBounds(40,160,120,25);
        panel.add(l3);

        password = new JPasswordField();
        password.setBounds(170,160,150,25);
        panel.add(password);

        JLabel l4 = new JLabel("Confirm Password");
        l4.setBounds(40,200,140,25);
        panel.add(l4);

        confirmPassword = new JPasswordField();
        confirmPassword.setBounds(170,200,150,25);
        panel.add(confirmPassword);

        submit = new JButton("Submit");
        submit.setBounds(140,260,100,30);
        submit.setBackground(new Color(120,180,120));
        submit.setForeground(Color.WHITE);
        submit.setFocusPainted(false);
        panel.add(submit);

        submit.addActionListener(this);


        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        String em = email.getText();
        String user = username.getText();
        String pass = new String(password.getPassword());
        String cpass = new String(confirmPassword.getPassword());

        if(!pass.equals(cpass)){
            JOptionPane.showMessageDialog(this,"Password not matched");
            return;
        }

        try{

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb",
                    "root",
                    "halderog123"
                );

            PreparedStatement ps = con.prepareStatement(
                    "insert into register(email,username,password) values(?,?,?)");

            ps.setString(1, em);
            ps.setString(2, user);
            ps.setString(3, pass);

            ps.executeUpdate();

            new SuccessFrame();

            con.close();

        }catch(Exception ex){
            System.out.println(ex);
        }
    }

    public static void main(String args[]){
        new StudentRegistration();
    }
}


class SuccessFrame extends JFrame{

    SuccessFrame(){

        setTitle("Success");
        setSize(300,200);
        setLayout(null);

        getContentPane().setBackground(new Color(180,220,170));

        JLabel msg = new JLabel("Student Registered Successfully");
        msg.setBounds(40,60,250,30);
        msg.setFont(new Font("Arial",Font.BOLD,14));

        add(msg);

        setVisible(true);
    }
}