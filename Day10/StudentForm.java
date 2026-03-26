import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StudentForm implements ActionListener {

    JFrame f;
    JTextField name, email, mobile, dob;
    JTextArea address;
    JComboBox<String> school, dept, course;
    JRadioButton male, female;
    JButton submit, reset;

    StudentForm() {

        f = new JFrame("Student Registration Form");
        f.setSize(500, 600);
        f.setLayout(null);
        f.getContentPane().setBackground(Color.RED);
        JLabel title = new JLabel("Student Registration Form");
        title.setBounds(120, 20, 300, 30);

        JLabel l1 = new JLabel("Name:");
        l1.setBounds(50, 80, 100, 30);
        name = new JTextField();
        name.setBounds(180, 80, 200, 30);

        JLabel l2 = new JLabel("DOB:");
        l2.setBounds(50, 120, 100, 30);
         dob = new JTextField("dd/mm/yyyy");
        dob.setBounds(180, 120, 200, 30);

        JLabel l3 = new JLabel("Sex:");
        l3.setBounds(50, 160, 100, 30);

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");

        male.setBounds(180, 160, 70, 30);
        female.setBounds(260, 160, 100, 30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);

        JLabel l4 = new JLabel("Email:");
        l4.setBounds(50, 200, 100, 30);
        email = new JTextField();
        email.setBounds(180, 200, 200, 30);

        JLabel l5 = new JLabel("Address:");
        l5.setBounds(50, 240, 100, 30);
        address = new JTextArea();
        address.setBounds(180, 240, 200, 60);

        JLabel l6 = new JLabel("School:");
        l6.setBounds(50, 320, 100, 30);
        String schools[] = {"Select", "Engineering", "Management", "Law"};
        school = new JComboBox<>(schools);
        school.setBounds(180, 320, 200, 30);

        JLabel l7 = new JLabel("Department:");
        l7.setBounds(50, 360, 100, 30);
        String depts[] = {"CSE", "IT", "ECE"};
        dept = new JComboBox<>(depts);
        dept.setBounds(180, 360, 200, 30);

        JLabel l8 = new JLabel("Course:");
        l8.setBounds(50, 400, 100, 30);
        String courses[] = {"B.Tech", "M.Tech"};
        course = new JComboBox<>(courses);
        course.setBounds(180, 400, 200, 30);

        JLabel l9 = new JLabel("Mobile:");
        l9.setBounds(50, 440, 100, 30);
        mobile = new JTextField();
        mobile.setBounds(180, 440, 200, 30);

        // Buttons
        submit = new JButton("Submit");
        reset = new JButton("Reset");

        submit.setBounds(120, 500, 100, 30);
        reset.setBounds(240, 500, 100, 30);

        submit.addActionListener(this);
        reset.addActionListener(this);

        // Add all
        f.add(title);
        f.add(l1); f.add(name);
        f.add(l2); f.add(dob);
        f.add(l3); f.add(male); f.add(female);
        f.add(l4); f.add(email);
        f.add(l5); f.add(address);
        f.add(l6); f.add(school);
        f.add(l7); f.add(dept);
        f.add(l8); f.add(course);
        f.add(l9); f.add(mobile);
        f.add(submit); f.add(reset);

        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

    if (e.getSource() == submit) {

        String n = name.getText();
        String d = dob.getText();
        String g = male.isSelected() ? "Male" : "Female";
        String em = email.getText();
        String addr = address.getText();
        String sch = (String) school.getSelectedItem();
        String dep = (String) dept.getSelectedItem();
        String cou = (String) course.getSelectedItem();
        String mob = mobile.getText();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");


            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/student",
                    "root",
                    "halderog123"
            );


            Statement stmt = con.createStatement();

            String query = "INSERT INTO students VALUES ('"
                    + n + "', '" + d + "', '" + g + "', '"
                    + em + "', '" + addr + "', '" + sch + "', '"
                    + dep + "', '" + cou + "', '" + mob + "')";

            stmt.executeUpdate(query);

            JOptionPane.showMessageDialog(f, "All Data Saved!");

            con.close();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    if (e.getSource() == reset) {
        name.setText("");
        dob.setText("");
        email.setText("");
        address.setText("");
        mobile.setText("");
        school.setSelectedIndex(0);
        dept.setSelectedIndex(0);
        course.setSelectedIndex(0);
        male.setSelected(false);
        female.setSelected(false);
    }
}

    public static void main(String[] args) {
        new StudentForm();
    }
}